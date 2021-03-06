package com.encore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/main.do")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doProcess(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doProcess(request,response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//로직은 여기다 작성..
		String command = request.getParameter("command");
		System.out.println("command : "+command);
		
		if(command.equals("wordCount")) {
			wordCount(request,response);
		}else if(command.equals("kickCount")) {//kickCount
			kickCount(request,response);
		}
	}//doprocess
	
	
	private void kickCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		
		String path = request.getServletContext().getRealPath("/res");
		System.out.println("path: "+path);
		
		File file = new File(path, fname);
		
		int count = new Kickboard().execute(file);
		
		request.setAttribute("result", count);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}

	//해당 모듈 안에서만 사용되고 다른 모듈에서는 불려지는 일이 없을때..함수 앞에 private
	private void wordCount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String words =request.getParameter("words");
		
		String result = new Count().execute(words);//자바 알고리즘이 돈 결과..
		request.setAttribute("result", result);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}
}
