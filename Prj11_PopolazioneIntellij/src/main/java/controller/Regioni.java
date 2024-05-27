package controller;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.PopServiceImpl;
import service.PopService;

@WebServlet("/regioni")
public class Regioni extends HttpServlet{
    private PopService service = new PopServiceImpl();

    public Regioni() {
        System.out.println("Server regioni creata");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hai chiamato il metodo Get.");
    //    resp.getWriter().print("Hai chiamato il metodo get");
        req.setAttribute("titolo","La mia pagina è bellissima");
        req.setAttribute("regioni",service.getRegioni());
        req.getRequestDispatcher("regions.jsp").forward(req, resp);

    }
}