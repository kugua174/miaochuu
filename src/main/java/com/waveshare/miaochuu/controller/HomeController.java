package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    //加载时
    @RequestMapping("/login")
    public User login(@RequestParam("userid") int userID, @RequestParam("userpwd") String userPWD) {

        return null;
    }

    @RequestMapping("/getworks")
    public ProjectInfo[] getWorks() {
        return null;
    }

    @RequestMapping("/getaatags")
    public ApplicationArea[] getAATags() {
        return null;
    }

    @RequestMapping("/getpltags")
    public PL[] getPLTags() {
        return null;
    }

    @RequestMapping("/getostags")
    public OS[] getOSTags() {
        return null;
    }

    @RequestMapping("/getframeworktags")
    public Framework[] getFrameworkTags() {
        return null;
    }

    //页内操作
    @RequestMapping("/getworksbytag")
    public ProjectInfo[] getWorksByTag(@RequestParam("aatagids") Integer[] AATagIDs,
                                  @RequestParam("osids") Integer[] OSTagIDs,
                                  @RequestParam("frameworkids") Integer[] frameworkIDs) {
        return null;
    }

    @RequestMapping("/getworksbykeywords")
    public ProjectInfo[] getWorksKeyWords(@RequestParam("Keywords") String Keywords) {
        return null;
    }

    @RequestMapping("/signin")
    public Boolean signIn(@RequestParam("username") String userName,
                          @RequestParam("userpwd") String userPWD,
                          @RequestParam("useremail") String userEmail) {
        return null;
    }

    @RequestMapping("/logout")
    public Boolean logOut() {
        return null;
    }

    @RequestMapping("/createproject")
    public Boolean createProject(@RequestParam("idea") String idea,
                                     @RequestParam("applicationareaid") int applicationAreaID,
                                     @RequestParam("frameworkid") int frameworkID,
                                     @RequestParam("osid") int osID,
                                     @RequestParam("projectname") String projectName) {
        return null;
    }
}
