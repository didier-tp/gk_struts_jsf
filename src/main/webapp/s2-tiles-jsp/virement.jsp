
<%@ taglib prefix="s" uri="/struts-tags"%>

	<h2>virement interne pour client <s:property value="#session.numClient"/></h2>
	<s:if test="message != null">
		<span style="color:red;"><s:property value="message"/></span>
	</s:if>
	<s:form method="post" action="realiser_virement">
		<s:textfield name="montant" 
		id="montant" label="montant à transférer" labelposition="left">
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
