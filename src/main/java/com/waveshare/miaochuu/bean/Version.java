package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Version {
    private int versionID;
    private int documentUUID;
    private String versionDate;
    private int versionNum;
    private String pushIntroduce;
    private int isCheck;
    private int isAgree;
    private String videoTitle;
    private String videoUUID;
    private String videoCoverUUID;
    private Fork version_Fork;
    private User version_User;

}
