package com.ypc.logtest.logback.service;

import com.ypc.logtest.logback.model.Member;

import java.util.List;

/**
 * @Author: ypcfly
 * @Date: 19-7-18 22:04
 * @Description:
 */
public interface MemberService {

    List<Member> queryMembersByTeamId(Long teamId);
}
