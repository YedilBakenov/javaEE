package servlets;

import db.DBManager;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-item")
public class AddItemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("/add-item-page.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        double rating = Double.parseDouble(request.getParameter("rating"));
        int price = Integer.parseInt(request.getParameter("price"));

        Item item = new Item();
        item.setRating(rating);
        item.setName(name);
        item.setPrice(price);

        DBManager.addItem(item);

        response.sendRedirect("/home");

    }
}
