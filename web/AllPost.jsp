<%-- 
    Document   : AllPost
    Created on : Jun 7, 2018, 11:42:02 AM
    Author     : Usr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width: 1300px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    
                    <th>Title</th>
                    <th>Date</th>
                    <th>Description</th>
                    <th>Details</th>
                    <th>Category</th>
                    
                    <th>Image</th>
                </tr>
               
                <c:forEach var="p" items="${AllPost}">
                    <tr>
                        
                        <td>${p.title}</td>
                       <td>${p.date}</td>
                        <td>${p.description}</td>
                        <td>${p.details}</td>
                        <td>${p.catagory}</td>
                        <td>${p.image}</td>
                        <td>
                            <a href="edit?id=${p.title}">Edit</a>
                            <a href="delete?id=${p.title}">Delete</a>
                        </td>
                    </tr>  
                </c:forEach>
                    
            </table>
        </div>
    </body>
</html>
