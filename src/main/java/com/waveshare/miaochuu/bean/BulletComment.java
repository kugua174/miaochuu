package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BulletComment {
    private String Content;
    private String Date;
    private String SendTime;
    private int BulletComment_VersionID;
    private int BulletComment_UserID;
}
