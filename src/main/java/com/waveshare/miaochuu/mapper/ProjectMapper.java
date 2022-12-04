package com.waveshare.miaochuu.mapper;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.project.FloorCommentInfo;
import com.waveshare.miaochuu.bean.project.TagInfo;
import com.waveshare.miaochuu.bean.project.VersionInfoForList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {
    Project getInfo(int projectID);

    Version getVersionInfo(int versionID);

    TagInfo getTagsInfo(int projectID);

    DescriptionUnit[] getDescriptionsInfo(int versionID);

    Fork[] getForks(int projectID);

    VersionInfoForList getVersions(int forkID);

    BulletComment[] getBulletComments(int versionID);

    FloorCommentInfo getComments(int projectID);

    int insertFollowInfo(int userID, int targetUserID);

    int insertProjectInFavorite( int projectID ,int favoriteID);
    int addComment(int userID, String content, String CommentDate,int projectID, int activityID, int replyCommentID, int floorCommentID);

    int addBulletComment(int content,String data, String sendTime, int versionID, int userID);

}
