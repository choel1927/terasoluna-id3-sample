<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="example3Form">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/Example3/decision" id="tri_F001" method="post" modelAttribute="example3Form">
    <fieldset>
        <legend>Main Form</legend>
        <div id="tri_F001/pageDropdown">
            <label>Select Page</label>
            <form:select multiple="false" path="pageDropdown">
                <form:options items="${CL_PageTypeList}" />
            </form:select>
        </div>
        <div id="tri_F001/goButton">
            <input id="goButton" name="goButton" type="submit" value="Go" />
        </div>
    </fieldset>
</form:form>
