package com.ypc.logtest.logback.service.impl;

import com.ypc.logtest.logback.mapper.MemberMapper;
import com.ypc.logtest.logback.model.Member;
import com.ypc.logtest.logback.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ypcfly
 * @Date: 19-7-18 22:06
 * @Description:
 */
@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> queryMembersByTeamId(Long teamId) {

        List<Member> memberList = memberMapper.queryMembersByTeamId(teamId);
        log.info(">>>> query member list by team id, teamId={} and list size={} <<<<",teamId,memberList.size());

        return memberList;
    }
}
