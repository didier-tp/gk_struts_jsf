
<%@ taglib prefix="s" uri="/struts-tags"%>

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
	