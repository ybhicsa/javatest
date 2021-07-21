package com.site.ex0721_02.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0721_02.Service.BSevice;
import com.site.ex0721_02.Service.BSeviceList;
import com.site.ex0721_02.Service.BSeviceView;
import com.site.ex0721_02.Service.BSeviceWrite;


@WebServlet("*.do")
public class BController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		RequestDispatcher dispatcher = null;
		
		String uri = request.getRequestURI();
		String fileName = uri.substring(request.getContextPath().length());
		
		
		if(fileName.equals("/board/bList.do")) {
			
			BSevice bSevice = new BSeviceList();
			bSevice.excute(request, response);
			
			dispatcher = request.getRequestDispatcher("./bList.jsp");
		} else if(fileName.equals("/board/bView.do")) {
			BSevice bSevice = new BSeviceView();
			bSevice.excute(request, response);
			dispatcher = request.getRequestDispatcher("./bView.jsp");
		} else if(fileName.equals("/board/bWrite.do")) {
			dispatcher = request.getRequestDispatcher("./bWrite.jsp");
		}else if(fileName.equals("/board/bWriteOk.do")) {
			BSevice bSevice = new BSeviceWrite();
			bSevice.excute(request, response);
			dispatcher = request.getRequestDispatcher("/board/bList.do");
		}
		
		
		
		
		
		dispatcher.forward(request, response);
		
		
		
		
		
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
