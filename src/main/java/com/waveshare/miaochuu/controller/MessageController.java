package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;
import com.waveshare.miaochuu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;
    @RequestMapping("/push")
    public ProjectInfoFromPush[] getPush(@RequestParam("userid") int userID) {
        return messageService.getPush(userID);
    }

    @RequestMapping("/mypush")
    public ProjectInfoFromPush[] getMyPush(@RequestParam("userid") int userID) {
        return messageService.getMyPush(userID);
    }

    @RequestMapping("/users")
    public User[] getUsers(@RequestParam("userid") int userID) {
        return messageService.getUsers(userID);
    }

    @RequestMapping("/user")
    public Message[] getMessage(@RequestParam("userid") int userID,
                             @RequestParam("targetuserid") int targetUserID) {
        return messageService.getMessage(userID, targetUserID);
    }

    @RequestMapping("/agree")
    public Boolean agreeOrNot(@RequestParam("versionid") int versionID,
                              @RequestParam("isagree") int isAgree) {
        return messageService.agreeOrNot(versionID, isAgree);
    }

    @RequestMapping("/add")
    public Boolean add(@RequestParam("content") String content,
                       @RequestParam("userid") int userID,
                       @RequestParam("targetuserid") int targetUserID) {
        return messageService.add(content, userID, targetUserID);
    }

}
