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
<form:form action="" id="tri_Form01" method="post" modelAttribute="example4Form">
    <fieldset>
        <legend>Form01</legend>
    </fieldset>
</form:form>
