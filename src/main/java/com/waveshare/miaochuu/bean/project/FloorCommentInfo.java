package com.waveshare.miaochuu.bean.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FloorCommentInfo {
    private String userName;
    private int userID;
    private int levelNum;
    private String avatarUUID;
    private String rgb;
    private String content;
    private String commentDate;
    private int thumbsUpNum;
    private int thumbsDownNum;
    private ReplyCommentInfo[] replyCommentInfos;
}
