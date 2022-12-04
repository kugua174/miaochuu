package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;
import com.waveshare.miaochuu.service.SpaceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpaceServiceImpl implements SpaceService {
    @Override
    public ProjectInfo[] getPinned(int userID) {
        return new ProjectInfo[0];
    }

    @Override
    public ClassifyInfoWithProjectInfo[] classify(int userID) {
        return new ClassifyInfoWithProjectInfo[0];
    }

    @Override
    public ProjectInfo[] projects(int userID) {
        return new ProjectInfo[0];
    }

    @Override
    public Activity[] activities(int userID) {
        return new Activity[0];
    }

    @Override
    public ProjectInfo[] projectsInFavorite(int favoriteID) {
        return new ProjectInfo[0];
    }

    @Override
    public Classify[] getClassifyInfo(int userID) {
        return new Classify[0];
    }

    @Override
    public ProjectInfoForClassify[] getProjectInfoForClassify(int classifyID) {
        return new ProjectInfoForClassify[0];
    }

    @Override
    public Favorite[] favorites(int userID) {
        return new Favorite[0];
    }

    @Override
    public ProjectInfo[] getProjectsInFavorite(int favoriteID) {
        return null;
    }

    @Override
    public Boolean addClassify(int userID, String classifyName) {
        return null;
    }

    @Override
    public Boolean setClassify(int projectID, int classifyID) {
        return null;
    }

    @Override
    public Boolean updateProject(int projectID, String projectName, int progress, String idea, String videoCollection, int isOpen) {
        return null;
    }

    @Override
    public Boolean updateVersion(int versionID, String videoTitle) {
        return null;
    }

    @Override
    public Boolean updateDescription(int DescriptionUnitID, String content, int serialNum) {
        return null;
    }

    @Override
    public Boolean addFork(int projectID, String forkName) {
        return null;
    }

    @Override
    public Boolean addVersion(int forkID, int userID, String documentUUID, int versionNum, String pushIntroduce, String videoTitle, String videoUUID, String coverUUID) {
        return null;
    }
}
