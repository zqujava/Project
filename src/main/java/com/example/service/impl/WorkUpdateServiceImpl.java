package com.example.service.impl;

import com.example.dao.WorkUpdateDao;
import com.example.domain.Staff;
import com.example.domain.Training;
import com.example.service.WorkUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luo
 */
@Service
public class WorkUpdateServiceImpl implements WorkUpdateService {
    @Autowired
    private WorkUpdateDao workUpdateDao;

    public int updateStaff(Staff staff) {
        return workUpdateDao.updateStaff(staff);
    }

    public int updateTrain(Training training) {
        return workUpdateDao.updateTrain(training);
    }

}
