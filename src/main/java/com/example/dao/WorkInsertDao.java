package com.example.dao;

import com.example.domain.*;
import org.apache.ibatis.annotations.Insert;

/**
 * @author luo
 * 添加7个表
 */
public interface WorkInsertDao {

   /**
    * 添加员工
    * @param staff
    * @return
    */
   @Insert("insert into staff (name, sex, age, department, position, salary) values (#{name},#{sex},#{age},#{department},#{position},#{salary})")
   public int addStaff(Staff staff);

   /**
    * 添加培训信息
    * @param training
    * @return
    */
   @Insert("insert into training (time, site, content, amount) values (#{time},#{site},#{content},#{amount});")
   public int addTrain(Training training);

   /**
    * 添加奖惩信息
    * @param rewardPunish
    * @return
    */
   @Insert("insert into rewardpunish (name, category, content,wages) values (#{name},#{category},#{content},#{wages});")
   public int addRewardPunish(RewardPunish rewardPunish);

   /**
    * 添加招聘信息
    * @param employment
    * @return
    */
   @Insert("insert into employment (position, salary, num, content, phone,year) values (#{position}, #{salary}, #{num}, #{content}, #{phone}, #{year})")
   public int addEmployment(Employment employment);

   /**
    * 添加部门
    * @param department
    * @return
    */
   @Insert("insert into department (name, amount, director) values (#{name}, #{amount}, #{director})")
   public int addDepartment(Department department);

   /**
    * 添加考勤信息(打卡)
    * @param checkJob
    * @return
    */
   @Insert("insert into checkjob (name,day) values (#{name},#{day})")
   public int addCheckJob(CheckJob checkJob);

   /**
    * 添加员工薪资信息
    * @param salary
    * @return
    */
   @Insert("insert into salary (name, wages, reward, punish, sum) values (#{name},#{wages},#{reward},#{punish},#{sum})")
   public int addSalary(Salary salary);

   /**
    * 添加应聘者信息
    * @param candidate
    * @return
    */
   @Insert("insert into candidate (name, sex, age, phone, degree, experience, site) values (#{name}, #{sex}, #{age}, #{phone}, #{degree}, #{experience}, #{site})")
   public int addCandidate(Candidate candidate);

}
