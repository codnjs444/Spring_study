package com.company.hello.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

	// 의존 객체 직접 생성
	// MemberService memberService = new MemberService();
	
	// 의존 객체 자동 주입
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping("/signUp")
	public String signUp() {
		
		return "sign_up";
	}
	
	/*
	 * @RequestParam 이용
	 */
//	@RequestMapping("/signUpConfirm")
//	public String signUpConfirm(@RequestParam String m_id, 
//								@RequestParam String m_pw,
//								@RequestParam String m_mail,
//								@RequestParam String m_phone) {
//		System.out.println("[MemberController] signUpConfirm()");
//		
//		System.out.println("m_id: R" + m_id);
//		System.out.println("m_pw: " + m_pw);
//		System.out.println("m_mail: " + m_mail);
//		System.out.println("m_phone: " + m_phone);
//		
//		return null;
//		
//	}
	
	/*
	 * VO객체 이용
	 */
	@RequestMapping("/signUpConfirm")
	public String signUpConfirm(MemberVo memberVo) {
		System.out.println("[MemberController] signUpConfirm()");
		
		System.out.println("m_id: " + memberVo.getM_id());
		System.out.println("m_pw: " + memberVo.getM_pw());
		System.out.println("m_mail: " + memberVo.getM_mail());
		System.out.println("m_phone: " + memberVo.getM_phone());
		
		memberService.signUpConfirm(memberVo);
		
		return "sign_up_ok";
		
	}
	
	@RequestMapping("/signIn")
	public String signIn()  {
		
		return "sign_in";
	}
	
	@RequestMapping("/signInConfirm")  // 매핑(mapping)
	public String signInConfirm(MemberVo memberVo) {
		System.out.println("[MemberController] signInConfirm()");
		
		MemberVo signInedMember = memberService.signInConfirm(memberVo); // 서비스 호출
		
		if (signInedMember != null)		// 로그인 성공!
			return "sign_in_ok";
		else					// 로그인 실패!
			return "sign_in_ng";
		
	}
	
}
