package com.eum.assignment.msaservicecoffeemember.springboot.repository;

import com.eum.assignment.msaservicecoffeemember.springboot.repository.dvo.MemberDVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICoffeeMemberMapper {
    MemberDVO existsByMemberName(MemberDVO memberDvo);
    int createMemberTable();
    int insertMemberData();
}
