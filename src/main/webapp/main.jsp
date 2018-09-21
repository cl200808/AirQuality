<%--
  Created by IntelliJ IDEA.
  User: 陈磊
  Date: 2018/9/16 0016
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<form action="toList.do" method="post">
    城市：
    <select name="id">
        <option value="0">-----请选择-----</option>
        <option value="1">西城区</option>
        <option value="2">东城区</option>
        <option value="3">海定区</option>
        <option value="4">朝阳区</option>
        <option value="5">丰台区</option>
    </select>
    <input type="submit" value="搜索">
    <table>
        <tr>
            <th>编号</th>
            <th>城市</th>
            <th>记录时间</th>
            <th>P10</th>
            <th>P2.5</th>
            <th>状态</th>
            <th>最后记录时间</th>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.name}</td>
                <td>${list.monitor_time}</td>
                <td>${list.pm10}</td>
                <td>${list.pm25}</td>
                <td>${list.monitoring_station}</td>
                <td>${list.last_modify_time}</td>
            </tr>
        </c:forEach>




    </table>

</form>
</body>
</html>
