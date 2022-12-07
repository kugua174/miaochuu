package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Level {
    private int levelID;
    private int levelNum;
    private int needEXP;
    private String rgb;

}
