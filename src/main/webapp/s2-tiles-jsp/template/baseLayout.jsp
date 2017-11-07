<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<style type="text/css">@import url(../css/styles.css);</style>
            <title>
            	<tiles:insertAttribute name="title" ignore="true" />
            </title>
 </head>
    <body>
        <table border="1" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td height="250">
                    <tiles:insertAttribute name="menu" />
                </td>
                <td width="350">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>