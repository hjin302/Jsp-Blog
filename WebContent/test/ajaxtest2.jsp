<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<button onclick="idCheck()">아이디 있니?</button>
<div id="box"></div>
<script>
	function idCheck(){
		$.ajax("http://loacalhost:8051/ajax").done(function(data){
			alert(data);
		});
	} 
</script>
</body>
</html>