package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;
import com.waveshare.miaochuu.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Override
    public Project getInfo(int projectID) {
        return null;
    }

    @Override
    public Version getVersionInfo(int versionID) {
        return null;
    }

    @Override
    public TagInfo getTagsInfo(int projectID) {
        return null;
    }

    @Override
    public DescriptionUnit[] getDescriptionsInfo(int versionID) {
        return new DescriptionUnit[0];
    }

    @Override
    public Fork[] forks(int projectID) {
        return new Fork[0];
    }

    @Override
    public VersionInfoForList versions(int forkID) {
        return null;
    }

    @Override
    public BulletComment[] bulletComments(int versionID) {
        return new BulletComment[0];
    }

    @Override
    public FloorCommentInfo comments(int projectID) {
        return null;
    }

    @Override
    public Boolean follow(int userID, int targetUserID) {
        return null;
    }

    @Override
    public Boolean favorite(int projectID, int favoriteID) {
        return null;
    }

    @Override
    public Boolean addComment(int userID, String content, int projectID, int activityID, int replyCommentID, int floorCommentID) {
        return null;
    }

    @Override
    public Boolean addBulletComment(int content, String sendTime, int userID, int versionID) {
        return null;
    }
}
