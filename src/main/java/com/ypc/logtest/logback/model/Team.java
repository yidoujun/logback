package com.ypc.logtest.logback.model;

import lombok.Data;
import java.util.Date;


/**
 * @Author: ypcfly
 * @Date: 19-7-9 20:49
 * @Description:
 */
@Data
public class Team {

    private Long id;

    private String skuCode;

    private String ownerId;

    private String status;

    private Integer needAmount;

    private Date createTime;

    private Date updateTime;

}
