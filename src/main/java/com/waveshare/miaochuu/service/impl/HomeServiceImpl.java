package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.service.HomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public User login(int userID, String userPWD) {
        return null;
    }

    @Override
    public ProjectInfo[] getWorks() {
        return new ProjectInfo[0];
    }

    @Override
    public ApplicationArea[] getAATags() {
        return new ApplicationArea[0];
    }

    @Override
    public PL[] getPLTags() {
        return new PL[0];
    }

    @Override
    public OS[] getOSTags() {
        return new OS[0];
    }

    @Override
    public Framework[] getFrameworkTags() {
        return new Framework[0];
    }

    @Override
    public ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs) {
        return new ProjectInfo[0];
    }

    @Override
    public ProjectInfo[] getWorksKeyWords(String Keywords) {
        return new ProjectInfo[0];
    }

    @Override
    public Boolean signIn(String userName, String userPWD, String userEmail) {
        return null;
    }

    @Override
    public Boolean createProject(String idea, int applicationAreaID, int frameworkID, int osID, String projectName) {
        return null;
    }
}
