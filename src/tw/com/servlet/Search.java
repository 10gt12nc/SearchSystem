package tw.com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.Product;
import tw.com.dao.ProductDao;
import tw.com.daoImpl.ProductDaoImpl;
import tw.com.factory.ProductFactory;

@WebServlet("/search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Search() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String search = request.getParameter("search");
		int i = 0;

		ProductDao pd = ProductFactory.getProductFactory();

		if (search == null || search.equals("")) {
			request.setAttribute("message", "未填寫!");
			request.getRequestDispatcher("Search.jsp").forward(request, response);

		} else if (search.contains("鞋")) {
			List<Product> allpd = pd.getAllProduct();
			request.setAttribute("Products", allpd);
			request.getRequestDispatcher("OutSearch.jsp").forward(request, response);

		} else {
			request.setAttribute("message", "查無資料");
			request.getRequestDispatcher("Search.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
