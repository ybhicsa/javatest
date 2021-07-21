package com.stie.ex0721.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0721.Vo.BVo;
import com.site.ex0721.dao.BDao;

public class BoardServiceWrite implements BoardSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		
		String cpth = "c:/aaa";
		int size = 10*1024*1024;
		int result=0;
		
		String bname ="",btitle ="",bcontent ="",bupload ="";
		
		try {
		MultipartRequest multi = new MultipartRequest(request, cpth, size, "utf-8", new DefaultFileRenamePolicy());
		
		bname = multi.getParameter("bname");
		btitle = multi.getParameter("btitle");
		bcontent = multi.getParameter("bcontent");
		bupload = multi.getFilesystemName("file1");

		result = bDao.boardWrite(bname,btitle,bcontent,bupload);
		request.setAttribute("result", result);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
