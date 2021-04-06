<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<B>1. JSP 기본 엘러먼트로 폼 값 받아오기</B><BR>
ID <%= request.getParameter("userId") %>
<hr>
<B>2. EL로 폼 값 받아오기</B><BR>
ID ${param.userId}

<br><hr><br>
<B>1. JSP 기본 엘러먼트로 checkbox 폼 값 받아오기</B><BR>
<%
String[] menus = request.getParameterValues("menu");
for(String menu : menus){
%>
	<%= menu %>
<%	
}
%>
<hr>
<B>2. EL로 폼 값 받아오기</B><BR>
선택한 메뉴 :: 
${paramValues.menu[0]}
${paramValues.menu[1]}
${paramValues.menu[2]}
${paramValues.menu[3]}


</body>
</html>