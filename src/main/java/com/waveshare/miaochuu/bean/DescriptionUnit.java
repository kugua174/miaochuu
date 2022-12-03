package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DescriptionUnit {
    private int descriptionUnitID;
    private String content;
    private String imageUUID;
    private int serialNum;
    private Version describeUnit_Version;
}
