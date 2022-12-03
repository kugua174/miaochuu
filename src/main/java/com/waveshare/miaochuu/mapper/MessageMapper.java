package com.waveshare.miaochuu.mapper;

import com.waveshare.miaochuu.bean.Message;
import com.waveshare.miaochuu.bean.User;
import com.waveshare.miaochuu.bean.message.ProjectInfoFromPush;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    ProjectInfoFromPush[] getPush(int userID);

    ProjectInfoFromPush[] getMyPush(int userID);

    User[] getUsers(int userID);

    Message[] getPush(int userID, int targetUserID);

    int updateAgreeOrNot(int versionID, int isAgree);

    int add(int content, int userID, int targetUserID);
}
