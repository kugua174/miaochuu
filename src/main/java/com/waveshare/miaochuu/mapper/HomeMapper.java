package com.waveshare.miaochuu.mapper;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {
    User getLoginInfo(int userID, String userPWD);

    ProjectInfo[] getWorks();

    ApplicationArea[] getAATags();

    PL[] getPLTags();

    OS[] getOSTags();

    Framework[] getFrameworkTags();

    ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs);

    ProjectInfo[] getWorksByKeyWords(String Keywords);

    int insertSignInInfo(String userName, String userPWD, String userEmail);

    int createProject(String idea, int applicationAreaID, int frameworkID, int osID, String projectName);

}
