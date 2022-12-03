package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    //加载时
    @RequestMapping("/info")
    public Project getInfo(@RequestParam("projectid") int projectID) {
        return null;
    }

    @RequestMapping("/version")
        public Version getVersionInfo(@RequestParam("versionid") int versionID) {
        return null;
    }

    @RequestMapping("/tags")
    public TagInfo getTagsInfo(@RequestParam("projectid") int projectID) {
        return null;
    }

    @RequestMapping("/description")
    public DescriptionUnit[] getDescriptionsInfo(@RequestParam("versionid") int versionID) {
        return null;
    }

    @RequestMapping("/forks")
    public Fork[] forks(@RequestParam("projectid") int projectID) {
        return null;
    }

    @RequestMapping("/versions")
    public VersionInfoForList versions(@RequestParam("forkid") int forkID) {
        return null;
    }

    @RequestMapping("/bulletcomments")
    public BulletComment[] bulletComments(@RequestParam("versionid") int versionID) {
        return null;
    }

    @RequestMapping("/comments")
    public FloorCommentInfo comments(@RequestParam("projectid") int projectID) {
        return null;
    }

//页内操作
    @RequestMapping("/follow")
    public Boolean follow(@RequestParam("userid") int userID,
                          @RequestParam("targetuserid") int targetUserID) {
        return null;
    }

    @RequestMapping("/dir")
    public String[] dir(@RequestParam("DocumentUUID") int documentUUID,
                       @RequestParam("pdir")String PDir) {
        return null;
    }


    @RequestMapping("/favorite")
    public Boolean favorite(@RequestParam("projectid") int projectID,
                          @RequestParam("favoriteid") int favoriteID) {
        return null;
    }

    @RequestMapping("/addcomment")
    public Boolean addComment(@RequestParam("userid") int userID,
                              @RequestParam("content")String content,
                              @RequestParam("projectid")int projectID,
                              @RequestParam("activityid")int activityID,
                              @RequestParam("replycommentid")int replyCommentID,
                              @RequestParam("floorcommentid")int floorCommentID) {
        return null;
    }

    @RequestMapping("/addbulletcomment")
    public Boolean addBulletComment(@RequestParam("content") int content,
                                    @RequestParam("sendtime")String sendTime,
                                    @RequestParam("userid")int userID,
                                    @RequestParam("versionid")int versionID) {
        return null;
    }
}
