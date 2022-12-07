package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;
import com.waveshare.miaochuu.mapper.SpaceMapper;
import com.waveshare.miaochuu.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;

@Service
@Transactional
public class SpaceServiceImpl implements SpaceService {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Autowired
    SpaceMapper spaceMapper;


    @Override
    public ProjectInfo[] getPinned(int userID) {
        return spaceMapper.getPinned(userID);
    }

    @Override
    public ClassifyInfoWithProjectInfo[] classify(int userID) {
        return spaceMapper.getClassifyInfoWithProjectInfo(userID);
    }

    @Override
    public ProjectInfo[] projects(int userID) {
        return spaceMapper.getProjects(userID);
    }

    @Override
    public Activity[] activities(int userID) {
        return spaceMapper.getActivities(userID);
    }

    @Override
    public ProjectInfo[] projectsInFavorite(int favoriteID) {
        return spaceMapper.getProjectsInFavorite(favoriteID);
    }

    @Override
    public Classify[] getClassifyInfo(int userID) {
        return spaceMapper.getClassifyInfo(userID);
    }

    @Override
    public ProjectInfoForClassify[] getProjectInfoForClassify(int classifyID) {
        return spaceMapper.getProjectInfoForClassify(classifyID);
    }

    @Override
    public Favorite[] favorites(int userID) {
        return spaceMapper.getFavorites(userID);
    }

    @Override
    public ProjectInfo[] getProjectsInFavorite(int favoriteID) {
        return spaceMapper.getProjectsInFavorite(favoriteID);
    }

    @Override
    public Boolean addFavorite(int userID, String favoriteName) {
        return spaceMapper.addFavorite(userID, favoriteName) == 1;
    }

    @Override
    public boolean setPin(int projectID) {
        return spaceMapper.setPin(projectID) == 1;
    }

    @Override
    public Boolean addClassify(int userID, String classifyName) {
        return spaceMapper.addClassify(userID, classifyName) == 1;
    }

    @Override
    public Boolean setClassify(int projectID, int classifyID) {
        return spaceMapper.setClassify(projectID, classifyID) == 1;
    }

    @Override
    public Boolean updateProject(int projectID, String projectName, int progress, String idea, String videoCollection, int isOpen) {
        return spaceMapper.updateProject(projectID, projectName, progress, idea, videoCollection, isOpen) == 1;
    }

    @Override
    public Boolean updateVersion(int versionID, String videoTitle) {
        return spaceMapper.updateVersion(versionID, videoTitle) == 1;
    }

    @Override
    public Boolean updateDescription(int DescriptionUnitID, String content, int serialNum) {
        return spaceMapper.updateDescription(DescriptionUnitID, content, serialNum) == 1;
    }

    @Override
    public Boolean addFork(int projectID, String forkName) {
        return spaceMapper.addFork(projectID, forkName) == 1;
    }

    @Override
    public Boolean addVersion(int forkID, Integer userID, String documentUUID, String versionNum, String pushIntroduce, String videoTitle, String videoUUID, String coverUUID) {
        String date = simpleDateFormat.format(System.currentTimeMillis()).toString();
        return spaceMapper.addVersion(forkID, userID, date, documentUUID, versionNum, pushIntroduce, videoTitle, videoUUID, coverUUID) == 1;
    }
}
