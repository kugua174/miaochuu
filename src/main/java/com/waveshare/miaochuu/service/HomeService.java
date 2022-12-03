package com.waveshare.miaochuu.service;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;

public interface HomeService {
    User login(int userID, String userPWD);

    ProjectInfo[] getWorks();

    ApplicationArea[] getAATags();

    PL[] getPLTags();

    OS[] getOSTags();

    Framework[] getFrameworkTags();

    ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs);

    ProjectInfo[] getWorksKeyWords(String Keywords);

    Boolean signIn(String userName, String userPWD, String userEmail);

    Boolean createProject(String idea, int applicationAreaID, int frameworkID, int osID, String projectName);

    ;;;


}
