package com.waveshare.miaochuu.controller;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    //加载时
    @RequestMapping("/login")
    public User login(@RequestParam("useremail") String userEmail, @RequestParam("userpwd") String userPWD, HttpServletResponse response) {
        User user = homeService.login(userEmail, userPWD);
        String userName = user.getUserName();
        if (userName != null) {
            Cookie cookieForEmail = new Cookie("useremail", userEmail);
            cookieForEmail.setDomain("localhost");
            cookieForEmail.setMaxAge(60 * 60 * 24 * 7);
            cookieForEmail.setPath("/");
            Cookie cookieForPWD = new Cookie("userpwd", userPWD);
            cookieForPWD.setDomain("localhost");
            cookieForPWD.setMaxAge(60 * 60 * 24 * 7);
            cookieForPWD.setPath("/");
            response.addCookie(cookieForEmail);
            response.addCookie(cookieForPWD);
        }
        return user;
    }

    @RequestMapping("/getworks")
    public ProjectInfo[] getWorks() {
        return homeService.getWorks();
    }

    @RequestMapping("/getaatags")
    public ApplicationArea[] getAATags() {
        return homeService.getAATags();
    }

    @RequestMapping("/getpltags")
    public PL[] getPLTags() {
        return homeService.getPLTags();
    }

    @RequestMapping("/getostags")
    public OS[] getOSTags() {
        return homeService.getOSTags();
    }

    @RequestMapping("/getframeworktags")
    public Framework[] getFrameworkTags(@RequestParam("plid") int plID) {
        return homeService.getFrameworkTags(plID);
    }

    //页内操作
    @RequestMapping("/getworksbytag")
    public ProjectInfo[] getWorksByTag(@RequestParam("aatagids") Integer[] AATagIDs,
                                       @RequestParam("osids") Integer[] OSTagIDs,
                                       @RequestParam("frameworkids") Integer[] frameworkIDs) {
        return homeService.getWorksByTag(AATagIDs, OSTagIDs, frameworkIDs);
    }

    @RequestMapping("/getworksbykeywords")
    public ProjectInfo[] getWorksKeyWords(@RequestParam("Keywords") String keywords) {
        return homeService.getWorksKeyWords(keywords);
    }

    @RequestMapping("/signin")
    public Boolean signIn(@RequestParam("username") String userName,
                          @RequestParam("userpwd") String userPWD,
                          @RequestParam("useremail") String userEmail) {
        if (userName == null || userPWD.length() < 6 || userEmail == null) {
            return false;
        }
        return homeService.signIn(userName, userPWD, userEmail);
    }

    @RequestMapping("/logout")
    public Boolean logOut() {
        return null;
    }

    @RequestMapping("/createproject")
    public Boolean createProject(@RequestParam("userid") int userID,
                                 @RequestParam("idea") String idea,
                                 @RequestParam("applicationareaid") int[] applicationAreaID,
                                 @RequestParam("frameworkid") int[] frameworkID,
                                 @RequestParam("osid") int[] osID,
                                 @RequestParam("projectname") String projectName,
                                 @RequestParam("activitydescription") String activityDescription,
                                 @RequestPart("image") MultipartFile image,
                                 @RequestParam("isopen") int isOpen) {
        String imageUUID = null;
        if (image != null) {
            imageUUID = UUID.randomUUID().toString();
        }
        return homeService.createProject(userID, idea, applicationAreaID, frameworkID, osID, projectName, activityDescription, isOpen, imageUUID);

    }
}
