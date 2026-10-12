<%@page import="springmvc_ecommerce.configuration.dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%List<Product> list=(List<Product>)request.getAttribute("key");%>
<%if(list==null){%>
<p>No data found</p>
<%}else{ %>

<table border="">
<tr>
      <th>ID</th>
       <th>NAME</th>
       <th>PRICE</th>
       <th>QUANTITY</th>
       <th>UPDATE</th>
</tr>
<%for(Product a:list){%>
<tr>
        <td><%=a.getId()%></td>
        <td><%=a.getName()%></td>
        <td><%=a.getPrice()%></td>
        <td><%=a.getQuantity()%></td>
        <td><a href="update.jsp?id=<%=a.getId()%>&&name=<%=a.getName()%>&&price=<%=a.getPrice()%>&&Quantity=<%=a.getQuantity()%>">edit</a></td>
</tr>
<%}%>
</table>
<%}%>
</body>
</html>