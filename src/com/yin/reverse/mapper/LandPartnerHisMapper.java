package com.yin.reverse.mapper;

import com.yin.reverse.dto.LandPartnerHis;
import com.yin.reverse.dto.LandPartnerHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LandPartnerHisMapper {
    long countByExample(LandPartnerHisExample example);

    int deleteByExample(LandPartnerHisExample example);

    int insert(LandPartnerHis record);

    int insertSelective(LandPartnerHis record);

    List<LandPartnerHis> selectByExample(LandPartnerHisExample example);

    int updateByExampleSelective(@Param("record") LandPartnerHis record, @Param("example") LandPartnerHisExample example);

    int updateByExample(@Param("record") LandPartnerHis record, @Param("example") LandPartnerHisExample example);
}