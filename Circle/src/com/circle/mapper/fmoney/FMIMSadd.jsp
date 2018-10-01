<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0048)http://szyunwo.gotoip2.com/jzadmin/Zijin/add.htm -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="${ctx}/resource/css/content.css">
<link rel="stylesheet" href="${ctx}/resource/css/default.css">

<script charset="utf-8" src="${ctx}/resource/js/kindeditor.js"></script>
<script charset="utf-8" src="${ctx}/lang/zh_CN.js"></script>
	<link rel="stylesheet" href="${ctx}/themes/default/default.css" />
	<script>
		var editor;
		KindEditor.ready(function(K) {
			editor = K.create('textarea[name="content"]', {
				allowFileManager : true
			});
			editor = K.create('textarea[name="beizhu"]', {
				allowFileManager : true
			});
		});
	</script>

	<script type="text/javascript" src="${ctx}/resource/js/laydate.js.download"></script>
	<link type="text/css" rel="stylesheet" href="${ctx}/resource/css/laydate.css">
	<link type="text/css" rel="stylesheet" href="${ctx}/resource/css/laydate(1).css" id="LayDateSkin">
<meta name="__hash__" content="e5ba5dbefa4f89a95001cc039bf11cba_d66559dac87875f622428d98fc1a0fd5"></head>

<body>

<div class="location">当前位置: 找资金 &gt;信息管理 &gt; 添加/编辑找资金信息</div>
<form action="${ctx}/fmoney/FMIMSadd" name="form" method="post">
<ul>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">标题</span><input name="capTitle" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder">
			<span class="flo_left wid120 textshen">投资方式</span>
			<select name="capWayId">
				<option value="">=不限=</option>
				<option value="48">股权投资</option><option value="49">债权投资</option><option value="50">金融投资</option><option value="51">BT/BOT 项目投资</option><option value="52">其他投资</option>			</select>
		</div>
	</li>
	<li class="common mart6">
		<div class="addborder">
			<span class="flo_left wid120 textshen">资金类型</span>
			<select name="capTypeId" multiple="multiple" style="width: 180px; height: 200px;">
				<option value="">=不限=</option>
				<option value="53">个人资金</option><option value="54">企业资金</option><option value="55">天使投资</option><option value="56">VC投资</option><option value="57">PE投资</option><option value="58">小额贷款</option><option value="59">典当公司</option><option value="60">担保公司</option><option value="61">金融租赁</option><option value="62">投资公司</option><option value="63">商业银行</option><option value="64">基金公司</option><option value="65">证券公司</option><option value="66">信托公司</option><option value="67">资产管理</option><option value="68">其它资金</option>			</select>
		</div>
	</li>
	<li class="common mart6">
		<div class="addborder">
			<span class="flo_left wid120 textshen">所在地区</span>
			<select name="capAreaId">
				<option value="">=不限=</option>
				<option value="69">广东省</option><option value="70">北京</option><option value="71">山东省</option><option value="72">上海</option><option value="73">江苏省</option><option value="74">浙江省</option>			</select>
		</div>
	</li>
	<li class="common mart6">
		<div class="addborder">
			<span class="flo_left wid120 textshen">投资行业</span>
			<select name="capTradeId" multiple="multiple" style="width: 180px; height: 200px;">
				<option value="">=不限=</option>
				<option value="75">金融投资</option><option value="76">房地产</option><option value="77">能源</option><option value="78">化学化工</option><option value="79">节能环保</option><option value="126">建筑建材</option>			</select>
		</div>
	</li>
	<li class="common mart6">
		<div class="addborder">
			<span class="flo_left wid120 textshen">投资地区</span>
			<select name="capDistrictId">
				<option value="">=不限=</option>
				<option value="80">广东省</option><option value="81">北京</option><option value="82">山东省</option><option value="83">上海</option>			</select>
		</div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">相关图片</span><p><input type="text" name="capImg" id="thumb" value=""> <input type="button" id="logo" value="选择图片"></p></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">投资资金</span><input name="capMoneyId" value="" class="inpbor wid60"><select name="tzdanwei1" style="margin-left: 3px;"><option value="万">万</option><option value="亿">亿</option></select> - <input name="tzzijin2" value="" class="inpbor wid60"><select name="tzdanwei2" style="margin-left: 3px;"><option value="万">万</option><option value="亿">亿</option></select></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">资金主体</span><input name="funtbody" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">风险偏向</span><input name="risk" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">产品偏向</span><input name="product" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">前期费用</span><input name="unfrontCharge" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">需提供材料</span><input name="provideMaterial" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">投资阶段</span><input name="capitalStage" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">投资类型</span><input name="investmentType" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">联系人</span><input name="linkman" value="" class="inpbor wid100"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">联系信息</span><input name="conInformation" value="" class="inpbor wid350"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">关注行业</span><textarea name="ul" class="wid350" rows="5"></textarea></div>
	</li>
	<li class="common mart6">
		<div class="addborder">
		<span class="flo_left wid120 textshen">投资要求概述</span>
			<div class="ke-container ke-container-default" style="width: 750px;">
				<textarea name="content" style="width: 750px; height: 360px; visibility: hidden; display: none;"></textarea>
				
			</div>
		</div>
	
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">投资案例</span>
			<textarea name="beizhu" style="width: 750px; height: 360px; visibility: hidden; display: none;"></textarea>
			</div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">发布日期</span><input
						placeholder="请输入日期" class="laydate-icon" value="" name="fbdate"
						style="text-indent: 3px;" onclick="laydate()">
				</div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">浏览量初始值</span><input name="ll" value="" class="inpbor wid60"></div>
	</li>
	<li class="common mart6">
		<div class="addborder"><span class="flo_left wid120 textshen">排序</span><input name="descId" value="" class="inpbor wid60"></div>
	</li>
	<li class="submitbtn flo_left"><input type="submit" name="anniu" value="提 交"></li>
</ul>
<input type="hidden" name="__hash__" value="e5ba5dbefa4f89a95001cc039bf11cba_d66559dac87875f622428d98fc1a0fd5"></form>


</body></html>