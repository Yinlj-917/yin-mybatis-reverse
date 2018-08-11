package com.yin.reverse.mapper;

import com.yin.reverse.dto.SAttachmentHis;
import com.yin.reverse.dto.SAttachmentHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SAttachmentHisMapper {
    long countByExample(SAttachmentHisExample example);

    int deleteByExample(SAttachmentHisExample example);

    int insert(SAttachmentHis record);

    int insertSelective(SAttachmentHis record);

    List<SAttachmentHis> selectByExample(SAttachmentHisExample example);

    int updateByExampleSelective(@Param("record") SAttachmentHis record, @Param("example") SAttachmentHisExample example);

    int updateByExample(@Param("record") SAttachmentHis record, @Param("example") SAttachmentHisExample example);
}