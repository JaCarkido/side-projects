<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div >
	<table>
		<tr>
			<th>Name</th>
			<th>Weight Class</th>
		</tr>
			<c:forEach var="wrestler" items="${wrestlerList}">
			<c:url var="individualStats" value="individualStats"/>
			
			<tr>
				<td>
						<div class="roster-hover-button"><a href="${individualStats}?id=${wrestler.id}">${wrestler.firstName} ${wrestler.lastName}</a></div>
				</td>
				<td>
					<div> ${wrestler.weightClass}</div> 
				</td>
			</tr>
			
			</c:forEach>
	</table>
</div>	
	</body>
</html>