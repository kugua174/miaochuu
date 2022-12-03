package com.waveshare.miaochuu.bean.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PLInfo {
    private int plID;
    private String plName;
    private String[] frameworkName;
}
