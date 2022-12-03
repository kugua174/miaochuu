package com.waveshare.miaochuu.bean.space;

import com.waveshare.miaochuu.bean.home.ProjectInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassifyInfoWithProjectInfo {
    private String classifyName;
    private ProjectInfo[] projectInfos;
}
