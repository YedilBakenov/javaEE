package servlets;

import db.DBManager;
import db.Item;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HashSet<Item> items = DBManager.getItems();

        request.setAttribute("predmetu", items);

        request.getRequestDispatcher("/main.jsp").forward(request, response);


    }
}
