package com.waveshare.miaochuu.bean.project;

import com.waveshare.miaochuu.bean.ApplicationArea;
import com.waveshare.miaochuu.bean.OS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagInfo {
    private ApplicationArea[]applicationAreas;
    private OS[] oss;
    private PLInfo[] plInfos;
}
