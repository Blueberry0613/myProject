package com.project.service;

import javax.servlet.http.HttpSession;

import com.project.domain.MemberDTO;

public interface MemberService {
	//회원 가입
	public void memberRegister(MemberDTO dto);
	
	public MemberDTO loginCheck(MemberDTO dto);
	

}
