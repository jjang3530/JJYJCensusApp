<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>JJYJ Census Details</title>
<link rel="stylesheet" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="home"><img src="images/jjyjlogo.png"
						alt="Logo - JJYJlogo"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
					<li><a href="/home">Home</a></li>
					<li><a href="/goToLevel">Level</a></li>
					<li><a href="/goToKeyword">Keyword</a></li>
					<li><a href="/goToDetails">Details</a></li>
                            </ul><!-- navbar -->
				<!-- navbar -->
			</div>
			<!-- container nav-elements -->
		</nav>
	</header>
	<!-- #home -->

	<section id="search" class="section">
		<header class="imageheader"></header>
		<div class="container">
			<h2 class="headline">Search Geographic Area Details</h2>
			<form action="/Details" method="get">
				<label class="card-title">Search your area</label>
				 <input path="Details" name="JJYJ_altCode" value="">
			    <input type="submit" value="Details">
			</form>
		</div>
	</section>
	<!-- guarantee -->
	<c:if test="${!empty(JJYJ_population)}">

		<section id="products" class="section">
			<table>
				<tr>
					<th>GEOGRAPHIC AREA DETAILS</th>
				</tr>
				<c:forEach var="population" items="${JJYJ_population}" >
				<c:forEach var="area" items="${JJYJ_area}" >

				<tr>
					<td class="areaname"><c:out value="${fn:toUpperCase(area.name)}" /></td>
				</tr>
				<tr>
					<td>Code: ${area.code}</td>
				</tr>
				<tr>
					<td>Alternative Code: ${area.altCode}</td>
				</tr>
				<tr>
					<td>Level: ${area.level}</td>
				</tr>
				<tr>
					<td>Total Population: <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${population.combined}" /></td>
				</tr>
				</c:forEach>
				</c:forEach>
			</table>
		</section>
	</c:if>


	<footer class="footer">
		<div class="container">
			<p class="legal">Copyright © 2020 JJYJ Census App. All rights reserved.</p>
		</div><!-- container -->
	</footer><!-- footer -->

</body>
</html>