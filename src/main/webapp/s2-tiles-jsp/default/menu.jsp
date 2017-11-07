<%@ taglib prefix ="s" uri="/struts-tags" %>
<div style="background-color: #f4e69c">My Side Menu<br/>
  <ul>
		<li><s:url id="saisir_emprunt_url" action="saisir_emprunt"></s:url> 
		    <s:a href="%{saisir_emprunt_url}">calcul emprunt</s:a>
		 </li>
		 <li><s:url id="saisir_login_url" action="saisir_login"></s:url> 
		    <s:a href="%{saisir_login_url}">login (client minibank)</s:a>
		 </li>
		<li>...</li>
	</ul>
</div>
