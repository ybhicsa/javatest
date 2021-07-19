package com.site.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formSe")
public class formservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doget호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("dopost호출");
		doAction(request, response);
	}

	
	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		String mail1,mail2,pw,news,age,gender,marr,son,job,topics="";
		String[] topic;
		

		mail1 = request.getParameter("mail1");
		mail2 = request.getParameter("mail2");
		pw = request.getParameter("pw");
		news = request.getParameter("news");
		age = request.getParameter("age");
		gender = request.getParameter("gender");
		marr = request.getParameter("marr");
		son = request.getParameter("Son");
		job = request.getParameter("Job");
		topic = request.getParameterValues("Topic");
		
		
		for(int i=0;i<topic.length;i++){
			if(i==0)	topics = topic[i];
			else topics = topics+ ", "+ topic[i];
			
		}
		
		PrintWriter pr = response.getWriter();
		
		pr.println("<html><head>");
		pr.println("<title></title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("");
		pr.println("<h3> 메일 : "+ mail1+"@" +mail2 + "</h3>");
		pr.println("<h3> 비밀번호:" +pw+ "</h3>");
		pr.println("<h3> 수신여부:" +news+ "</h3>");
		pr.println("<h3> 관심연령:" +age+ "</h3>");
		pr.println("<h3> 성별:" +gender+ "</h3>");
		pr.println("<h3> 결혼여부:" +marr+ "</h3>");
		pr.println("<h3> 자녀여부:" +son+ "</h3>");
		pr.println("<h3> 직장:" +job+ "</h3>");
		pr.println("<h3> 관심사:" +topics+ "</h3>");
		pr.println();
		pr.println();
		pr.println();
		pr.println("</body></html>");
		
		
		
	}
}
