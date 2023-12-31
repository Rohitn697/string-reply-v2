package com.beta.replyservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ReplyController {

	@GetMapping("/reply")
	public ReplyMessage replying() {
		return new ReplyMessage("Message is empty");
	}

	@GetMapping("/reply/{message}")
	public ReplyMessage replying(@PathVariable String message) {
		return new ReplyMessage(message);
	}

	@GetMapping("/v2/reply/{message}")
	public ReplyMessage getReply(@PathVariable String message) {
		try {
			String data = ReplyService.getReply(message);
			return new ReplyMessage(data);
		}
		catch (IllegalArgumentException e){
			return new ReplyMessage(e.getMessage());
		}
	}
}