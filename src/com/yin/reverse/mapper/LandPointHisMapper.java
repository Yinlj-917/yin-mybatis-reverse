package com.yin.reverse.mapper;

import com.yin.reverse.dto.LandPointHis;
import com.yin.reverse.dto.LandPointHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandPointHisMapper {
    long countByExample(LandPointHisExample example);

    int deleteByExample(LandPointHisExample example);

    int insert(LandPointHis record);

    int insertSelective(LandPointHis record);

    List<LandPointHis> selectByExample(LandPointHisExample example);

    int updateByExampleSelective(@Param("record") LandPointHis record, @Param("example") LandPointHisExample example);

    int updateByExample(@Param("record") LandPointHis record, @Param("example") LandPointHisExample example);
}