package com.example.service.impl;

import com.example.dao.WorkDao;
import com.example.domain.Department;
import com.example.domain.Employment;
import com.example.domain.rewardPunish;
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

    public List<rewardPunish> selectReward() {
        System.out.println(workDao.selectReward());
        return workDao.selectReward();
    }
}
