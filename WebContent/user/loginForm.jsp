<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../layout/header.jsp" %>

<!-- x-www-form-urlencoded -->
<div class="container">
	<form action="/user?cmd=login" method="post" enctype="application/x-www-form-urlencoded">
		<div class="form-group">
	    	<input type="text" name="username" value="ssar" class="form-control" placeholder="Enter Username" required>
	  	</div>
	
		<div class="form-group">
	    	<input type="password" name="password" class="form-control" placeholder="Enter Password" required>
	  	</div>
		
	  <button type="submit" class="btn btn-primary">로그인완료</button>
	</form>
</div>

</body>
</html>