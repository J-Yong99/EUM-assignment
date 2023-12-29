package com.eum.assignment.msaservicecoffeemember.springboot.rest;

import com.eum.assignment.msaservicecoffeemember.springboot.repository.ICoffeeMemberMapper;
import com.eum.assignment.msaservicecoffeemember.springboot.repository.dvo.MemberDVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
public class CoffeeMemberRestController {
    @Autowired
    ICoffeeMemberMapper iCoffeeMemberMapper;

    @HystrixCommand
    @GetMapping("/coffeeMember/v1.0/{memberName}")
    public boolean coffeeMember(@PathVariable("memberName") String memberName) {
        MemberDVO memberDVO = new MemberDVO();
        memberDVO.setMemberName(memberName);

        return !iCoffeeMemberMapper.existsByMemberName(memberDVO).getMemberName().isEmpty();
    }

//    @HystrixCommand
//    @PostMapping("/coffeeMember/v1.1")
//    public boolean coffeeMember(@RequestBody MemberRVO memberRVO) {
//        MemberDVO memberDVO = new MemberDVO();
//        memberDVO.setMemberName(memberRVO.getMemberName());
//
//        return !iCoffeeMemberMapper.existsByMemberName(memberDVO).getMemberName().isEmpty();
//    }

    @HystrixCommand(fallbackMethod = "fallbackFunction")
    @GetMapping("/fallbackTest")
    public String fallbackTest() throws Throwable{
        throw new Throwable("fallbackTest");
    }
    public String fallbackFunction() {
        return "fallbackFunction";
    }

    @HystrixCommand
    @PutMapping("/createMemberTable")
    public void createMemberTable() {
        iCoffeeMemberMapper.createMemberTable();
    }

    @HystrixCommand
    @PutMapping("/insertMemberData")
    public void insertMemberData() {
        iCoffeeMemberMapper.insertMemberData();
    }
}
