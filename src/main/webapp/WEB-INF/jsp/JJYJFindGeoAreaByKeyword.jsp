<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>H+ Sport</title>
<link rel="stylesheet" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<header id="home" class="header">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="home"><img src="images/jjyjlogo.png"
						alt="Logo - H Plus Sports"></a>
				</div>
				<!-- branding -->
				<ul class="navbar">
					<li><a href="">Home</a></li>
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
			<form action="/search" method="get">
				<label class="card-title">Search your area</label>
				 <input path="search" name="jj_keyword" value="">
			    <input type="submit" value="Search">
			</form>
		</div>
	</section>
	<!-- guarantee -->
            <c:if test="${!empty(JJ_productlist)}">
    		<section id="products" class="section">
            <c:forEach var="product" items="${JJ_productlist}">
    		<div class="productContainer">
                           
            				<div class="productContainerItem">
            					<img id="pic1" src="${product.imagePath}">
            					<input type="text" name="product"
            						value="${product.name}"><br />

            				</div>
                        
            </c:forEach>
            		</div>
           
            </section>
            </c:if>


	<footer class="footer">
		<div class="container">
			<%--        <nav class="nav" role="navigation">--%>
			<%--            <div class="container nav-elements">--%>
			<%--                <div class="branding">--%>
			<%--                    <a href="#home"><img src="images/hpluslogo.svg" alt="Logo - H Plus Sports"></a>--%>
			<%--                    <p class="address">100 Main Street<br>--%>
			<%--                        Seattle, WA 98144--%>
			<%--                    </p>--%>
			<%--                </div>--%>
			<%--            </div>--%>
			<%--        </nav>--%>
			<p class="legal">Copyright © 2020 JJYJ Census App. All rights reserved.</p>
		</div><!-- container -->
	</footer><!-- footer -->

</body>
</html>