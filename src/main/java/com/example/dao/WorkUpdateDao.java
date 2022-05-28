package com.example.dao;

import com.example.domain.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

/**
 * @author luo
 * 更新7个表
 */
public interface WorkUpdateDao {
    /**
     * 更新员工信息
     *
     * @param staff
     * @return
     */
    @Update("update staff set name = #{name},sex=#{sex},age=#{age},department=#{department},position=#{position},salary=#{salary} where id = #{id}")
    public int updateStaff(Staff staff);

    /**
     * 更新培训信息
     *
     * @param training
     * @return
     */
    @Update("update training set time=#{time},site=#{site},content=#{content},amount=#{amount} where id=#{id};")
    public int updateTrain(Training training);

    /**
     * 更新奖惩信息
     *
     * @param rewardPunish
     * @return
     */
    @Update("update rewardpunish set name=#{name},category=#{category},content=#{content},wages=#{wages} where id=#{id};")
    public int addRewardPunish(RewardPunish rewardPunish);

    /**
     * 更新招聘信息
     *
     * @param employment
     * @return
     */
    @Update("update employment set position=#{position},salary=#{salary},num=#{num},content=#{content},phone=#{phone},year=#{year} where id=#{id};")
    public int addEmployment(Employment employment);

    /**
     * 更新部门
     *
     * @param department
     * @return
     */
    public int addDepartment(Department department);

    /**
     * 更新考勤信息(打卡)
     *
     * @param checkJob
     * @return
     */
    public int addCheckJob(CheckJob checkJob);

    /**
     * 更新员工薪资信息
     *
     * @param salary
     * @return
     */
    public int addSalary(Salary salary);

    /**
     * 更新应聘者信息
     *
     * @param candidate
     * @return
     */
    public int addCandidate(Candidate candidate);

}
