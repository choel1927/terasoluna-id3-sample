<%--
  --  Copyright (c) 2015, NTT DATA CORPORATION
  --  All rights reserved.
--%>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<t:messagesPanel />
<spring:nestedPath path="todoManagementForm">
    <form:errors element="div" path="*" />
</spring:nestedPath>
<form:form action="${pageContext.request.contextPath}/todoManagement/add" id="tri_addTodoItem" method="post" modelAttribute="todoManagementForm">
    <fieldset>
        <legend>Add Todo Item</legend>
        <div id="tri_addTodoItem/title">
            <label>Title</label>
            <form:input path="title" />
        </div>
        <div id="tri_addTodoItem/add">
            <input id="add" name="add" type="submit" value="Add" />
        </div>
    </fieldset>
</form:form>
<form:form action="" id="tri_todoItemList" method="post" modelAttribute="todoManagementForm">
    <fieldset>
        <legend>Todo Item List</legend>
        <div id="tri_todoItemList/todos">
            <c:if test="${!empty todos}">
                <dl>
                    <dt>Todos</dt>
                    <dd>
                        <table>
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th id="tri_todoItemList/todos/todoId_th">Todo Id</th>
                                    <th id="tri_todoItemList/todos/title_th">Title</th>
                                    <th id="tri_todoItemList/todos/finish_th">Finish</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${todos}" var="_group" varStatus="_groupStatus">
                                    <tr>
                                        <td>
                                            <fmt:formatNumber pattern="000" value="${_groupStatus.index}" />
                                        </td>
                                        <td id="tri_todoItemList/todos/todoId">${f:h(todos[_groupStatus.index].todoId)}</td>
                                        <td id="tri_todoItemList/todos/title">${f:h(todos[_groupStatus.index].title)}</td>
                                        <td id="tri_todoItemList/todos/finish">
                                            <a href="javascript:(function() { var form = document.createElement('form'); form.action = '${pageContext.request.contextPath}/todoManagement/finish'; form.method = 'get'; var parameter = document.createElement('input'); parameter.setAttribute('type', 'hidden'); parameter.setAttribute('name', 'todoId'); parameter.setAttribute('value', '${f:h(todos[_groupStatus.index].todoId)}'); form.appendChild(parameter); document.body.appendChild(form); form.submit(); })();">Finish</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </dd>
                </dl>
            </c:if>
        </div>
        <div id="tri_todoItemList/paginationLink">
            <t:pagination criteriaQuery="${f:query(todoManagementForm)}" page="${paginationLink}" pathTmpl="${pageContext.request.contextPath}/todoManagement/list" />
        </div>
    </fieldset>
</form:form>
