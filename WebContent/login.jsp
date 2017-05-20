<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログインフォーム</title>
</head>
<body><center>
<h1>ログインフォーム</h1>
	<form action = "PageTransition" method = "POST">
	IDを入力してね　　　　　　 <input type = "text" name = "ID"><br>
	パスワードを入力してね　<input type = "password" name = "PASS"><br><br>
	　　　　　　　　　　　　　　　　<input type = "submit" name = "ACTION" value = "ログイン">
	　　<input type = "reset" value = "クリア"><br><br>
	　　　　　　　　　　　　　　　　<input type = "submit" name = "NEW" value = "新規ユーザ登録(無料)">
	</form></center>
</body>
</html>