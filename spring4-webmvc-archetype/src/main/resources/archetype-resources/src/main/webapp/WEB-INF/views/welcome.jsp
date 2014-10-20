<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<title>Application Title</title>
	<link href="<c:url value="/resources/vendor/jquery-ui/jquery-ui-1.11.1.min.css"/>/" rel="stylesheet"/>
	<script src="<c:url value="/resources/vendor/jquery/jquery-1.11.1.min.js" />" type="text/javascript"></script>
	<script src="<c:url value="/resources/vendor/jquery-ui/jquery-ui-1.11.1.min.js" />" type="text/javascript"></script>
</head>
<body>
	<h1>Spring 4 Web MVC Archetype</h1>
	<h2><c:out value="${message}" /></h2>
</body>
</html>
