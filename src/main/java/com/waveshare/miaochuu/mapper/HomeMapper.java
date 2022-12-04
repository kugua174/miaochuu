package com.waveshare.miaochuu.mapper;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {
    User getLoginInfo(String userEmail, String userPWD);

    ProjectInfo[] getWorks();

    ApplicationArea[] getAATags();

    PL[] getPLTags();

    OS[] getOSTags();

    Framework[] getFrameworkTags(int plID);

    ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs);

    ProjectInfo[] getWorksByKeyWords(String Keywords);

    int insertSignInInfo(String userName, String userPWD, String userEmail);

    int insertProjectInfo(Project project);

    int insertProjectAndApplicationArea(int PAA_ProjectID, int[] PAA_ApplicationAreaID);

    int insertProjectAndOS(int PO_ProjectID, int[] PO_osID);

    int insertProjectAndFramework(int PFW_ProjectID, int[] PFW_FrameworkID);

    int insertActivity(String ActivityDescription, String ImageUUID, String Date, int Activity_ProjectID);
}
