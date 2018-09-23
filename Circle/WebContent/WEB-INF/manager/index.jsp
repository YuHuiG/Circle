<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息管理系统 - 用户登录</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/css.css">
<!-- <script language="javascript">
	if (top != window)
		top.location.href = window.location.href;
</script> -->
<meta name="__hash__"
	content="184671d9197fdce34fb27487697cc2e2_10c6d4551127015aa30f36ada9bfcdcb">
</head>

<body style="background: #000;">

	<div class="login_title">信息管理系统</div>


	<div class="loginbox">

		<div class="ltitle">
			<p>用户登录</p>
		</div>
		<div class="form_login">

			<form action="login" name="" method="post">
				<input type="text" name="name" class="inpu" placeholder="用户名"
					value=""> <input type="password" name="pwd" class="inpu"
					placeholder="密    码" value="">
				<div class="cle">
					<input name="code" type="text" class="inpux" placeholder="验证码"
						value="" maxlength="4">
					<div class="code">
						<img src="${ctx}./用户登录_files/verify">
					</div>
				</div>
				<input name="submit" type="submit" value="提  交" id="submit"
					class="submitbtn"> <input type="hidden" name="__hash__"
					value="184671d9197fdce34fb27487697cc2e2_10c6d4551127015aa30f36ada9bfcdcb">
			</form>
			<div style="color: white;">${msg}</div>

		</div>

	</div>

	<div class="login_bottom">
		技术技术 - <a href="http://www.jiuzhao.com/" target="_blank">九兆科技</a>
	</div>

</body>
</html>