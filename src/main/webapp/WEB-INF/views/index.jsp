<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" isELIgnored="false" %>
<body>
<table>
				<tr>
					<th>Track id</th>
					<th>Name</th>
					<th>Comment</th>
				</tr>

				<c:forEach var="tempTrack" items="${tracks}">
                    <c:url var="updateLink" value="/updateTrack">
					<c:param name="Id" value="${tempTrack.id}" />
					</c:url>
				<c:url var="deleteLink" value="/deleteTrack">
                <c:param name="Id" value="${tempTrack.id}" />
                </c:url>
					<tr>
						<td> ${tempTrack.id} </td>
						<td> ${tempTrack.name} </td>
						<td> ${tempTrack.comment} </td>
						<td><a href="${updateLink}">Update</a></td>
						<td><a href="${deleteLink}">Delete</a></td>
					</tr>

				</c:forEach>

</table>

<script>
function newDoc() {
  window.location.assign("addTrack")
}
</script>

<input type="button" value="Add Track" onclick="newDoc()">


</body>