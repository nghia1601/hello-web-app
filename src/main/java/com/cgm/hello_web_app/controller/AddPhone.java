//package com.cgm.hello_web_app.controller;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.cgm.hello_web_app.model.Product;
//import com.cgm.hello_web_app.model.ProductDAO;
//
///**
// * Servlet implementation class AddPone
// */
//public class AddPhone extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public AddPhone() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ProductDAO productDAO = new ProductDAO();
//		List<Product> latestProducts = productDAO.getAllProducts();
//		request.setAttribute("products", latestProducts);
//		
//		
//		
//		//view
//		RequestDispatcher rd = request.getRequestDispatcher("/Crud.jsp");
//		rd.forward(request, response);
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	    int id = request.getParameter("id");
//		String name = request.getParameter("name");
//	    double price = Double.parseDouble(request.getParameter("price"));
//	    String image = request.getParameter("image");
//	    Product product = new Product(id, name, price, image);
//	    ProductDAO productDAO = new ProductDAO();
//	    boolean success = productDAO.addProduct(product);
//	    
//	    if (success) {
//	        response.sendRedirect("crud");
//	    } else {
//	    	response.sendRedirect("crud");
//	    	
//	    }
//	}
//
//	
//}
