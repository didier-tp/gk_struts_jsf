
<%@ taglib prefix="s" uri="/struts-tags"%>

	<h2>resultat calcul emprunt (struts2)</h2>
	pour rembourser sur <b><s:property value="stNbAnnees" /> ans </b> un montant emprunté de 
	<b><s:property value="stMontant"/> </b>avec un taux annuel de <b><s:property value="stTauxAnnuel"/> % </b> <br/>
	il faut des mensualites de <b><s:property value="mensualite"/> </b>.
	<hr/>
	<s:url id="welcome_url" action="welcome"></s:url> 
	<s:a href="%{welcome_url}">retour vers welcome</s:a>
