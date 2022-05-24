package com.example.controller;

import com.example.domain.*;
import com.example.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/works")
@ResponseBody
public class WorkController {
    @Autowired
    private WorkService workService;

    @RequestMapping(value = "/selectAllEmploy", method = RequestMethod.GET)
    @GetMapping
    public  List<Employment> getAll() {
        List<Employment> employments = workService.selectAllEmploy();
        System.out.println(employments);
        return employments;
    }
    @RequestMapping(value = "/selectAllDepart", method = RequestMethod.GET)
    @GetMapping
    public List<Department> selectAllDepart() {
        List<Department> departments = workService.selectAllDepart();
        System.out.println(departments);
        return departments;
    }
    @RequestMapping(value = "/selectAllReward", method = RequestMethod.GET)
    @GetMapping
    public List<RewardPunish> selectReward(){
        List<RewardPunish> rewardPunishes = workService.selectAllReward();
        System.out.println(rewardPunishes);
        return rewardPunishes;
    }
    @RequestMapping(value = "/selectAllSalary", method = RequestMethod.GET)
    @GetMapping
    public List<Salary> selectSalary(){
        List<Salary> salaries = workService.selectSalary();
        System.out.println(salaries);
        return salaries;
    }
    @RequestMapping(value = "/selectAllStaff", method = RequestMethod.GET)
    @GetMapping
    public List<Staff> selectStaff(){
        List<Staff> staff = workService.selectStaff();
        System.out.println(staff);
        return staff;
    }
}
