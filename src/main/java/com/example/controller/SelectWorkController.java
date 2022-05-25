package com.example.controller;

import com.example.domain.*;
import com.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/works")
@ResponseBody
public class SelectWorkController {
    @Autowired
    private WorkService workService;

    @GetMapping("/selectEmploy")
    public  List<Employment> getEmploy() {
        List<Employment> employments = workService.selectAllEmploy();
        System.out.println(employments);
        return employments;
    }

    @GetMapping("/selectDepart")
    public List<Department> selectAllDepart() {
        List<Department> departments = workService.selectAllDepart();
        System.out.println(departments);
        return departments;
    }

    @GetMapping("/selectReward")
    public List<RewardPunish> selectReward(){
        List<RewardPunish> rewardPunishes = workService.selectAllReward();
        System.out.println(rewardPunishes);
        return rewardPunishes;
    }

    @GetMapping("/selectSalary")
    public List<Salary> selectSalary(){
        List<Salary> salaries = workService.selectSalary();
        System.out.println(salaries);
        return salaries;
    }

    @GetMapping("/selectStaff")
    public List<Staff> selectStaff(){
        List<Staff> staff = workService.selectStaff();
        System.out.println(staff);
        return staff;
    }

    @GetMapping("/selectTrain")
    public List<Training> selectTrain(){
        List<Training> Training = workService.selectTrain();
        System.out.println(Training);
        return Training;
    }
    @GetMapping("/selectCheckJob")
    public List<CheckJob> selectCheckJob(){
        List<CheckJob> checkJobs = workService.selectCheckJob();
        System.out.println(checkJobs);
        return checkJobs;
    }
}
