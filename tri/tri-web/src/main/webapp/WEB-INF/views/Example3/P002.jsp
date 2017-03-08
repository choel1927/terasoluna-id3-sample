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
<form:form action="" id="tri_F001" method="post" modelAttribute="example3Form">
    <fieldset>
        <legend>Main Form of Page One</legend>
        <div id="tri_F001/pageDropdown">
            <label>Select Page</label>
            ${f:h(example3Form.pageDropdown)}
        </div>
        <div id="tri_F001/back">
            <a href="${pageContext.request.contextPath}/Example3/main" id="back">Back</a>
        </div>
    </fieldset>
</form:form>
