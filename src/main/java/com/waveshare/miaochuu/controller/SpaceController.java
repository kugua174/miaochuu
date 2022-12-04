package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;
import com.waveshare.miaochuu.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequestMapping("/space")
public class SpaceController {
    @Autowired
    SpaceService spaceService;

    //加载时
    @RequestMapping("/home/pinned")
    public ProjectInfo[] getPinned(@RequestParam("userid") int userID) {
        return spaceService.getPinned(userID);
    }

    @RequestMapping("/home/classify")
    public ClassifyInfoWithProjectInfo[] classify(@RequestParam("userid") int userID) {
        return spaceService.classify(userID);
    }

    @RequestMapping("/home/projects")
    public ProjectInfo[] projects(@RequestParam("userid") int userID) {
        return spaceService.projects(userID);
    }

    @RequestMapping("/activities")
    public Activity[] activities(@RequestParam("userid") int userID) {
        return spaceService.activities(userID);
    }

    @RequestMapping("/favorite/favorites")
    public Favorite[] favorites(@RequestParam("userid") int userID) {
        return spaceService.favorites(userID);
    }

    @RequestMapping("/favorite/projects")
    public ProjectInfo[] getProjectsInFavorite(@RequestParam("favoriteid") int favoriteID) {
        return spaceService.getProjectsInFavorite(favoriteID);
    }

    @RequestMapping("/repository/classify")
    public Classify[] getClassifyInfo(@RequestParam("userid") int userID) {
        return spaceService.getClassifyInfo(userID);
    }

    @RequestMapping("/repository/classify/projects")
    public ProjectInfoForClassify[] getProjectInfoForClassify(@RequestParam("classifyid") int classifyID) {
        return spaceService.getProjectInfoForClassify(classifyID);
    }

    //页内操作
    @RequestMapping("/favorite/add")
    public Boolean addFavorite(@RequestParam("userid") int userID,
                               @RequestParam("favoritename") String favoriteName) {
        return spaceService.addFavorite(userID, favoriteName);
    }

    @RequestMapping("/repository/addclassify")
    public Boolean addClassify(@RequestParam("userid") int userID,
                               @RequestParam("classifyname") String classifyName) {
        return spaceService.addClassify(userID, classifyName);
    }

    @RequestMapping("/repository/setclassify")
    public Boolean setClassify(@RequestParam("projectid") int projectID,
                               @RequestParam("classifyid") int classifyID) {
        return spaceService.setClassify(projectID, classifyID);
    }

    @RequestMapping("/repository/updateproject")
    public Boolean updateProject(@RequestParam("projectid") int projectID,
                                 @RequestParam("projectname") String projectName,
                                 @RequestParam("progress") int progress,
                                 @RequestParam("idea") String idea,
                                 @RequestParam("videocollection") String videoCollection,
                                 @RequestParam("isopen") int isOpen) {
        return spaceService.updateProject(projectID, projectName, progress, idea, videoCollection, isOpen);
    }

    @RequestMapping("/repository/updateverson")
    public Boolean updateVersion(@RequestParam("versionid") int versionID,
                                 @RequestParam("videotitle") String videoTitle,
                                 @RequestParam("videouuid") String videoUUID,
                                 @RequestParam("videocoveruuid") String videoCoverUUID,
                                 @RequestPart("video") MultipartFile video,
                                 @RequestPart("videocover") MultipartFile videoCover) {
        return spaceService.updateVersion(versionID, videoTitle);
    }

    //页内操作
    @RequestMapping("/repository/updatedescription")
    public Boolean updateDescription(@RequestParam("descriptionunitid") int descriptionUnitID,
                                     @RequestParam("content") String content,
                                     @RequestParam("imageuuid") String imageUUID,
                                     @RequestPart("img") MultipartFile img,
                                     @RequestParam("serialnum") int serialNum) {
        return spaceService.updateDescription(descriptionUnitID, content, serialNum);
    }

    @RequestMapping("/repository/addfork")
    public Boolean addFork(@RequestParam("projectid") int projectID,
                           @RequestParam("forkname") String forkName) {
        return spaceService.addFork(projectID, forkName);
    }

    @RequestMapping("/repository/addversion")
    public Boolean addVersion(@RequestParam("forkid") int forkID,
                              @RequestParam("userid") Integer userID,
                              @RequestPart("document") MultipartFile[] document,
                              @RequestParam("versionnum") String versionNum,
                              @RequestParam("pushintroduce") String pushIntroduce,
                              @RequestParam("videotitle") String videoTitle,
                              @RequestPart("video") MultipartFile video,
                              @RequestPart("cover") MultipartFile cover) {
        String documentUUID = null;
        String videoUUID = null;
        String coverUUID = null;
        if(userID==-1)userID=null;
        if (document != null) {
            documentUUID = UUID.randomUUID().toString();
        }
        if (video != null) {
            videoUUID = UUID.randomUUID().toString();
        }
        if (cover != null) {
            coverUUID = UUID.randomUUID().toString();
        }
            return spaceService.addVersion(forkID, userID, documentUUID, versionNum, pushIntroduce, videoTitle, videoUUID, coverUUID);
    }

}
