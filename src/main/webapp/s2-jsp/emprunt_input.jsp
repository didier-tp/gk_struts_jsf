<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>emprunt_input</title>
</head>
<body>
	<h2>emprunt (input)</h2>
	<s:if test="message != null">
		<span style="color:red;"><s:property value="message"/></span>
	</s:if>
	<s:form method="post" action="calculer_emprunt">
		<s:textfield name="stMontant" id="montant" label="montant" labelposition="left">
		</s:textfield>
		<s:textfield name="stNbAnnees" id="nbAnnees" label="nb annees" labelposition="left">
		</s:textfield>
		<s:textfield name="stTauxAnnuel" id="tauxAnnuel" label="taux annuel" labelposition="left">
		</s:textfield>
		<s:submit value="calculer menusalite"></s:submit>
	</s:form>
</body>
</html>