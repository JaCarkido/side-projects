<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div class="all-match-stats-container" >
	<div class="match-wrestler-name">
		<h1 >${wrestler.firstName} ${wrestler.lastName}</h1>
	    <!--  add conditional logic that if outcome = W then wins ++ and if outcome = L then losses ++ -->
	    <!--  then concatinate wins - losses -->
		<!--  display the wrestler's record -->
	</div>
	<table class="all-matches-table">
		<tr>
			<th class="th-opponent">Opponent</th>
			<th>Score </th>
			<th>School</th>
			<th class ="hide">Event</th>
		</tr>
			<c:forEach var="match" items="${matches}">
			<c:url var="matchStats" value="matchStats"/>
			
			<tr>																			
				<td class="td-opponent">														
						<div class="match-hover-button"><a href="${matchStats}?matchId=${match.id}&wrestlerId=${param.id}">vs ${match.opponentName}</a></div>
				</td>
				<td class="td-match">
						<div>${match.homeScore}-${match.opponentScore} ${match.outcome}</div>
				</td>
				<td class="td-match">
					<div> ${match.opponentSchool}</div> 
				</td>
				<td class="td-event">
					<div >${match.event}</div>
				</td>
			</tr>
			
			</c:forEach>
	</table>
</div>	
	</body>
</html>