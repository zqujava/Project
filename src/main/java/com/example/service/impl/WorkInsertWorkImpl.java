package com.example.service.impl;

import com.example.dao.WorkInsertDao;
import com.example.domain.RewardPunish;
import com.example.domain.Staff;
import com.example.domain.Training;
import com.example.service.WorkInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luo
 */
@Service
public class WorkInsertWorkImpl implements WorkInsertService {

    @Autowired
    private WorkInsertDao workInsertDao;

    public int addStaff(Staff staff) {
        int i = workInsertDao.addStaff(staff);
        System.out.println(i);
        return i;
    }

    public int addTrain(Training training) {
        System.out.println(workInsertDao.addTrain(training));
        return workInsertDao.addTrain(training);
    }

    public int addRewardPunish(RewardPunish rewardPunish) {
        System.out.println(workInsertDao.addRewardPunish(rewardPunish));
        return workInsertDao.addRewardPunish(rewardPunish);
    }
}
