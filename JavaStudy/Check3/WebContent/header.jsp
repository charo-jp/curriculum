<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<link rel="stylesheet" type ="text/css" href="${pageContext.request.contextPath}/css/style.css">
<% Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(date);%>
<header>
   	 <label class ="login">login</label><label class="date"><%= formatDate %></label>
</header>
