package com.waveshare.miaochuu.service;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;

public interface HomeService {
    User login(String userEmail, String userPWD);

    ProjectInfo[] getWorks();

    ApplicationArea[] getAATags();

    PL[] getPLTags();

    OS[] getOSTags();

    Framework[] getFrameworkTags(int plID);

    ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs);

    ProjectInfo[] getWorksKeyWords(String Keywords);

    Boolean signIn(String userName, String userPWD, String userEmail);

    Boolean createProject(int userID,String idea, int[] applicationAreaID, int[] frameworkID, int[] osID, String projectName, String ActivityDescription, int isOpen,String imageUUID);

    ;;;


}
