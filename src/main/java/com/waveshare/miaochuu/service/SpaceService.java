package com.waveshare.miaochuu.service;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;


public interface SpaceService {
    ProjectInfo[] getPinned(int userID);

    ClassifyInfoWithProjectInfo[] classify(int userID);

    ProjectInfo[] projects(int userID);

    Activity[] activities(int userID);

    ProjectInfo[] projectsInFavorite(int favoriteID);

    Classify[] getClassifyInfo(int userID);

    ProjectInfoForClassify[] getProjectInfoForClassify(int classifyID);

    Favorite[] favorites(int userID);

    ProjectInfo[] getProjectsInFavorite(int favoriteID);

    Boolean addClassify(int userID, String classifyName);

    Boolean setClassify(int projectID, int classifyID);

    Boolean updateProject(int projectID, String projectName, int progress, String idea, String videoCollection, int isOpen);

    Boolean updateVersion(int versionID, String videoTitle);

    Boolean updateDescription(int DescriptionUnitID, String content, int serialNum);

    Boolean addFork(int projectID, String forkName);

    Boolean addVersion(int forkID, int userID, String documentUUID, int versionNum, String pushIntroduce, String videoTitle, String videoUUID, String coverUUID);

}