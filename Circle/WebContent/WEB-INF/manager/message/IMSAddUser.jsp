<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0053)http://szyunwo.gotoip2.com/jzadmin/Admin/addadmin.htm -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>无标题文档</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/resource/css/content.css">
    <meta name="__hash__" content="d7e7f783de067f8e6c183384b457921c_f3b57e10c7895527c00f993dc8242967"></head>

<body>

<div class="location">当前位置:帐户管理 &gt; 添加帐户</div>
<form action="${ctx}/AddUser" name="form" method="post">
    <ul>
        <li class="common mart6">
            <div class="addborder"><span class="flo_left wid120 textshen">用户名</span><input type="text" name="name" value="" class="inpbor wid200"></div>
        </li>
        <li class="common mart6">
            <div class="addborder">
                <span class="flo_left wid120 textshen">密  码</span><input type="password" name="pwd" value="" class="inpbor wid200">
            </div>
        </li>
        <li class="common mart6">
            <div class="addborder">
                <span class="flo_left wid120 textshen">确认密码</span><input type="password" name="repassword" value="" class="inpbor wid200">
            </div>
        </li>
        <li class="submitbtn flo_left"><input type="submit" name="anniu" value="提 交"></li>
    </ul>
    <input type="hidden" name="__hash__" value="d7e7f783de067f8e6c183384b457921c_f3b57e10c7895527c00f993dc8242967"></form>


</body></html>