package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "face_record")
public class FaceRecord extends Entity {
    private String commid;
    private String sourceName;
    private String sourceId;
    private String eventType;

}
