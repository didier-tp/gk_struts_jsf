
<%@ taglib prefix="s" uri="/struts-tags"%>

	<h2>login (client minibank)</h2>
	

	<s:if test="message != null">
		<span style="color:red;"><s:property value="message"/></span>
	</s:if>
	<s:form method="post" action="verif_login" validate="false">
		<s:textfield name="numClient" 
		id="numClient" label="numClient" labelposition="left">
		</s:textfield>
		<s:textfield name="password" 
		id="password" label="password" labelposition="left">
		</s:textfield>
		<s:submit value="verifier login"></s:submit>
	</s:form>
