package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImp1;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("ename");
		String dept = request.getParameter("edept");
		Float salary = Float.parseFloat(request.getParameter("esalary"));
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
		EmployeeService eservice = new EmployeeServiceImp1();
		eservice.save(e);
		
		RequestDispatcher rd = request.getRequestDispatcher("Fetcher.jsp");
		rd.forward(request, response);
	}

}
