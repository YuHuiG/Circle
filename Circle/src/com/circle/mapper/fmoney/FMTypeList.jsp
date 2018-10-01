<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0049)http://szyunwo.gotoip2.com/jzadmin/Zijin/cate.htm -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>无标题文档</title>
    <link rel="stylesheet" type="text/css" href="${ctx}/resource/css/content.css">
    <meta name="__hash__" content="7ef1a976484a92c3ff81e8699d7b9982_23bce8781409b692f02374467bce9f49"></head>

<body>

<div class="location">当前位置: 找资金 &gt;信息管理 &gt;分类管理</div>

<form action="http://szyunwo.gotoip2.com/jzadmin/Info/updatepx.htm" method="post" name="listform">
    <table width="100%" cellspacing="1" class="listtable">
        <tbody><tr>
            <th class="wid60">ID</th>
            <th class="wid100">排序</th>
            <th>类别名称</th>
            <th class="wid100">操作</th>
        </tr>
        <c:forEach items="${list1}" var="b">
        <tr>
            <td>${b.ccId}</td>
            <td><input name="px[]" type="text" class="inpbor wid60" value="${b.ccDesc}"></td>
            <td><p style="padding-left:10px;">${b.ccName}</p></td>
            <td><a href="${ctx}/fmoney/FMTypeUpdate?sid=${b.ccId}" class="marlr5">编辑</a><a href="${ctx}/fmoney/FMTypedelete?sid=${b.ccId}" class="marlr5" onclick="return confirm(&#39;删除此类别同时也会删除所有子分类，确定要删除吗？&#39;)">删除</a></td>
        </tr>
        <input type="hidden" name="id[]" value="${b.ccId}">
        <input type="hidden" name="mod" value="2">
       
        <c:forEach items="${list2}" var="s"> 
         <c:if test="${s.ccParentId==b.ccId}">
        <tr>
            <td>${s.ccId}</td>
            <td><input name="px[]" type="text" class="inpbor wid60" value="${s.ccDesc}"></td>
            <td><p style="padding-left:30px;">└──&gt;${s.ccName}</p></td>
            <td><a href="${ctx}/fmoney/FMTypeUpdate?sid=${s.ccId}" class="marlr5">编辑</a><a href="${ctx}/fmoney/FMTypedelete?sid=${s.ccId}" class="marlr5" onclick="return confirm(&#39;确定要删除吗？&#39;)">删除</a></td>
        </tr>
        <input type="hidden" name="id[]" value="${s.ccId}">
        <input type="hidden" name="mod" value="2">
        </c:if>
		</c:forEach>
		
		</c:forEach>
      </tbody></table>

    <div class="mainfoot"><input type="submit" name="anniu" value="更新排序"></div>
    <input type="hidden" name="__hash__" value="7ef1a976484a92c3ff81e8699d7b9982_23bce8781409b692f02374467bce9f49"></form>

</body></html>