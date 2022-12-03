package com.waveshare.miaochuu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userID;
    private String userName;
    private String userEmail;
    private String userPWD;
    private String avatarUUID;
    private String stateMassage;
    private int exp;
    private Level level ;

}
