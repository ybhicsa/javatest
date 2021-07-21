package com.site.ex0721_02.Service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721_02.Dao.BDao;
import com.site.ex0721_02.Vo.BVo;

public class BSeviceList implements BSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		
		BDao bDao = new BDao();
		ArrayList<BVo> list = bDao.BAllList();
		
		request.setAttribute("list", list);
		
	}
	
}
