package com.example.service.impl;

import com.example.dao.WorkSelectDao;
import com.example.domain.*;
import com.example.service.WorkSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author luo
 */
@Service
public class WorkSelectServiceImpl implements WorkSelectService {

    @Autowired
    private WorkSelectDao workSelectDao;

    public List<Employment> selectAllEmploy() {
        return workSelectDao.selectAllEmploy();
    }

    public List<Department> selectAllDepart() {
        return workSelectDao.selectAllDepart();
    }

    public List<RewardPunish> selectAllReward() {
        return workSelectDao.selectReward();
    }

    public List<Salary> selectSalary() {
        return workSelectDao.selectSalary();
    }

    public List<Staff> selectStaff() {
        return workSelectDao.selectStaff();
    }

    public List<Training> selectTrain() {
        return workSelectDao.selectTrain();
    }

    public List<CheckJob> selectCheckJob() {
        return workSelectDao.selectCheckJob();
    }

    public List<Candidate> selectCandidate() {
        return workSelectDao.selectCandidate();
    }
}
