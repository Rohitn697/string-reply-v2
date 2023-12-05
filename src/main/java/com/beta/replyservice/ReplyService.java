package com.beta.replyservice;

import java.math.BigInteger;
import java.security.MessageDigest;

public class ReplyService {
  public static String getReply(String userInput) {
    String[] components = userInput.split("-");
    if (components.length != 2 || !components[0].matches("[12]+")) {
      throw new IllegalArgumentException("Invalid input");
    }

    String processedString = components[1];

    for (char operation : components[0].toCharArray()) {
      switch (operation) {
        case '1':
          processedString = new StringBuilder(processedString).reverse().toString();
          break;
        case '2':
          processedString = calculateHashMD5(processedString);
          break;
      }
    }

    return processedString;
  }

  private static String calculateHashMD5(String input) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance("MD5");
      byte[] messageDigestBytes = messageDigest.digest(input.getBytes());
      BigInteger numericHash = new BigInteger(1, messageDigestBytes);
      return numericHash.toString(16);
    } catch (Exception e) {
      throw new RuntimeException("MD5 calculation error", e);
    }
  }


}
