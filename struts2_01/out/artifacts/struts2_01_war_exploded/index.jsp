<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/5/19
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
      HELLO WORLD
      <s:property value="#request.list"></s:property>
      <s:textfield type="text" name="username" value="%{#request.list}"></s:textfield>
  </body>
</html>
