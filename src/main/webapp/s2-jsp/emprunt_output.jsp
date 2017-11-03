<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>emprunt_output</title>
</head>
<body>
	<h2>resultat calcul emprunt (struts2)</h2>
	pour rembourser sur <b><s:property value="stNbAnnees" /> ans </b> un montant emprunté de 
	<b><s:property value="stMontant"/> </b>avec un taux annuel de <b><s:property value="stTauxAnnuel"/> % </b> <br/>
	il faut des mensualites de <b><s:property value="mensualite"/> </b>.
	<hr/>
	<s:url id="saisir_emprunt_url" action="saisir_emprunt"></s:url> 
	<s:a href="%{saisir_emprunt_url}">autre calcul emprunt</s:a>
	
	
	
</body>
</html>