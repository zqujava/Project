package com.example.service;

import com.example.domain.RewardPunish;
import com.example.domain.Staff;
import com.example.domain.Training;

/**
 * @author luo
 */
public interface WorkInsertService {
    public int addStaff(Staff staff);
    public int addTrain(Training training);
    public int addRewardPunish(RewardPunish rewardPunish);
}
