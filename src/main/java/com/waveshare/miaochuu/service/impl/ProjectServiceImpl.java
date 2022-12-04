package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;
import com.waveshare.miaochuu.mapper.ProjectMapper;
import com.waveshare.miaochuu.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Autowired
    ProjectMapper projectMapper;
    @Override
    public Project getInfo(int projectID) {
        return projectMapper.getInfo(projectID);
    }

    @Override
    public Version getVersionInfo(int versionID) {
        return projectMapper.getVersionInfo(versionID);
    }

    @Override
    public TagInfo getTagsInfo(int projectID) {
        return null;
    }

    @Override
    public DescriptionUnit[] getDescriptionsInfo(int versionID) {
        return projectMapper.getDescriptionsInfo(versionID);
    }

    @Override
    public Fork[] forks(int projectID) {
        return projectMapper.getForks(projectID);
    }

    @Override
    public VersionInfoForList versions(int forkID) {
        return projectMapper.getVersions(forkID);
    }

    @Override
    public BulletComment[] bulletComments(int versionID) {
        return projectMapper.getBulletComments(versionID);
    }

    @Override
    public FloorCommentInfo comments(int projectID) {
        return null;
    }

    @Override
    public Boolean follow(int userID, int targetUserID) {
        return projectMapper.insertFollowInfo(userID,targetUserID)==1;
    }

    @Override
    public Boolean favorite(int projectID, int favoriteID) {
        return projectMapper.insertProjectInFavorite(favoriteID,projectID)==1;
    }

    @Override
    public Boolean addComment(int userID, String content, Integer projectID, Integer activityID, Integer replyCommentID, Integer floorCommentID) {
        String date = simpleDateFormat.format(System.currentTimeMillis()).toString();
        return projectMapper.addComment(userID,content,date,projectID,activityID,replyCommentID,floorCommentID)==1;
    }

    @Override
    public Boolean addBulletComment(String content, String sendTime, int userID, int versionID) {
        String date = simpleDateFormat.format(System.currentTimeMillis()).toString();
        return projectMapper.addBulletComment(content,date, sendTime,versionID,userID)==1;
    }
}
