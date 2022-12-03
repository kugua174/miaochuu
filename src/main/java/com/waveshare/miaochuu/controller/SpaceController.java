package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.Activity;
import com.waveshare.miaochuu.bean.Classify;
import com.waveshare.miaochuu.bean.Favorite;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.bean.space.ClassifyInfoWithProjectInfo;
import com.waveshare.miaochuu.bean.space.ProjectInfoForClassify;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/space")
public class SpaceController {
    //加载时
    @RequestMapping("/home/pinned")
    public ProjectInfo[] getPinned(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/home/classify")
    public ClassifyInfoWithProjectInfo[] classify(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/home/projects")
    public ProjectInfo[] projects(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/activities")
    public Activity[] activities(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/favorite/favorites")
    public Favorite[] favorites(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/favorite/projects")
    public ProjectInfo[] getProjectsInFavorite(@RequestParam("favoriteid") int favoriteID) {
        return null;
    }

    @RequestMapping("/repository/classify")
    public Classify[] getClassifyInfo(@RequestParam("userid") int userID) {
        return null;
    }

    @RequestMapping("/repository/classify/projects")
    public ProjectInfoForClassify[] getProjectInfoForClassify(@RequestParam("classifyid") int classifyID) {
        return null;
    }

    //页内操作
    @RequestMapping("/favorite/add")
    public Boolean getProjectsInFavorite(@RequestParam("userid") int userID,
                                         @RequestParam("favoritename") String favoriteID) {
        return null;
    }

    @RequestMapping("/repository/addclassify")
    public Boolean addClassify(@RequestParam("userid") int userID,
                               @RequestParam("classifyname") String classifyName) {
        return null;
    }

    @RequestMapping("/repository/setclassify")
    public Boolean setClassify(@RequestParam("projectid") int projectID,
                               @RequestParam("classifyid") int classifyID) {
        return null;
    }

    @RequestMapping("/repository/updateproject")
    public Boolean updateProject(@RequestParam("projectid") int projectID,
                                 @RequestParam("projectname") String projectName,
                                 @RequestParam("progress") int progress,
                                 @RequestParam("idea") String idea,
                                 @RequestParam("videocollection") String videoCollection,
                                 @RequestParam("isopen") int isOpen) {
        return null;
    }

    @RequestMapping("/repository/updateverson")
    public Boolean updateVersion(@RequestParam("versionid") int versionID,
                                 @RequestParam("videotitle") String videoTitle,
                                 @RequestParam("videouuid") String videoUUID,
                                 @RequestParam("videocoveruuid") String videoCoverUUID,
                                 @RequestPart("video") MultipartFile video,
                                 @RequestPart("videocover") MultipartFile videoCover) {
        return null;
    }

    //页内操作
    @RequestMapping("/repository/updatedescription")
    public Boolean updateDescription(@RequestParam("descriptionunitid") int DescriptionUnitID,
                                     @RequestParam("content") String content,
                                     @RequestParam("imageuuid") String imageUUID,
                                     @RequestPart("img") MultipartFile img,
                                     @RequestParam("serialnum") int serialNum) {
        return null;
    }

    @RequestMapping("/repository/addfork")
    public Boolean addFork(@RequestParam("projectid") int projectID,
                           @RequestParam("forkname") String forkName) {
        return null;
    }

    @RequestMapping("/repository/addversion")
    public Boolean addVersion(@RequestParam("forkid") int forkID,
                              @RequestParam("userid") int userID,
                              @RequestPart("document") MultipartFile[] document,
                              @RequestParam("versionnum") int versionNum,
                              @RequestParam("pushintroduce") String pushIntroduce,
                              @RequestParam("videotitle") String videoTitle,
                              @RequestPart("video") MultipartFile video,
                              @RequestPart("cover") MultipartFile cover) {
        return null;
    }

}