<%@ taglib prefix ="s" uri="/struts-tags" %>
<div style="background-color: #aef2ed">My Default Footer <br/>
    <s:url id="welcome_url" action="welcome"></s:url>
    <s:a href="%{welcome_url}" >retour vers welcome</s:a><br/>
</div>