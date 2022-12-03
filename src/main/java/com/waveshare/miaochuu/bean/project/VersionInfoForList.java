package com.waveshare.miaochuu.bean.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VersionInfoForList {
    private int VersionID;
    private String VersionDate;
    private int VersionNum;
    private String VideoTitle;
    private int UserID;
    private String UserName;
    private String AvatarUUID;
}
