package com.example.controller;

import com.example.domain.RewardPunish;
import com.example.domain.Staff;
import com.example.domain.Training;
import com.example.service.WorkInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author luo
 * 添加
 */
@RestController
@RequestMapping("/inserts")
@ResponseBody
public class InsertWorkController {
    @Autowired
    private WorkInsertService workInsertService;

    @PostMapping("/addStaff")
    public int insertStaff(@RequestBody Staff staff) {
        int i = workInsertService.addStaff(staff);
        if (i>0){
            System.out.println("插入员工成功");
        }else {
            System.out.println("插入失败");
        }
        return i;
    }
    @PostMapping("/addTrain")
    public int insertTraining(@RequestBody Training training) {
        int i = workInsertService.addTrain(training);
        if (i>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        return i;
    }
    @PostMapping("/addRewardPunish")
    public int insertRewardPunish(@RequestBody RewardPunish rewardPunish) {
        int i = workInsertService.addRewardPunish(rewardPunish);
        if (i>0){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        return i;
    }

}
