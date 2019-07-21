package com.ypc.logtest.logback.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author: ypcfly
 * @Date: 19-7-9 20:54
 * @Description:
 */
@Data
public class Member {

    private Long id;

    private Long teamId;

    private String userId;

    private boolean captain;

    private String orderId;

    private Date createTime;

    private Date updateTime;
}
