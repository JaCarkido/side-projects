<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lex Wrestling App</title>
    <c:url value="/css/site.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
	<div class="nav-container">
    <header>
    		
    	<c:url value="img/coltsLogo.jpg" var="logoSrc" />
        <c:url var="highSchoolPage" value="matchTrackerHome"/>
	<div class="logo">
        <a href="${highSchoolPage}">
       		<img src="${logoSrc}" alt="Cloverleaf Colts Horseshoe" />
       	</a>
    </div>    	
    </header>
    <nav>
    	<ul>
    		<c:url var="reviews" value="reviews" />
            <li><a href="${reviews}">Team Results</a></li>  
    	
        	<c:url var="roster" value="roster" />
            <li><a href="${roster}">Roster</a></li> 
            
            <c:url var="login" value="login"/>
            <li><a href="${login}">Login</a></li>    
        </ul>
    </nav>
    </div>