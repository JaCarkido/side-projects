<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div class="all-match-stats-container" >
	<div class="match-wrestler-name">
		<h1 > <div class="home-color">${wrestler.firstName} ${wrestler.lastName}</div> vs <div class ="away-color"> ${match.opponentName}</div></h1>
	</div>
	<table class="all-matches-table">
		<tr>
			<th class="th-opponent">Opponent</th>
			<th>Score </th>
			<th>School</th>
			<th class ="hide">Event</th>
		</tr>
			<c:forEach var="match" items="">
		
			
			<tr>
				<td class="td-opponent">
				</td>
				<td class="td-match">
						<div></div>
				</td>
				<td class="td-match">
					<div> </div> 
				</td>
				<td class="td-event">
					<div ></div>
				</td>
			</tr>
			
			</c:forEach>
	</table>
</div>	
	</body>
</html>