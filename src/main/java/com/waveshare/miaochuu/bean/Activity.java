package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Activity {
    private int activityID;
    private String ImageUUID;
    private String ActivityDescription;
    private int ThumbsUpNum;
    private String Date;
    private Project Activity_ProjectID;
    private Version Activity_VersionID;
    private User Activity_UserID;

}
