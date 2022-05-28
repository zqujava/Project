package com.example.dao;

import com.example.domain.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 16092
 * 查询7个表
 */
public interface WorkSelectDao {

    /**
     * 查询全部岗位
     * @return
     */
    @Select("select * from employment")
    public List<Employment> selectAllEmploy();

    /**
     * 查询所有部门
     * @return
     */
    @Select("select * from department")
    public List<Department> selectAllDepart();

    /**
     * 查询所有的奖惩
     * @return
     */
    @Select("select * from rewardpunish")
    public List<RewardPunish> selectReward();

    /**
     * 查询所有员工薪资
     * @return
     */
    @Select("select * from salary")
    public List<Salary> selectSalary();

    /**
     * 查询所有员工信息
     * @return
     */
    @Select("select * from staff")
    public List<Staff> selectStaff();

    /**
     * 查看培训信息
     * @return
     */
    @Select("select * from training")
    public List<Training> selectTrain();

    /**
     * 查看考勤信息
     * @return
     */
    @Select("select * from checkjob")
    public List<CheckJob> selectCheckJob();

    /**
     * 应聘者
     * @return
     */
    @Select("select * from candidate")
    public List<Candidate> selectCandidate();
}
