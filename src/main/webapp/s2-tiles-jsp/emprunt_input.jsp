
<%@ taglib prefix="s" uri="/struts-tags"%>

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
