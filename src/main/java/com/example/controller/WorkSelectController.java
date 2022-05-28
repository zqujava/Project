package com.example.controller;

import com.example.domain.*;
import com.example.service.WorkSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author luo
 * 查询
 */
@RestController
@RequestMapping("/selects")
@ResponseBody
public class WorkSelectController {

    @Autowired
    private WorkSelectService workSelectService;

    @GetMapping("/selectEmploy")
    public  List<Employment> getEmploy() {
        List<Employment> employments = workSelectService.selectAllEmploy();
        System.out.println(employments);
        return employments;
    }

    @GetMapping("/selectDepart")
    public List<Department> selectAllDepart() {
        List<Department> departments = workSelectService.selectAllDepart();
        System.out.println(departments);
        return departments;
    }

    @GetMapping("/selectReward")
    public List<RewardPunish> selectReward(){
        List<RewardPunish> rewardPunishes = workSelectService.selectAllReward();
        System.out.println(rewardPunishes);
        return rewardPunishes;
    }

    @GetMapping("/selectSalary")
    public List<Salary> selectSalary(){
        List<Salary> salaries = workSelectService.selectSalary();
        System.out.println(salaries);
        return salaries;
    }

    @GetMapping("/selectStaff")
    public List<Staff> selectStaff(){
        List<Staff> staff = workSelectService.selectStaff();
        System.out.println(staff);
        return staff;
    }

    @GetMapping("/selectTrain")
    public List<Training> selectTrain(){
        List<Training> Training = workSelectService.selectTrain();
        System.out.println(Training);
        return Training;
    }
    @GetMapping("/selectCheckJob")
    public List<CheckJob> selectCheckJob(){
        List<CheckJob> checkJobs = workSelectService.selectCheckJob();
        System.out.println(checkJobs);
        return checkJobs;
    }
    @GetMapping("/selectCandidate")
    public List<Candidate> selectCandidate(){
        List<Candidate> candidates = workSelectService.selectCandidate();
        System.out.println(candidates);
        return candidates;
    }
}
