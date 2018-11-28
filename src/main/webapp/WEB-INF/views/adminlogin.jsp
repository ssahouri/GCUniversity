<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Login below</h1>

<form action="/testmenu" method="post">
		<p>
			<label for="username">Username:</label> <input id="username"
				name="username" value="${ username }" required minlength="2" />
		</p>
		<p>
			<label for="password">Password:</label> <input id="password"
				type="password" name="password" required minlength="2" />
		</p>
		<p>
			<button>Submit</button>
		</p>
	</form>


</body>
</html>