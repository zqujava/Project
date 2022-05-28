package com.example.controller;

import com.example.domain.RewardPunish;
import com.example.domain.Staff;
import com.example.domain.Training;
import com.example.service.WorkInsertService;
import com.example.service.WorkUpdateService;
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
    private WorkUpdateService workUpdateService;

    @RequestMapping(value = "/updateStaff", method = RequestMethod.PUT)
    public int modifyStaff(@RequestBody Staff staff) {
        int i = workUpdateService.updateStaff(staff);
        if (i > 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
        return i;
    }

    @RequestMapping(value = "/updateTrain", method = RequestMethod.PUT)
    public int modifyTrain(@RequestBody Training training) {
        int i = workUpdateService.updateTrain(training);
        if (i > 0) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }
        return i;
    }

}
