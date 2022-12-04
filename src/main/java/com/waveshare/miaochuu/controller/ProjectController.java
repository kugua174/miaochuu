package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;
import com.waveshare.miaochuu.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    //加载时
    @RequestMapping("/info")
    public Project getInfo(@RequestParam("projectid") int projectID) {
        return projectService.getInfo(projectID);
    }

    @RequestMapping("/version")
    public Version getVersionInfo(@RequestParam("versionid") int versionID) {
        return projectService.getVersionInfo(versionID);
    }

    @RequestMapping("/tags")
    public TagInfo getTagsInfo(@RequestParam("projectid") int projectID) {
        return null;
    }

    @RequestMapping("/description")
    public DescriptionUnit[] getDescriptionsInfo(@RequestParam("versionid") int versionID) {
        return projectService.getDescriptionsInfo(versionID);
    }

    @RequestMapping("/forks")
    public Fork[] forks(@RequestParam("projectid") int projectID) {
        return projectService.forks(projectID);
    }

    @RequestMapping("/versions")
    public VersionInfoForList versions(@RequestParam("forkid") int forkID) {
        return projectService.versions(forkID);
    }

    @RequestMapping("/bulletcomments")
    public BulletComment[] bulletComments(@RequestParam("versionid") int versionID) {
        return projectService.bulletComments(versionID);
    }

    @RequestMapping("/comments")
    public FloorCommentInfo comments(@RequestParam("projectid") int projectID) {
        return projectService.comments(projectID);
    }

    //页内操作
    @RequestMapping("/follow")
    public Boolean follow(@RequestParam("userid") int userID,
                          @RequestParam("targetuserid") int targetUserID) {
        return projectService.follow(userID, targetUserID);
    }

    @RequestMapping("/dir")
    public String[] dir(@RequestParam("DocumentUUID") int documentUUID,
                        @RequestParam("pdir") String PDir) {
        return null;
    }


    @RequestMapping("/favorite")
    public Boolean favorite(@RequestParam("projectid") int projectID,
                            @RequestParam("favoriteid") int favoriteID) {
        return projectService.favorite(projectID, favoriteID);
    }

    @RequestMapping("/addcomment")
    public Boolean addComment(@RequestParam("userid") int userID,
                              @RequestParam("content") String content,
                              @RequestParam("projectid") Integer projectID,
                              @RequestParam("activityid") Integer activityID,
                              @RequestParam("replycommentid") Integer replyCommentID,
                              @RequestParam("floorcommentid") Integer floorCommentID) {
        if (projectID == -1) projectID = null;
        if (activityID == -1) activityID = null;
        if (replyCommentID == -1) replyCommentID = null;
        if (floorCommentID==-1)floorCommentID=null;
        return projectService.addComment(userID, content, projectID, activityID, replyCommentID, floorCommentID);
    }

    @RequestMapping("/addbulletcomment")
    public Boolean addBulletComment(@RequestParam("content") String content,
                                    @RequestParam("sendtime") String sendTime,
                                    @RequestParam("userid") int userID,
                                    @RequestParam("versionid") int versionID) {
        return projectService.addBulletComment(content, sendTime, userID, versionID);
    }
}
