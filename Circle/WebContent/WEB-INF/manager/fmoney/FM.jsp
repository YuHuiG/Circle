<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<title>信息管理系统</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/resource/css/css.css">
		<script type="text/javascript" language="javascript">
			function ChangeChannel(orderid){
				if(orderid ==1) {
					document.getElementById("mainframe2").src="${ctx}/fmoney/FMTypeList";
				}
				else if(orderid ==2) {
					document.getElementById("mainframe2").src="${ctx}/fmoney/FMTypeAdd";
				}else if(orderid ==3){
					document.getElementById("mainframe2").src="${ctx}/fmoney/FMIMSList";
				}else if(orderid ==4){
					document.getElementById("mainframe2").src="${ctx}/fmoney/showFMIMSadd";
				}

			}
		</script>
<meta name="__hash__" content="de2b21b5f38a946b1c5071525e139a89_b6c2fe8195df758bdcae201e710f941e"></head>

<body>

<div class="header">
	
	<div class="logo"><p>信息管理系统</p></div>
	<div class="logor"></div>
</div>
<div class="menu">
	
	<div class="menu_left"><h2><i><img src="${ctx}/resource/img/menu25.png"></i>admin</h2><a href="${ctx}/index.jsp" onclick="return confirm(&#39;确定要退出系统吗？&#39;)">退出</a></div>
	<div class="menu_right">
		
		<ul>

			<li><a href="${ctx}/message/ISM" >系统管理</a></li>
			<li><a href="${ctx}/fmoney/FM" class="sel">找资金</a></li>
			<li><a href="${ctx}/project/project">选项目</a></li>
			<li><a href="${ctx}/invest/invest">融资直通车</a></li>
			<li><a href="${ctx}/essay/essay">文章管理</a></li>
			<li><a href="${ctx}/link/link">链接管理</a></li>
			<li><a href="${ctx}/other/other">其他管理</a></li>

		</ul>

	</div>

</div>

<div class="leftbox"></div>

<div class="left">
<div class="left_scroll">
	<div class="cle20"></div>
	<div class="left_menu_item">
	<h2>类别管理</h2>
	<ul>
		
		<li><a href="javascript:void(0);" onclick="ChangeChannel(1);">分类管理</a><span>|</span><a href="javascript:void(0);" onclick="ChangeChannel(2);">分类添加</a></li>

	</ul>

</div>

<div class="left_menu_item">
	<h2>信息管理</h2>
	<ul>
		
		<li><a href="javascript:void(0);" onclick="ChangeChannel(3);">信息列表</a><span>|</span><a href="javascript:void(0);" onclick="ChangeChannel(4);">信息添加</a></li>

	</ul>

</div>

</div>

</div>

<!--  主界面框架 -->

<div class="mainframe"></div>
<div class="mainframe2">
	<iframe src="${ctx}/fmoney/FMTypeList"  id = "mainframe2" style="width:100%;height:100%;*height:100%;border:0; background:none; overflow-x:no-display; overflow-y:scroll;"></iframe>
</div>

<div class="bottom">技术支持 - <a href="http://www.jiuzhao.com/" target="_blank">九兆科技</a></div>

</body></html>