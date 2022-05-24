package com.example.controller;

import com.example.domain.Department;
import com.example.domain.Employment;
import com.example.domain.rewardPunish;
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
    public List<rewardPunish> selectReward(){
        List<rewardPunish> rewardPunishes = workService.selectReward();
        System.out.println(rewardPunishes);
        return rewardPunishes;
    }
}
