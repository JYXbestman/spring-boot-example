package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.FaceRecord;
import com.example.mapper.FaceRecordMapper;
import com.example.service.FaceRecordService;
import org.springframework.stereotype.Service;

@Service
public class FaceRecordServiceImpl extends ServiceImpl<FaceRecordMapper, FaceRecord> implements FaceRecordService {
}
