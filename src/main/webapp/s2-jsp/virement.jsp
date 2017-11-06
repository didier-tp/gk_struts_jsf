<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>virement</title>
</head>
<body>
	<h2>virement interne pour client <s:property value="#session.numClient"/></h2>
	<s:if test="message != null">
		<span style="color:red;"><s:property value="message"/></span>
	</s:if>
	<s:form method="post" action="realiser_virement">
		<s:textfield name="montant" 
		id="montant" label="montant à transférer" labelposition="left">
		</s:textfield>
		<s:textfield name="numCptDeb" 
		id="numCptDeb" label="numero du compte à débiter" labelposition="left">
		</s:textfield>
		<s:textfield name="numCptCred" 
		id="numCptCred" label="numero du compte à créditer" labelposition="left">
		</s:textfield>
		<s:submit value="realiser virement"></s:submit>
	</s:form>
</body>
</html>