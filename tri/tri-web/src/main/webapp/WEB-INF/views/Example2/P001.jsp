<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="example2Form">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/Example2/add" id="tri_F001" method="post" modelAttribute="example2Form">
    <fieldset>
        <legend>Input Form</legend>
        <div id="tri_F001/itemName">
            <label>Item Name</label>
            <form:input path="itemName" />
        </div>
        <div id="tri_F001/addButton">
            <input id="addButton" name="addButton" type="submit" value="Add" />
        </div>
    </fieldset>
</form:form>
<form:form action="" id="tri_F002" method="post" modelAttribute="example2Form">
    <fieldset>
        <legend>List Form</legend>
        <div id="tri_F002/itemList">
            <c:if test="${!empty itemList}">
                <dl>
                    <dt>Item List</dt>
                    <dd>
                        <table>
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th id="tri_F002/itemList/itemId_th">Item Id</th>
                                    <th id="tri_F002/itemList/itemName_th">Item Name</th>
                                    <th id="tri_F002/itemList/deleteButton_th">Delete</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${itemList}" var="_group" varStatus="_groupStatus">
                                    <tr>
                                        <td>
                                            <fmt:formatNumber pattern="000" value="${_groupStatus.index}" />
                                        </td>
                                        <td id="tri_F002/itemList/itemId">${f:h(itemList[_groupStatus.index].itemId)}</td>
                                        <td id="tri_F002/itemList/itemName">${f:h(itemList[_groupStatus.index].itemName)}</td>
                                        <td id="tri_F002/itemList/deleteButton">
                                            <a href="javascript:(function() { var form = document.createElement('form'); form.action = '${pageContext.request.contextPath}/Example2/delete'; form.method = 'get'; var parameter = document.createElement('input'); parameter.setAttribute('type', 'hidden'); parameter.setAttribute('name', 'itemId'); parameter.setAttribute('value', '${f:h(itemList[_groupStatus.index].itemId)}'); form.appendChild(parameter); document.body.appendChild(form); form.submit(); })();">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </dd>
                </dl>
            </c:if>
        </div>
    </fieldset>
</form:form>
