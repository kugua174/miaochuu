package com.waveshare.miaochuu.service;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;

public interface MessageService {
    ProjectInfoFromPush[] getPush(int userID);

    ProjectInfoFromPush[] getMyPush(int userID);

    User[] getUsers(int userID);

    Message[] getPush(int userID, int targetUserID);

    Boolean agreeOrNot(int versionID, int isAgree);

    Boolean add(int content, int userID, int targetUserID);

}
