package com.cpi.jstldemo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpi.jstldemo.service.HomeService;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private  String page = "";
	HomeService homeService = new HomeService();
	
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		try {
			page = "pages/home.jsp";
			request.setAttribute("students", homeService.getStudents());
		}catch (Exception e) {
			e.printStackTrace();
			page = "pages/error.jsp";
		}

		requestDispatcher = request.getRequestDispatcher(page);
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		try {
			String name = request.getParameter("name");
			Integer age = Integer.parseInt(request.getParameter("age"));
			homeService.addStudent(name,age);
			page = "pages/home.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			page = "pages/error.jsp";
		}
		
		requestDispatcher = request.getRequestDispatcher(page);
		requestDispatcher.forward(request, response);
	}

}
