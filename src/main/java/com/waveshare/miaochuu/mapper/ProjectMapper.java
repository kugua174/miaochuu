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

    VersionInfoForList[] getVersions(int forkID);

    BulletComment[] getBulletComments(int versionID);

    FloorCommentInfo getComments(int projectID);

    int insertFollowInfo(int userID, int targetUserID);

    int insertProjectInFavorite( int favoriteID ,int projectID);
    int addComment(int userID, String content, String CommentDate,Integer projectID, Integer activityID, Integer replyCommentID, Integer floorCommentID);

    int addBulletComment(String content,String date, String sendTime, int versionID, int userID);

}
