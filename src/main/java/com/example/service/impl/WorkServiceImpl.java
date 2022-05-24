package com.example.service.impl;

import com.example.dao.WorkDao;
import com.example.domain.*;
import com.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkDao workDao;

    public List<Employment> selectAllEmploy() {

        return workDao.selectAllEmploy();
    }

    public List<Department> selectAllDepart() {

        return workDao.selectAllDepart();
    }

    public List<RewardPunish> selectAllReward() {
        //System.out.println(workDao.selectReward());
        return workDao.selectReward();
    }

    public List<Salary> selectSalary() {
        System.out.println(workDao.selectSalary());
        return workDao.selectSalary();
    }

    public List<Staff> selectStaff() {
        return workDao.selectStaff();
    }
}
