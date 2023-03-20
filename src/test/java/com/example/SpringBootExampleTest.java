package com.example;

import com.example.entity.FaceRecord;
import com.example.mapper.FaceRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootExampleTest {
    @Resource
    FaceRecordMapper faceRecordMapper;
    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testLink() {
        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();
        objectThreadLocal.remove();
        List<FaceRecord> faceRecords = faceRecordMapper.faceRecordList();
        System.out.println(faceRecords);
    }

    @Test
    public void redisTest() {
        redisTemplate.opsForValue().set("testRedis",1);

        Integer testRedis = (Integer)redisTemplate.opsForValue().get("testRedis");
        System.out.println(
                testRedis
        );
    }
}
