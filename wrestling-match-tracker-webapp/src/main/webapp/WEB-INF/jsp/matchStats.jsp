<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<div class="all-match-stats-container" >
	<div class="match-wrestler-names">
		<h1 > <div class="home-color">${wrestler.fullName}</div> vs <div class ="away-color"> ${match.opponentName}</div></h1>
	</div >
	<div class ="match-stats-card">
		<div class="date">${match.formattedDate}</div>
		<!--  put the following into a two column table -->
		<div>Opponent: ${match.opponentName} from ${match.opponentSchool}</div>
		<div>${wrestler.fullName}: ${match.homeScore}</div>
		<div>${match.opponentName}: ${match.opponentScore}</div>
		<div>Outcome: ${match.outcome}</div>
		<div>Weight Class: ${match.weightClass}</div><hr>
		<div>Event: ${match.event}</div>
	</div>
	</div>	
	</body>
</html>