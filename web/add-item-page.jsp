<%@ page import="java.util.ArrayList" %>
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
            <form action="/add-item" method="post">
                <div class="row">
                    <div class="col-12 mt-3">
                        <div>
                            <label>NAME:</label>
                        </div>
                        <div>
                            <input type="text" name="name" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                        <div>
                            <label>PRICE:</label>
                        </div>
                        <div>
                            <input type="number" name="price" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                        <div>
                            <label>RATING:</label>
                        </div>
                        <div>
                            <input type="number" name="rating" class="form-control">
                        </div>
                    </div>
                    <div class="col-12 mt-3">
                       <button class="btn btn-success btn-sm">ADD ITEM</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
