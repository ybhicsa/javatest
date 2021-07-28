package com.site.ex0728.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.site.ex0728.dao.BoardDao;

public class BServiceModfify implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bDao = new BoardDao();
		int modUp= 0;
		String savePoint = "c:/aaa";
		int size = 10*1024*1024;
		
		try {
			MultipartRequest multi = new MultipartRequest(request, savePoint,size,"utf-8", new DefaultFileRenamePolicy());
		
			int bid = Integer.parseInt( multi.getParameter("bid") );
			String bname = multi.getParameter("bname");
			String btitle = multi.getParameter("btitle");
			String bcontent = multi.getParameter("bcontent");
			String upload = multi.getFilesystemName("upload");
			
			modUp = bDao.UpdateModify(bid,btitle,bcontent,bname,upload);


		} catch (IOException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("modUp", modUp);
	}

}
