<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0052)http://szyunwo.gotoip2.com/jzadmin/Rongzi/addren.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx }/resource/css/content.css">
<link rel="stylesheet" href="${ctx }/resource/css/default.css">
<script charset="utf-8" src="${ctx }/resource/js/kindeditor.js"></script>
<script charset="utf-8" src="${ctx }/lang/zh_CN.js"></script>
<link rel="stylesheet" href="${ctx }/themes/default/default.css" />

<script>
	var editor;
	KindEditor.ready(function(K) {
		editor = K.create('textarea[name="content"]', {
			allowFileManager : true
		});
	});
</script>

<meta name="__hash__"
	content="5b9fe7c7032529b1d269348d86de67a4_3977fc91d8916cd3c2ea05a3f8b4057c">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 投资机构管理 &gt; 添加/编辑投资人信息</div>
	<form action="${ctx }/invest/investorAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">姓名</span><input
						name="iumName" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">副标题</span><input
						name="iumSubhead" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">头像</span>
					<p>
						<input type="text" name="iumHead" id="thumb" value=""> <input
							type="button" id="logo" value="选择图片">(尺寸：179*218px)
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投资阶段</span><input
						name="iumInveststage" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投资方式</span><input
						name="iumInvestmethod" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所在地</span><input
						name="iumArea" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">约见地区</span><input
						name="iumAppointmentarea" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">约见费用</span><input
						name="iumMoney" value="" class="inpbor wid200">元/次
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">机构简介</span>
					<textarea name="jianjie" class="wid350" rows="5"></textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">成功案例文字</span>
					<textarea name="anlilist" class="wid350" rows="5">		</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投资领域</span>
					<textarea name="lingyu" class="wid350" rows="5">		</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">详细介绍</span>
					<div class="ke-container ke-container-default"
						style="width: 700px;">
						<textarea name="content"
							style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
					</div>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">游览量初始值</span><input
						name="iumNum" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="iumSort" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="5b9fe7c7032529b1d269348d86de67a4_3977fc91d8916cd3c2ea05a3f8b4057c">
	</form>


</body>
</html>