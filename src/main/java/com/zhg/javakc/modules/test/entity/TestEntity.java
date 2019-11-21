package com.zhg.javakc.modules.test.entity;

import com.zhg.javakc.base.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.codehaus.jackson.map.Serializers;

import java.util.Date;

/**
 * @author an
 * @version v0.0.1
 * @date 2019/11/19 16:05
 */

@Getter
@Setter
@ToString
public class TestEntity extends BaseEntity<TestEntity> {

    private String testId;
    private String testName;
    private String testSex;
    private Date testDate;
}
