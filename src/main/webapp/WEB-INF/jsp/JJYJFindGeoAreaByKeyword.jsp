<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>JJYJ Census Search Keyword</title>
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
			<h2 class="headline">Search Geographic Area by Keyword</h2>
			<form action="/SearchKeyword" method="get">
				<label class="card-title">Search your area</label>
				 <input path="SearchKeyword" name="JJYJ_keyword" value="">
			    <input type="submit" value="SearchKeyword">
			</form>
		</div>
	</section>
	<!-- guarantee -->
	<c:if test="${!empty(JJYJ_arealist)}">

		<section id="products" class="section">
			<table>
				<tr>
					<th>geoAreaID</th>
					<th>code</th>
					<th>level</th>
					<th>name</th>
					<th>altCode</th>
				</tr>
				<c:forEach var="area" items="${JJYJ_arealist}" >
					<tr>
						<td>
							<c:out value="${area.geographicAreaID}" />
						</td>
						<td>
							<c:out value="${area.code}" />
						</td>
						<td>
							<c:out value="${area.level}" />
						</td>
						<td>
							<c:out value="${area.name}" />
						</td>
						<td>
							<c:out value="${area.altCode}" />
						</td>
					</tr>
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