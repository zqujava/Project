package com.example.dao;

import com.example.domain.Department;
import com.example.domain.Employment;
import com.example.domain.rewardPunish;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WorkDao {

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
    public List<rewardPunish> selectReward();
}
