<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="example1Form">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/Example1/output" id="tri_F001" method="post" modelAttribute="example1Form">
    <fieldset>
        <legend>Input Form</legend>
        <div id="tri_F001/inputText">
            <label>Input Text</label>
            <form:input path="inputText" />
        </div>
        <div id="tri_F001/submit">
            <input id="submit" name="submit" type="submit" value="Submit" />
        </div>
    </fieldset>
</form:form>
