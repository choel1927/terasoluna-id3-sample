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
<form:form action="" id="tri_F002" method="post" modelAttribute="example1Form">
    <fieldset>
        <legend>Output Form</legend>
        <div id="tri_F002/inputText">
            <label>Input Text</label>
            ${f:h(example1Form.inputText)}
        </div>
        <div id="tri_F002/back">
            <a href="${pageContext.request.contextPath}/Example1/input" id="back">Back</a>
        </div>
    </fieldset>
</form:form>
