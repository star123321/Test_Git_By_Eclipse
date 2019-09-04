<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="Wz_InsStaff" method="post">
        员工编号：<input type='text' name='wzstaffno'/><br/>
        员工姓名：<input type='text' name='wzstaffname'/><br/>
        单位：<input type='text' name='wzunit'/><br/>
        员工电话：<input type='text' name='wzstaffphone'/><br/>
        QQ号：<input type='text' name='wzstaffqq'/><br/>
        入职时间：<input type='text' name='wztime'/><br/>
        <input type='submit' value='添加'/>
        <input type='reset' value='重置'/>
    </form>
</body>
</html>