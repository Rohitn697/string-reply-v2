package com.beta.replyservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplyServiceTest {

  @Test
  void testGetReply() {
    assertEquals("tihor", ReplyService.getReply("1-rohit"));
    assertEquals("2d235ace000a3ad85f590e321c89bb99", ReplyService.getReply("2-rohit"));
    assertEquals("rohit", ReplyService.getReply("11-rohit"));
    assertEquals("574811ad472686f9e11dcf1545c9ad4a", ReplyService.getReply("12-rohit"));
    assertEquals("95f7b9bdbcdccde5ae4c3e22a76348af", ReplyService.getReply("22-rohit"));
  }

  @Test
  void testInvalidInput() {
    assertThrows(IllegalArgumentException.class, () -> ReplyService.getReply("invalid-input"));
    assertThrows(IllegalArgumentException.class, () -> ReplyService.getReply("12-input-23"));
    assertThrows(IllegalArgumentException.class, () -> ReplyService.getReply("13-abc"));
  }
}