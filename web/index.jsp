<%-- 
    Document   : index
    Created on : Jan 13, 2022, 4:43:45 PM
    Author     : admin
    Patterns   :MVC: xu ly 1 chuc nang dung 3 thanh phan: Model, View, Controller
               :Front Controller: noi tiep nhan yeu cau, phan tich va chuyen toi Controller do xu ly
               :Facade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:forward page="home/index.do"/>
<!--
    1. lệnh chuyển cho địa chỉ front controller
    2. chạy action index của HomeController
    3. trong HomeController chạy layouts/main.jsp
    4. hiện View home/index.jsp
--%>
