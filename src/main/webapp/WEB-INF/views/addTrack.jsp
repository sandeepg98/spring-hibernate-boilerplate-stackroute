<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="saveTrack" modelAttribute="track" method="POST">

			<table>
				<tbody>
					<tr>
                		<td><label>id:</label></td>
               			<td><form:input path="id" /></td>
                	</tr>
					<tr>
						<td><label>name:</label></td>
						<td><form:input path="name" /></td>
					</tr>

					<tr>
						<td><label>comment:</label></td>
						<td><form:input path="comment" /></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save"/></td>
					</tr>


				</tbody>
			</table>

		</form:form>