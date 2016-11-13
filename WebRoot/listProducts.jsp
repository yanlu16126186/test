<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" width="438">
	<tr>
		<th>ID</th>
		<th>名称</th>
		<th>价格</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${products}" var="p" varStatus="vs">
		<tr style="background-color: ${vs.index%2==0?'#c3f3c3':'#f3c3f3'}">
			<td>${p.id}</td>
			<td>${p.name}</td>
			<td>${p.price}</td>
			<td>操作</td>
		</tr>
	</c:forEach>
</table>