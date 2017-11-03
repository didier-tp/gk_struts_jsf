<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body>
	<h2>welcome (struts2)</h2>
	<ul>
		<li><s:url id="saisir_emprunt_url" action="saisir_emprunt"></s:url> 
		    <s:a href="%{saisir_emprunt_url}">calcul emprunt</s:a>
		 </li>
		<li>...</li>
	</ul>
</body>
</html>