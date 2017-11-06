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
		id="montant" label="montant � transf�rer" labelposition="left">
		</s:textfield>
		numCptDeb:<select name="numCptDeb" id="numCptDeb" >
			<s:iterator value="#session.comptes" status="s1">
				<option value='<s:property value="numero"/>'>
					[<s:property value="numero"/>]
					<s:property value="label"/> -
					<s:property value="solde"/> euro(s)
				</option>
		</s:iterator>
		</select>
		numCptCred:<select name="numCptCred" id="numCptCred" >
			<s:iterator value="#session.comptes" status="s2">
				<option value='<s:property value="numero"/>'>
					[<s:property value="numero"/>]
					<s:property value="label"/> -
					<s:property value="solde"/> euro(s)
				</option>
		</s:iterator>
		</select>
		<s:submit value="realiser virement"></s:submit>
	</s:form>
</body>
</html>