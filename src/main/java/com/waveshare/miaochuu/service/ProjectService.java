package com.waveshare.miaochuu.service;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;

public interface ProjectService {
    Project getInfo(int projectID);

    Version getVersionInfo(int versionID);

    TagInfo getTagsInfo(int projectID);

    DescriptionUnit[] getDescriptionsInfo(int versionID);

    Fork[] forks(int projectID);

    VersionInfoForList versions(int forkID);

    BulletComment[] bulletComments(int versionID);

    FloorCommentInfo comments(int projectID);

    Boolean follow(int userID, int targetUserID);

    Boolean favorite(int projectID, int favoriteID);

    Boolean addComment(int userID, String content, Integer projectID, Integer activityID, Integer replyCommentID, Integer floorCommentID);

    Boolean addBulletComment(String content, String sendTime, int userID, int versionID);

}
