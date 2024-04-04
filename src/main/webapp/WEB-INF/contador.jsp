<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Contador de Visitas</title>
</head>
<body>
	<h1>Haz visitado la pagina <a href="/">/lobby</a> <c:out value="${contador}"/> veces!</h1>
	<a href="/">Quieres probar otra visita?</a>
</body>
</html>