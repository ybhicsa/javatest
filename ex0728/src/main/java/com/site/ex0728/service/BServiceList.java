package com.site.ex0728.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0728.dao.BoardDao;
import com.site.ex0728.vo.BoardVo;

public class BServiceList implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao bDao = new BoardDao();
		String category= "",keyword = "";
		if(request.getParameter("keyword")!=null) {
			category = request.getParameter("category"); 
			keyword = request.getParameter("keyword"); 	//사진			
		}
		int listcount = bDao.boardCountSelect(category, keyword);	//총 게시글의 수
		//하단 넘버링
		System.out.println(listcount);
		int page=1;	//현재(시작) 페이지 
		if(request.getParameter("page")!=null) {	//나중에 페이지 위치가 변하더라도 위치를 나타내 준다
			page = Integer.parseInt( request.getParameter("page") ); }
		int limit = 10; //한 페이지에 표시할 게시글 수
		int maxpage = (int)((double)listcount/limit+0.99);
		int startpage = (((int)((double)page/limit+0.99))-1)*limit+1;
		int endpage = startpage+10-1;
		if(endpage>maxpage)endpage=maxpage;	//1-10 멕스 페이지가4일경우 1-4까지만 표시한다.
		request.setAttribute("page", page);
		request.setAttribute("limit", page);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		//----------------------------------------------------------
		request.setAttribute("keyword", keyword);
		request.setAttribute("category", category);
		//----------------------------------------------------------
		//게시글 내용검색을 위한
		int startrow = (page-1)*limit+1;	
		int endrow = startrow+limit-1;
		System.out.println(page+","+limit+","+startrow+","+endrow);
		//----------------------------------------------------------
		//ArrayList<BoardVo> list = bDao.boardAllSelect(startrow,endrow);
		ArrayList<BoardVo> list = bDao.boardAllSelect(startrow,endrow,category,keyword);
		request.setAttribute("list", list);
	}

}
