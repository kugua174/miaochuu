package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @RequestMapping("/push")
    public ProjectInfoFromPush[] getPush(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/mypush")
    public ProjectInfoFromPush[] getMyPush(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/users")
    public User[] getUsers(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/user")
    public Message[] getPush(@RequestParam("userid") int userID,
                             @RequestParam("targetuserid") int targetUserID) {
        return null;
    }

    @RequestMapping("/agree")
    public Boolean agreeOrNot(@RequestParam("versionid") int versionID,
                              @RequestParam("isagree") int isAgree) {
        return null;
    }

    @RequestMapping("/add")
    public Boolean add(@RequestParam("content") int content,
                       @RequestParam("userid") int userID,
                       @RequestParam("targetuserid") int targetUserID) {
        return null;
    }

}
