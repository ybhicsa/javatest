package com.stie.ex0721.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721.Vo.BVo;
import com.site.ex0721.dao.BDao;

public class BoardServiceList implements BoardSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		
		BDao bDao = new BDao();
		ArrayList<BVo> list = bDao.boardAllList();
		
		request.setAttribute("list", list);
		

	}

}
