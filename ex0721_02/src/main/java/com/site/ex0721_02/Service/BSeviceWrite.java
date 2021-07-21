package com.site.ex0721_02.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0721_02.Dao.BDao;


public class BSeviceWrite implements BSevice {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		
		String path = "c:/aaa";
		int size = 10*1024*1024;
		int result = 0;
		try {
		
			MultipartRequest multi = new MultipartRequest(request, path,size,"utf-8",new DefaultFileRenamePolicy());
			String btitle = multi.getParameter("btitle");
			String bname = multi.getParameter("bname");
			String bcontent = multi.getParameter("bcontent");
			String bupload = multi.getFilesystemName("file1");
			
			result = bDao.BInsertWrite(btitle,bcontent,bname,bupload);
			
			request.setAttribute("result", result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
