package com.bjsxt.servlet;

import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScoedServlet2 extends HttpServlet {
	@Override
	protected  void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException
	,IOException{
		System.out.println("黄爱好看帅哥");
	}
	

}
