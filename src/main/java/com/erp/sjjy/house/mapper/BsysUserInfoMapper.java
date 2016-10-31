package com.erp.sjjy.house.mapper;

import com.erp.sjjy.house.model.BsysUserInfo;
import com.erp.sjjy.house.model.BsysUserInfoExample;
import com.erp.sjjy.house.model.BsysUserInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BsysUserInfoMapper {
    int countByExample(BsysUserInfoExample example);

    int deleteByExample(BsysUserInfoExample example);

    int deleteByPrimaryKey(BsysUserInfoKey key);

    int insert(BsysUserInfo record);

    int insertSelective(BsysUserInfo record);

    int deleteLogicByIds(@Param("deleteFlag") int deleteFlag, @Param("ids") Integer[] ids);

    List<BsysUserInfo> selectByExample(BsysUserInfoExample example);

    BsysUserInfo selectByPrimaryKey(BsysUserInfoKey key);

    int updateByExampleSelective(@Param("record") BsysUserInfo record, @Param("example") BsysUserInfoExample example);

    int updateByExample(@Param("record") BsysUserInfo record, @Param("example") BsysUserInfoExample example);

    int updateByPrimaryKeySelective(BsysUserInfo record);

    int updateByPrimaryKey(BsysUserInfo record);
}