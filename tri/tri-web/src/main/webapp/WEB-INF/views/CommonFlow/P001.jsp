<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="commonFlowForm">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/CommonFlow/returncaller" id="tri_F001" method="post" modelAttribute="commonFlowForm">
    <fieldset>
        <legend>Identity Form</legend>
        <div id="tri_F001/licenseType">
            <label>License Type</label>
            <form:hidden path="licenseType" />
            ${f:h(commonFlowForm.licenseType)}
        </div>
        <div id="tri_F001/name">
            <label>Name</label>
            <form:input path="name" />
        </div>
        <div id="tri_F001/phone">
            <label>Phone</label>
            <form:input path="phone" />
        </div>
        <div id="tri_F001/email">
            <label>Email</label>
            <form:input path="email" />
        </div>
        <div id="tri_F001/address">
            <label>Address</label>
            <form:input path="address" />
        </div>
        <div id="tri_F001/input">
            <input id="input" name="input" type="submit" value="Input" />
        </div>
    </fieldset>
</form:form>
