<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0058)http://szyunwo.gotoip2.com/jzadmin/Index/index/act/sys.htm -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<title>信息管理系统</title>
	<link rel="stylesheet" type="text/css" href="../resource/css/css.css">
	<script type="text/javascript" language="javascript">
		function ChangeChannel(orderid){
			//var iframesrc= document.getElementById("iframe1").src;
			if(orderid ==1)
			{
				document.getElementById("mainframe2").src="信息管理系统-网站信息.html";
			}
			else if(orderid ==2)
			{
				document.getElementById("mainframe2").src="信息管理系统-账号列表.html";
			}else if(orderid ==3){
				document.getElementById("mainframe2").src="信息管理系统-添加账号.html";
			}


		}
	</script>
	<meta name="__hash__" content="e7933ad48f2658ec23ddacc545dfc9ed_17bf2004b475fe2a67ad0883798aacc3"></head>

<body>

<div class="header">

	<div class="logo"><p>信息管理系统</p></div>
	<div class="logor"></div>
</div>
<div class="menu">

	<div class="menu_left"><h2><i><img src="../resource/img/menu25.png"></i>admin</h2><a href="../index.html" onclick="return confirm(&#39;确定要退出系统吗？&#39;)">退出</a></div>
	<div class="menu_right">
		<ul>
			<li><a href="信息管理系统.html" class="sel">系统管理</a></li>
			<li><a href="找资金.html">找资金</a></li>
			<li><a href="选项目.html">选项目</a></li>
			<li><a href="融资直通车.html">融资直通车</a></li>
			<li><a href="文章管理.html">文章管理</a></li>
			<li><a href="链接管理.html">链接管理</a></li>
			<li><a href="其他管理.html">其他管理</a></li>
		</ul>
	</div>
</div>

<div class="leftbox"></div>

<div class="left">
	<div class="left_scroll">
		<div class="cle20"></div>
		<div class="left_menu_item">
			<h2>系统置</h2>
			<ul>
				<li><a href="javascript:void(0);" onclick="ChangeChannel(1);">基本信息设置</a></li>
			</ul>

			<h2>帐户管理</h2>
			<ul>

				<li><a a href="javascript:void(0);" onclick="ChangeChannel(2);">帐户列表</a><span>|</span><a a href="javascript:void(0);" onclick="ChangeChannel(3);">添加帐户</a></li>

			</ul>

		</div>

	</div>

</div>

<!--  主界面框架 -->

<div class="mainframe"></div>
	<div class="mainframe2">
		<iframe src="信息管理系统-网站信息.html"  id = "mainframe2" style="width:100%;height:100%;*height:100%;border:0; background:none; overflow-x:no-display; overflow-y:scroll;"></iframe>
	</div>

<div class="bottom">技术支持 - <a href="http://www.jiuzhao.com/" target="_blank">九兆科技</a></div>

</body></html>