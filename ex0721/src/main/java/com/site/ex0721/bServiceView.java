package com.site.ex0721;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class bServiceView implements BSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		BoardDao boardDao = new BoardDao();
		BoardVo bVO = boardDao.ContentSelect(request.getParameter("bid"));
		
		request.setAttribute("bVo", bVO);
	}

}
