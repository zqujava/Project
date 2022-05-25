package com.example.dao;

import com.example.domain.RewardPunish;
import com.example.domain.Staff;
import com.example.domain.Training;
import org.apache.ibatis.annotations.Insert;

/**
 * @author luo
 */
public interface WorkInsertDao {

   @Insert("insert into staff (name, sex, age, department, position, salary) values (#{name},#{sex},#{age},#{department},#{position},#{salary})")
   public int addStaff(Staff staff);



   @Insert("insert into training (time, site, content, amount) values (#{time},#{site},#{content},#{amount});")
   public int addTrain(Training training);

   @Insert("insert into rewardpunish (name, category, content) values (#{name},#{category},#{content});")
   public int addRewardPunish(RewardPunish rewardPunish);
}
