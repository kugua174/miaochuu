package com.waveshare.miaochuu.mapper;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpaceMapper {
    ProjectInfo[] getPinned(int userID);

    ClassifyInfoWithProjectInfo[] getClassifyInfoWithProjectInfo(int userID);

    ProjectInfo[] getProjects(int userID);

    Activity[] getActivities(int userID);


    Classify[] getClassifyInfo(int userID);

    ProjectInfoForClassify[] getProjectInfoForClassify(int classifyID);

    Favorite[] getFavorites(int userID);

    ProjectInfo[] getProjectsInFavorite(int favoriteID);

    int addClassify(int userID, String classifyName);

    int setClassify(int projectID, int classifyID);

    int updateProject(int projectID, String projectName, int progress, String idea, String videoCollection, int isOpen);

    int updateVersion(int versionID, String videoTitle);

    int updateDescription(int DescriptionUnitID, String content, int serialNum);

    int addFork(int projectID, String forkName);

    int addVersion(int forkID, int userID, String documentUUID, int versionNum, String pushIntroduce, String videoTitle, String videoUUID, String coverUUID);

}
