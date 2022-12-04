package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;
import com.waveshare.miaochuu.mapper.MessageMapper;
import com.waveshare.miaochuu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;

@Service
@Transactional
public class MessageServiceImpl implements MessageService {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Autowired
    MessageMapper messageMapper;

    @Override
    public ProjectInfoFromPush[] getPush(int userID) {
        return messageMapper.getPush(userID);
    }

    @Override
    public ProjectInfoFromPush[] getMyPush(int userID) {
        return messageMapper.getMyPush(userID);
    }

    @Override
    public User[] getUsers(int userID) {
        return messageMapper.getUsers(userID);
    }

    @Override
    public Message[] getMessage(int userID, int targetUserID) {
        return messageMapper.getMessage(userID, targetUserID);
    }

    @Override
    public Boolean agreeOrNot(int versionID, int isAgree) {
        return messageMapper.updateAgreeOrNot(versionID,isAgree)==1;
    }

    @Override
    public Boolean add(String content, int userID, int targetUserID) {
        String date = simpleDateFormat.format(System.currentTimeMillis()).toString();
        return messageMapper.add(content,date,userID,targetUserID)==1;
    }
}
