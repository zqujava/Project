package com.example.service;

import com.example.domain.*;

import java.util.List;


public interface WorkService {

    /**
     * 查询所有的岗位
     * @return
     */
    public List<Employment> selectAllEmploy();


    /**
     * 查询所有的部门
     * @return
     */
    public List<Department> selectAllDepart();

    /**
     * 查询所有的奖惩
     * @return
     */
    public List<RewardPunish> selectAllReward();

    /**
     * 查询所有的奖惩
     * @return
     */
    public List<Salary> selectSalary();

    /**
     * 所有员工信息
     * @return
     */
    public List<Staff> selectStaff();
}
