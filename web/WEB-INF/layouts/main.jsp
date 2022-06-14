<%-- 
    Document   : main
    Created on : Jan 18, 2022, 4:19:27 PM
    Author     : admin
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Bootstrap 5 and layout</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <!--header-->
        <div class="container p-5 bg-success text-white text-center">
            <h1>Jdbc 1 Example</h1>

        </div>
        <!--        navigation-->
        <div class="container mt-5">
            <nav class="navbar navbar-expand-sm bg-light navbar-light">
                <div class="container-fluid">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/toy/index.do">Toy</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/brand/index.do">Brand</a>
                        </li>

                    </ul>
                </div>
            </nav>
        </div>
        <!--  content-->
        <div class="container mt-5">
            <div class="row">
                <div class="col">
                    <jsp:include page="/WEB-INF/views/${controller}/${action}.jsp"/>
                </div>
            </div>
        </div>
        <br/>
        <!--    footer-->
        <div class="container p-2 bg-success text-white text-center">
            Copyright 2021-2022 by PRJ. All Rights Reserved.


        </div>

    </body>
</html>
