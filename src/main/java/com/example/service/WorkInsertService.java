package com.example.service;

import com.example.domain.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author luo
 */
@Transactional
public interface WorkInsertService {
    public int addStaff(Staff staff);
    public int addTrain(Training training);
    public int addRewardPunish(RewardPunish rewardPunish);
    public int addEmployment(Employment employment);
    public int addDepartment(Department department);
    public int addCheckJob(CheckJob checkJob);
    public int addSalary(Salary salary);
    public int addCandidate(Candidate candidate);
}
