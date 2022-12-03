package com.waveshare.miaochuu.bean.space;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectInfoForClassify {
    private int projectID;
    private String projectName;
    private int clickNum;
    private int chuNum;
}
