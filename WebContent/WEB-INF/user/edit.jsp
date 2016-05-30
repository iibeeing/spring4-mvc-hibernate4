<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>新增用户</title>
</head>
<body>
${message}

  <form method="post" action="<c:url value="/user/create"/>">
    <table>
	    <tr>
	       <td>用户名：</td>
	       <td><input type="text" name="userName"  value="${user.userName}"/></td>
	    </tr>
	    <tr>
	     <td>密码：</td>
	       <td><input type="password" name="password" value="${user.password}"/></td>
	    </tr>
	    <tr>
	     <td>姓名：</td>
	       <td><input type="text" name="realName" value="${user.realName}"/></td>
	    </tr>
	    <tr>
	     <td>年龄：</td>
	       <td><input type="text" name="age" value="${user.age}"/></td>
	    </tr>
	    <%-- <tr>
	     <td>工资：</td>
	       <td><input type="text" name="realName" value="${user.salary}"/></td>
	    </tr> --%>
	    <tr>
	     <td colspan="2"><input type="submit" name="提交"/></td>
	    </tr>	    
    </table>
  </form>
</body>
</html>