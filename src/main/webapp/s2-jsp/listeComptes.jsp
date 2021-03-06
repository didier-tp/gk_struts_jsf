<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listeComptes</title>
</head>
<body>
	<h2>liste des comptes pour le client <s:property value="#session.numClient"/></h2>
	<table border="1">
	   <tr>
	     <th>numero</th><th>label</th><th>solde</th>
	   </tr>
	   <s:iterator value="comptes" status="st">
	   <tr>
	      <td><s:property value="numero"/></td>
	      <td><s:property value="label"/></td>
	      <td><s:property value="solde"/></td> 
	   </tr>
	   </s:iterator>
	</table>

	<s:url id="nouveau_virement_url" action="nouveau_virement"></s:url> 
	<s:a href="%{nouveau_virement_url}">nouveau virement interne</s:a>
	
	<hr/>
	<s:url id="welcome_url" action="welcome"></s:url> 
	<s:a href="%{welcome_url}">retour accueil</s:a>
	
</body>
</html>