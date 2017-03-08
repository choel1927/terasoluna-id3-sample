<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="example4Form">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/Example4/inputidentity" id="tri_F001" method="post" modelAttribute="example4Form">
    <fieldset>
        <legend>License Type</legend>
        <div id="tri_F001/licenseType">
            <label>LicenseType</label>
            <form:select multiple="false" path="licenseType">
                <form:options items="${CL_LicenseType}" />
            </form:select>
        </div>
        <div id="tri_F001/input">
            <input id="input" name="input" type="submit" value="input" />
        </div>
    </fieldset>
</form:form>
