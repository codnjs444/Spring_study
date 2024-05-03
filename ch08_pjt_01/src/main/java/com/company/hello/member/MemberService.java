package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;		// 의존 객체(MemberDao) 자동 주입
	
	public int signUpConfirm(MemberVo memberVo) {
		System.out.println("[MemberService] signUpConfirm()");
		
		System.out.println("m_id: " + memberVo.getM_id());
		System.out.println("m_pw: " + memberVo.getM_pw());
		System.out.println("m_mail: " + memberVo.getM_mail());
		System.out.println("m_phone: " + memberVo.getM_phone());
		
		memberDao.insertMember(memberVo);  // memberVo를 매개변수로 전달함
		
		return 0;
		
	}

	public MemberVo signInConfirm(MemberVo memberVo) {
		System.out.println("[MemberService] signInConfirm()");
		
		MemberVo signInedMember = memberDao.selectMember(memberVo);  // memberVo를 매개변수로 전달함
		
		return signInedMember;	// 로그인한 회원 정보 반환
		
	}
	
}
