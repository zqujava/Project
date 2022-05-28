package com.example.service;

import com.example.domain.Staff;
import com.example.domain.Training;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luo
 */
@Transactional
public interface WorkUpdateService {
    public int updateStaff(Staff staff);
    public int updateTrain(Training training);

}
