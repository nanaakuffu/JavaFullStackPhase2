package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.TeacherService;

/**
 * Servlet implementation class ProductController
 */
//@WebServlet("/MVCApp/teachers")
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherController() {
		super();
		// TODO Auto-generated constructor stub
	}

	// retrieve product details
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		TeacherService ts = new TeacherService();
		List<Teacher> listOfTeachers = ts.findAllTeachers();

		request.setAttribute("listOfTeachers", listOfTeachers);
		RequestDispatcher rd = request.getRequestDispatcher("viewTeacher.jsp");
		rd.include(request, response);

	}

	// store product details
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		response.setContentType("text/html");

		String teacherName = request.getParameter("teacherName");

		Teacher t = new Teacher();
		t.setTeacherName(teacherName);

		TeacherService ts = new TeacherService();
		String result = ts.storeTeacher(t);

		pw.println(result);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		doGet(request, response);

	}

}
