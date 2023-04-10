<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current visit count</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="d-flex justify-content-center mt-3 gap-3">
		<p>
			You have visited http://localhost:8080
			<c:out value="${count}" />
			times.
		</p>
		<p>
			<a href="/">Test another visit?</a>
		</p>
		<p>
			<a href="/clear">Reset the counter</a>
		</p>
		<p>
			<a href="/plus2">Increment by 2</a>
		</p>
	</div>
</body>
</html>