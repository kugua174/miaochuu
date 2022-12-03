package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
    private int projectID;
    private String projectName;
    private int clickNum;
    private int chuNum;
    private int shareNum;
    private int isPin;
    private int isOpen;
    private String creationDate;
    private int progress;
    private String idea;
    private String videoCollection;
    private User user;
}
