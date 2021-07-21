package com.site.ex0721_02.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721_02.Dao.BDao;
import com.site.ex0721_02.Vo.BVo;

public class BSeviceView implements BSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		
		BVo bVo = bDao.BSelectView(Integer.parseInt(request.getParameter("bid")));
		
		request.setAttribute("bVo", bVo);
	}

}
