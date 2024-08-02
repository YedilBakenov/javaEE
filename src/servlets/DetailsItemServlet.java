package servlets;

import db.DBManager;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/details-item")
public class DetailsItemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        Item item = DBManager.getItemById(id);

        if(item!=null){
            request.setAttribute("item", item);
            request.getRequestDispatcher("/details-item.jsp").forward(request, response);
        }else {
            response.sendRedirect("/");
        }
    }
}
