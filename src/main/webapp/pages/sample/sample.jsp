<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/pages/common/base.jsp"%>
<title>示例页面</title>
</head>
<body>
	
	${ctx}<br>
	Mysql返回的数据为：${data}
</body>
</html>