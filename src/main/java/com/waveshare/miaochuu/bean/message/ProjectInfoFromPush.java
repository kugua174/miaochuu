package com.waveshare.miaochuu.bean.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectInfoFromPush {
    private int versionID;
    private String versionNum;
    private String pushIntroduce;
    private int isCheck;
    private int isAgree;
    private String versionDate;
    private String userName;
    private int userID;
}
