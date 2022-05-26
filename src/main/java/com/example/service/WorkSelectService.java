package com.example.service;

import com.example.domain.*;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author luo
 */
@Transactional
public interface WorkSelectService {

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

    /**
     * 查看培训信息
     * @return
     */
    public List<Training> selectTrain();

    /**
     * 查看考勤信息
     * @return
     */
    public List<CheckJob> selectCheckJob();
}

