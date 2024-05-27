package controller;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/province")
public class Province extends HttpServlet{
	
	public Province() {
		System.out.println("Server province creata");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hai chiamato il metodo Get.");
		resp.getWriter().print("Hai chiamato il metodo get");
		
	}
}
