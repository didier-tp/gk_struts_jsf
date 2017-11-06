<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<h2>login (client minibank)</h2>
	<s:if test="message != null">
		<span style="color:red;"><s:property value="message"/></span>
	</s:if>
	<s:form method="post" action="verif_login">
		<s:textfield name="numClient" 
		id="numClient" label="numClient" labelposition="left">
		</s:textfield>
		<s:textfield name="password" 
		id="password" label="password" labelposition="left">
		</s:textfield>
		<s:submit value="verifier login"></s:submit>
	</s:form>
</body>
</html>