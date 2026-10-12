<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">

 <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
 <input type="text" name="name" value="<%=request.getParameter("name")%>">
 <input type="number" name="price" value="<%=request.getParameter("price")%>">
 <input type="number" name="Quantity" value="<%=request.getParameter("Quantity")%>">
 <button>submit</button>
 <button>cancel</button>
 
</form>

</body>
</html>