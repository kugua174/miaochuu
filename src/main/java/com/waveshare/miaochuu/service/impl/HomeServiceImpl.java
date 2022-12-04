package com.waveshare.miaochuu.service.impl;

import com.waveshare.miaochuu.bean.*;
import com.waveshare.miaochuu.bean.home.ProjectInfo;
import com.waveshare.miaochuu.mapper.HomeMapper;
import com.waveshare.miaochuu.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.SimpleDateFormat;

@Service
@Transactional
@Slf4j
public class HomeServiceImpl implements HomeService {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Autowired
    private HomeMapper homeMapper;

    @Override
    public User login(String userEmail, String userPWD) {
        User loginInfo = homeMapper.getLoginInfo(userEmail, userPWD);
        return loginInfo;
    }

    @Override
    public ProjectInfo[] getWorks() {
        return homeMapper.getWorks();
    }

    @Override
    public ApplicationArea[] getAATags() {
        return homeMapper.getAATags();
    }

    @Override
    public PL[] getPLTags() {
        return homeMapper.getPLTags();
    }

    @Override
    public OS[] getOSTags() {
        return homeMapper.getOSTags();
    }

    @Override
    public Framework[] getFrameworkTags(int plID) {
        return homeMapper.getFrameworkTags(plID);
    }

    @Override
    public ProjectInfo[] getWorksByTag(Integer[] AATagIDs, Integer[] OSTagIDs, Integer[] frameworkIDs) {
        return homeMapper.getWorksByTag(AATagIDs, OSTagIDs, frameworkIDs);
    }

    @Override
    public ProjectInfo[] getWorksKeyWords(String keywords) {
        return homeMapper.getWorksByKeyWords(keywords);
    }

    @Override
    public Boolean signIn(String userName, String userPWD, String userEmail) {
        return homeMapper.insertSignInInfo(userName, userPWD, userEmail) == 1;
    }

    @Transactional
    @Override
    public Boolean createProject(int userID, String idea, int[] applicationAreaID, int[] frameworkID,
                                 int[] osID, String projectName, String activityDescription, int isOpen, String imgUUID) {
        int count = 0;
        String createDate = simpleDateFormat.format(System.currentTimeMillis());
        User user = new User(userID, null, null, null, null, null, 1, null);
        Project project = new Project(0, projectName, 0, 0, 0, 0, isOpen, createDate, 0, idea, null, user);
        count += homeMapper.insertProjectInfo(project);
        count += homeMapper.insertProjectAndOS(project.getProjectID(), osID);
        count += homeMapper.insertProjectAndFramework(project.getProjectID(), frameworkID);
        count += homeMapper.insertProjectAndApplicationArea(project.getProjectID(), applicationAreaID);
        count += homeMapper.insertActivity(activityDescription, imgUUID, createDate, project.getProjectID());
        if(count!=5){
            log.info("用户:"+userID+" 创建项目失败;"+" count:"+count);
//            TransactionAspectSupport.currentTransactionStatus().isRollbackOnly();
            throw new RuntimeException("用户:"+userID+" 创建项目失败");
        }
        return count == 5;
    }


}
