package com.waveshare.miaochuu.bean.home;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectInfo {
    private int projectID;
    private int versionID;
    private int videoCoverUUID;
    private int videoUUID;
    private String content;
    private String idea;
    private int imageUUID;
    private String projectName;
    private int progress;
    private String userName;
    private int userID;
    private String versionDate;
    private int clickNum;
    private int chuNum;
}
