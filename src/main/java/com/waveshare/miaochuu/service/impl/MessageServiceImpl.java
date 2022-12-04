package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;
import com.waveshare.miaochuu.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {
    @Override
    public ProjectInfoFromPush[] getPush(int userID) {
        return new ProjectInfoFromPush[0];
    }

    @Override
    public ProjectInfoFromPush[] getMyPush(int userID) {
        return new ProjectInfoFromPush[0];
    }

    @Override
    public User[] getUsers(int userID) {
        return new User[0];
    }

    @Override
    public Message[] getPush(int userID, int targetUserID) {
        return new Message[0];
    }

    @Override
    public Boolean agreeOrNot(int versionID, int isAgree) {
        return null;
    }

    @Override
    public Boolean add(int content, int userID, int targetUserID) {
        return null;
    }
}
