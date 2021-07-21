package com.site.ex0721.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stie.ex0721.service.BoardServiceList;
import com.stie.ex0721.service.BoardServiceView;
import com.stie.ex0721.service.BoardServiceWrite;
import com.stie.ex0721.service.BoardSevice;


@WebServlet("*.do")
public class Bcontroller extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		RequestDispatcher dispatcher = null;
		
		String uri = request.getRequestURI();
		System.out.println(request.getContextPath());
		String filePath = uri.substring(request.getContextPath().length());
		
		if(filePath.equals("/board/boardList.do")) {
			
			BoardSevice boardSevice = new BoardServiceList();
			boardSevice.excute(request, response);
			
			
			dispatcher = request.getRequestDispatcher("./boardList.jsp");
			
		} else if(filePath.equals("/board/boardView.do")) {
			
			String bid = request.getParameter("bid");
			BoardSevice boardSevice = new BoardServiceView();
			boardSevice.excute(request, response);
			
			dispatcher = request.getRequestDispatcher("./boardView.jsp");
			
			
		} else if(filePath.equals("/board/boardWrite.do")) {
			dispatcher = request.getRequestDispatcher("./boardWrite.jsp");
			
			
		} else if(filePath.equals("/board/boardWriteOk.do")) {
			BoardSevice boardSevice = new BoardServiceWrite();
			boardSevice.excute(request, response);
			dispatcher = request.getRequestDispatcher("./index.jsp");
		}
		
		
		dispatcher.forward(request, response);
		
		
		
	}//doAction
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		System.out.println("doGet");	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
		System.out.println("doPost");
	}

}
