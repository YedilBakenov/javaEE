package servlets;

import db.DBManager;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/update-item")
public class UpdateItemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        double rating = Double.parseDouble(request.getParameter("rating"));
        int price = Integer.parseInt(request.getParameter("price"));
        int id = Integer.parseInt(request.getParameter("id"));

        Item item = new Item();
        item.setId(id);
        item.setRating(rating);
        item.setName(name);
        item.setPrice(price);

        DBManager.updateItem(item);

        response.sendRedirect("/home");

    }
}
