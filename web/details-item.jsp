<%@ page import="db.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="links.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-6 ">
            <form action="/update-item" method="post">
                <div class="row">
                    <%
                        Item item =(Item)request.getAttribute("item");
                    %>
                    <input type="hidden" name="id" value="<%=item.getId()%>">
                    <div class="col-12 mt-3">
                        <div>
                            <label>NAME:</label>
                        </div>
                        <div>
                            <input type="text" name="name" value="<%=item.getName()%>" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                        <div>
                            <label>PRICE:</label>
                        </div>
                        <div>
                            <input type="number" value="<%=item.getPrice()%>" name="price" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                        <div>
                            <label>RATING:</label>
                        </div>
                        <div>
                            <input type="number" value="<%=item.getRating()%>" name="rating" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                       <button class="btn btn-success btn-sm">UPDATE ITEM</button>
                    </div>
                </div>
            </form>
            <form action="delete-item?id=<%=item.getId()%>" method="post">
                <div class="col-12 mt-3">
                    <button class="btn btn-danger btn-sm">DELETE ITEM</button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
