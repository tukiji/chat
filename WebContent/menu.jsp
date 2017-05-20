<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン成功</title>
</head>
<body>
<h1>ログイン成功</h1>
<h2>こんにちは！○○○○さん</h2>
<b>メニュー</b>
<table>
<tr><td><a>チャット画面へ</a></td></tr>
<tr><td><a>マイページ</a></td></tr>
<tr><td><a>ユーザ設定</a></td></tr>
</table><br>
<form action = "LoginCheck" method  = "POST">
	<input type = "submit" name ="ACTION" value = "ログアウト">
</form>
</body>
</html>