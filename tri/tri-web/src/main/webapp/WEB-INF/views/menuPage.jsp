<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="triAppForm">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="" id="tri_menuForm" method="post" modelAttribute="triAppForm">
    <fieldset>
        <legend>Menu Form</legend>
        <div id="tri_menuForm/todoManagementButton">
            <a href="${pageContext.request.contextPath}/todoManagement/list" id="todoManagementButton">Todo Management Button</a>
        </div>
    </fieldset>
</form:form>
