package com.example.controller;

import com.example.domain.*;
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
public class WorkInsertController {
    @Autowired
    private WorkInsertService workInsertService;

    @PostMapping("/addStaff")
    public int insertStaff(@RequestBody Staff staff) {
        int i = workInsertService.addStaff(staff);
        if (i > 0) {
            System.out.println("插入员工成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addTrain")
    public int insertTraining(@RequestBody Training training) {
        int i = workInsertService.addTrain(training);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addRewardPunish")
    public int insertRewardPunish(@RequestBody RewardPunish rewardPunish) {
        int i = workInsertService.addRewardPunish(rewardPunish);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addEmployment")
    public int insertEmployment(@RequestBody Employment employment) {
        int i = workInsertService.addEmployment(employment);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addDepartment")
    public int insertDepartment(@RequestBody Department department) {
        int i = workInsertService.addDepartment(department);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addCheckJob")
    public int insertCheckJob(@RequestBody CheckJob checkJob) {
        int i = workInsertService.addCheckJob(checkJob);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

    @PostMapping("/addSalary")
    public int insertSalary(@RequestBody Salary salary) {
        System.out.println(salary);
        int i = workInsertService.addSalary(salary);
        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        return i;
    }

}
