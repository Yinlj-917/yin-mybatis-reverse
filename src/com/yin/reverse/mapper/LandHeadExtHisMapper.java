package com.yin.reverse.mapper;

import com.yin.reverse.dto.LandHeadExtHis;
import com.yin.reverse.dto.LandHeadExtHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandHeadExtHisMapper {
    long countByExample(LandHeadExtHisExample example);

    int deleteByExample(LandHeadExtHisExample example);

    int insert(LandHeadExtHis record);

    int insertSelective(LandHeadExtHis record);

    List<LandHeadExtHis> selectByExample(LandHeadExtHisExample example);

    int updateByExampleSelective(@Param("record") LandHeadExtHis record, @Param("example") LandHeadExtHisExample example);

    int updateByExample(@Param("record") LandHeadExtHis record, @Param("example") LandHeadExtHisExample example);
}