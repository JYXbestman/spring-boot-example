package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.FaceRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface FaceRecordMapper extends BaseMapper<FaceRecord> {
    List<FaceRecord> faceRecordList();
}
