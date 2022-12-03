package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fork {
    private int forkID;
    private String forkName;
    private int IsMain;
    private Project fork_Project;
}
