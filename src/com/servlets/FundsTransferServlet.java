package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.TransactionData;
import com.list.PrintAll;
import com.logic.TransactionUpdate;

/**
 * Servlet implementation class FundsTransferServlet
 */
@WebServlet("/FundsTransferServlet")
public class FundsTransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FundsTransferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		List<TransactionData> data = TransactionUpdate.fundsTransfer(Integer.parseInt(request.getParameter("fromAccountID")), Integer.parseInt(request.getParameter("toAccountID")), Float.parseFloat(request.getParameter("amount")));
		response.getWriter().append("Transaction details:\n\n" + ((data == null)?"No Transactions exist":PrintAll.transaction(data)));
		
	}

}
