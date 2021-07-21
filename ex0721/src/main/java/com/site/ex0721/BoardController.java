package com.site.ex0721;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

@WebServlet("*.doo")
public class BoardController extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		//StringBuffer url= request.getRequestURL();
		String cpath = request.getContextPath();
		//int clength = cpath.length();
		String fname = uri.substring(cpath.length());
		
		RequestDispatcher dispatcher = null;
		
		
		if(fname.equals("/login.do")) {
			System.out.println("호출 페이지"+fname);
			System.out.println("login.jsp 페이지로 호출함");
		} else if(fname.equals("/member.do")){ 
			System.out.println("호출 페이지"+fname);
			System.out.println("member.jsp 페이지로 호출함");
		} else if(fname.equals("/logout.do")){ 
			System.out.println("호출 페이지"+fname);
			System.out.println("logout.jsp 페이지로 데이터 전달해서 호출함");
		} else if(fname.equals("/list.do")){ 
			System.out.println("호출 페이지"+fname);
			
			BSevice service = new BServiceList();
			service.excute(request, response);
			//request.setAttribute(ArrayList);
			// board.jsp로 request(리스펀스?)를 전달해줄수 있다.
			//response.sendRedirect("/login.jsp"); 사용이 안됨 

			dispatcher = request.getRequestDispatcher("./list.jsp");

			System.out.println("DB접급후 데이터 가지고오기");
			System.out.println("board.jsp 페이지로 데이터 전달해서 호출함");
		}else if(fname.equals("/member_modify.do")){ 
			System.out.println("호출 페이지"+fname);
			
			
			//BSevice service = new BServiceModift();
			//service.excute(request, response);
			
			System.out.println("DB접급후 데이터 가지고오기");
			System.out.println("member_modify.jsp 페이지로 데이터 전달해서 호출함");
		} else if(fname.equals("/content_view.do")){ 
			System.out.println("호출 페이지"+fname);
			
			BSevice service2 = new bServiceView();
			service2.excute(request, response);
			dispatcher = request.getRequestDispatcher("./content_view.jsp");
			System.out.println("DB접급후 데이터 가지고오기");
			System.out.println("content_view.jsp 페이지로 데이터 전달해서 호출함");
		}
		
		dispatcher.forward(request, response);
		
		
		
		/*
		 * response.setContentType("text/html; charset=utf-8"); PrintWriter writer =
		 * response.getWriter(); writer.println("<html><head></head></body>");
		 * writer.println("<h3>servlet 페이지입니다.</h3>"); writer.println("<h3>uri : "+ uri
		 * +" </h3>"); //writer.println("<h3>url : "+ url +" </h3>");
		 * writer.println("<h3>cpath : "+ cpath +" </h3>");
		 * //writer.println("<h3>clength : "+ clength +" </h3>");
		 * writer.println("<h3>파일 이름 fname : "+ fname +" </h3>");
		 * writer.println("<h3>servlet 페이지입니다.</h3>"); writer.println("</body></html>");
		 * 
		 */
		
		
		
		
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
