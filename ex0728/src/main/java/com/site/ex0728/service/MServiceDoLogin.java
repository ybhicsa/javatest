package com.site.ex0728.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.ex0728.dao.MemberDao;
import com.site.ex0728.vo.MemberVo;

public class MServiceDoLogin implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		//로그인 화면에서 id와 pw가 넘어온다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDao mDao = new MemberDao();
		MemberVo mVo = mDao.mDoLoginSelect(id, pw);

		// 데이터가 있어야지만 로그인 가능.
		if(mVo.getId() != null) {
			System.out.println(mVo.getId());			
			session.setAttribute("session_id", mVo.getId());
			session.setAttribute("session_nickname", mVo.getNickname());
			session.setAttribute("session_flag", "success");
		} else {
			session.setAttribute("session_flag", "fail");
		}
		
	}

}
