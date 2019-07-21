package com.ypc.logtest.logback.mapper;

import com.ypc.logtest.logback.model.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ypcfly
 * @Date: 19-7-18 22:07
 * @Description:
 */
public interface MemberMapper {

    List<Member> queryMembersByTeamId(@Param("teamId") Long teamId);
}
