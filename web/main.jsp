<%@ page import="java.util.ArrayList" %>
<%@ page import="db.Item" %>
<%@ page import="java.util.HashSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="links.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container-fluid">
    <div class="row">
        <div class="col">
            <table class="table table-dark table-striped">
                <thead>
                <tr>
                    <th>
                        ID
                    </th>
                    <th>
                        NAME
                    </th>
                    <th>
                        PRICE
                    </th>
                    <th>
                        RATING
                    </th>
                    <th>
                        DETAILS
                    </th>
                </tr>
                </thead>
                <tbody>
                <%
                    HashSet<Item> items = (HashSet<Item>) request.getAttribute("predmetu");
                    if (items != null) {
                        for (Item it : items) {
                %>
                <tr>
                    <td><%=it.getId()%></td>
                    <td><%=it.getName()%></td>
                    <td><%=it.getPrice()%></td>
                    <td><%=it.getRating()%></td>
                    <td style="width: 8%"><a class="btn btn-secondary btn-sm" href="/details-item?id=<%=it.getId()%>">DETAILS</a></td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
