package com.yin.reverse.mapper;

import com.yin.reverse.dto.LandHeadHis;
import com.yin.reverse.dto.LandHeadHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandHeadHisMapper {
    long countByExample(LandHeadHisExample example);

    int deleteByExample(LandHeadHisExample example);

    int insert(LandHeadHis record);

    int insertSelective(LandHeadHis record);

    List<LandHeadHis> selectByExample(LandHeadHisExample example);

    int updateByExampleSelective(@Param("record") LandHeadHis record, @Param("example") LandHeadHisExample example);

    int updateByExample(@Param("record") LandHeadHis record, @Param("example") LandHeadHisExample example);
}