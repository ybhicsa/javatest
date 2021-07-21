package com.stie.ex0721.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721.Vo.BVo;
import com.site.ex0721.dao.BDao;

public class BoardServiceView implements BoardSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		int bid = 0;
		
		bid = Integer.parseInt(request.getParameter("bid"));
		BDao bDao = new BDao();
		BVo bVo = bDao.boardOneList(bid);
		
		request.setAttribute("bVo", bVo);
		
	}

}
