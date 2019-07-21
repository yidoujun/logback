package com.ypc.logtest.logback.controller;

import com.ypc.logtest.logback.common.CommonResponse;
import com.ypc.logtest.logback.model.Member;
import com.ypc.logtest.logback.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ypcfly
 * @Date: 19-7-18 21:56
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/list/{teamId}")
    public CommonResponse<List> queryMembersByTeamId(@PathVariable("teamId") Long teamId) {
        log.info(">>>> query team members by team id TeamId={} <<<<",teamId);
        List<Member> memberList = memberService.queryMembersByTeamId(teamId);

        return new CommonResponse<>(memberList);
    }
}
