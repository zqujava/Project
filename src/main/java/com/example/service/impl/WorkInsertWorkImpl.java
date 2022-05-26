package com.example.service.impl;

import com.example.dao.WorkInsertDao;
import com.example.domain.*;
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
        return workInsertDao.addStaff(staff);
    }

    public int addTrain(Training training) {
        return workInsertDao.addTrain(training);
    }

    public int addRewardPunish(RewardPunish rewardPunish) {
        return workInsertDao.addRewardPunish(rewardPunish);
    }

    public int addEmployment(Employment employment) {
        return workInsertDao.addEmployment(employment);
    }

    public int addDepartment(Department department) {
        return workInsertDao.addDepartment(department);
    }

    public int addCheckJob(CheckJob checkJob) {
        return workInsertDao.addCheckJob(checkJob);
    }

    public int addSalary(Salary salary) {
        System.out.println(workInsertDao.addSalary(salary));
        return workInsertDao.addSalary(salary);
    }

}
