package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logic.CreationDetails;
import com.model.CustomerData;

/**
 * Servlet implementation class CreateCustomerController
 */
@WebServlet("/CreateCustomerController")
public class CreateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomerController() {
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
		// doGet(request, response);
		
		CustomerData customerData = new CustomerData(Integer.parseInt(request.getParameter("customer_id")),request.getParameter("first_name"),request.getParameter("middle_name"),request.getParameter("last_name"),request.getParameter("street"),request.getParameter("city"),request.getParameter("state"),request.getParameter("zip"),request.getParameter("phone"),request.getParameter("email"));
		response.getWriter().append(CreationDetails.createCustomer(customerData).displayAll());
		
	}

}
