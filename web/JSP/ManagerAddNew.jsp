<%-- 
    Document   : ManagerAddNew
    Created on : Jun 4, 2018, 11:18:13 PM
    Author     : Usr
--%>

<%@page import="DAO.DataAccess"%>
<%@page import="model.News"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All post</title>
    </head>
    <body>
      <% 
        String title=request.getParameter("title");
        Date dateTemp=new Date(System.currentTimeMillis());
        SimpleDateFormat dateFormate= new SimpleDateFormat("yyyy/MM/dd");
        String date=dateFormate.format(dateTemp.getTime());
        String description=request.getParameter("description");
        String details=request.getParameter("details");
        String category=request.getParameter("category");
        String image= request.getParameter("image");
        
        News n=new News(title, date, description, details, category, image);
        DataAccess da=new DataAccess();
        da.addnew(n);
        response.sendRedirect("/CrudeTest/AllPost");
      %>  
    </body>
</html>
