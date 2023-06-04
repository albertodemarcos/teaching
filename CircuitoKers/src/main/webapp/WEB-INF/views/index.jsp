<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="includes/tlds.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="includes/head.jsp" %>
</head>
<body class="contenedor">
	<!-- NAVBAR -->
	<%@ include file="includes/navbar.jsp" %>
	
	<!-- CONTENIDO -->
	<section class="container-fluid">
	
		<div id="carouselExampleCaptions" class="carousel slide mt-5" data-ride="carousel">
			<ol class="carousel-indicators">
				<li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
				<li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
				<%-- <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>--%>
			</ol>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/resources/libs/img/coches-carrusel.jpg" class="d-block w-100" alt="Coches formula 1">
					<div class="carousel-caption d-none d-md-block">
						<h5>Diseña tu Formular 1</h5>
						<p>Personaliza un coche de formula 1 y ponlo a prueba.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="/resources/libs/img/circuito-carrusel.jpg" class="d-block w-100" alt="Circuito formula 1">
					<div class="carousel-caption d-none d-md-block">
						<h5 style="color: #000000 !important;">Contruye un circuito</h5>
						<p style="color: #000000 !important;">Haz un circuito por donde pondras a prueba a tus coches de formula 1.</p>
					</div>
				</div>
				<%-- <div class="carousel-item">
					<img src="..." class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Third slide label</h5>
						<p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
					</div>
				</div>--%>
			</div>
			<a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="sr-only">Anterior</span>
			</a>
			<a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="sr-only">Siguiente</span>
			</a>
		</div>
		
		<div class="container col-12 mt-5 mb-5 main bg-light">
			<div class="row">
				<div class="col-12 text-center mb-5">
					<h1>Novedades</h1>
				</div>
				
				<div id="div-crear-circuito" class="col-12 col-sm-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">						
					  	<img src="/resources/libs/img/crear-circuito.png" class="card-img-top" alt="Crear circuito" width="300" height="200">
					  	<div class="card-body text-center">
					  		<h5 class="card-title text-left">Circuitos</h5>
					    	<p class="card-text text-left">Diseña tu propio circuito.</p>
					    	<a href="/circuitokers/crearCircuito" class="btn btn-primary">Crear circuito</a>
					  	</div>
					</div>
				</div>
				
				<div id="div-crear-circuito" class="col-12 col-sm-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">						
					  	<img src="/resources/libs/img/crear-coche.jpg" class="card-img-top" alt="Crear coche" width="300" height="200">
					  	<div class="card-body text-center">
					  		<h5 class="card-title text-left">Coches</h5>
					    	<p class="card-text text-left">Modela tu coche de F1.</p>
					    	<a href="/circuitokers/crearCoche" class="btn btn-primary">Crear coche</a>
					  	</div>
					</div>
				</div>
				
				<div id="div-crear-circuito" class="col-12 col-sm-4 d-flex justify-content-center">
					<div class="card" style="width: 18rem;">						
					  	<img src="/resources/libs/img/crear-pruebas.jpg" class="card-img-top" alt="Crear prueba" width="300" height="200">
					  	<div class="card-body text-center">
					  		 <h5 class="card-title text-left">Prueba</h5>
					    	<p class="card-text text-left">Realiza test.</p>
					    	<a href="/circuitokers/calcularPrueba" class="btn btn-primary">Crear prueba</a>
					  	</div>
					</div>
				</div>
			
			</div>
		
		</div>
	
	</section>

	<%@ include file="includes/footer.jsp" %>
</body>
</html>