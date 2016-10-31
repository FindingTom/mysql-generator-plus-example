package com.erp.sjjy.house.mapper;

import com.erp.sjjy.house.model.SeqTable;
import com.erp.sjjy.house.model.SeqTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeqTableMapper {
    int countByExample(SeqTableExample example);

    int deleteByExample(SeqTableExample example);

    int deleteByPrimaryKey(String seqName);

    int insert(SeqTable record);

    int insertSelective(SeqTable record);

    int deleteLogicByIds(@Param("deleteFlag") int deleteFlag, @Param("ids") Integer[] ids);

    List<SeqTable> selectByExample(SeqTableExample example);

    SeqTable selectByPrimaryKey(String seqName);

    int updateByExampleSelective(@Param("record") SeqTable record, @Param("example") SeqTableExample example);

    int updateByExample(@Param("record") SeqTable record, @Param("example") SeqTableExample example);

    int updateByPrimaryKeySelective(SeqTable record);

    int updateByPrimaryKey(SeqTable record);
}