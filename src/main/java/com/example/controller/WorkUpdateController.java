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
@RequestMapping("/updates")
@ResponseBody
public class WorkUpdateController {
    @Autowired
    private WorkInsertService workInsertService;



}
