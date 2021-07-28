package com.site.ex0728.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0728.dao.BoardDao;
import com.site.ex0728.vo.BoardVo;

public class BServiceContent implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bDao = new BoardDao();
		
		BoardVo bVo = bDao.boardContentView(Integer.parseInt(request.getParameter("bid")));

		request.setAttribute("bVo", bVo);
	}

}
