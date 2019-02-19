package com.imooc.netty.dao;

import com.imooc.netty.pojo.HealthEducationActivity;

public interface HealthEducationActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthEducationActivity record);

    int insertSelective(HealthEducationActivity record);

    HealthEducationActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HealthEducationActivity record);

    int updateByPrimaryKeyWithBLOBs(HealthEducationActivity record);

    int updateByPrimaryKey(HealthEducationActivity record);
}