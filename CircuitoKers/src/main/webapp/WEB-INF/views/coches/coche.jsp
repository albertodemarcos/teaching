<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/tlds.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<%@ include file="../includes/head.jsp" %>
	</head>
	<body>
		<!-- NAVBAR -->
		<%@ include file="../includes/navbar.jsp" %>
		
		<!-- CONTENIDO -->
		<section class="container-fluid">
			<div class="container col-12 mt-5 mb-5 main bg-light">
				<div class="col-12">
					<div class="row form-group">
						<div class="col-12 mt-3 mb-2 text-center">
							<h3>Coche</h3>
						</div>
						<div class="col-12">
							<div class="card">
								<div class="card-body">
									<ul class="list-group list-group-flush">
									
										<li class="list-group-item">
											<div class="row">
												<div class="col-12 col-sm-12 col-md-6 col-lg-3">
													<span class="negrita">Nombre</span><br>
													<c:if test="${not empty coche and not empty coche.nombre}">
											        	<span>${coche.nombre}</span>
											        </c:if>
												</div>
											</div>
										</li>
										
										<li class="list-group-item">
											<div class="row">
												<div class="col-12 col-sm-12 col-md-6 col-lg-3">
													<span class="negrita">Escuderia</span><br>
													<c:if test="${not empty coche and not empty coche.escuderia}">
											        	<span>${coche.escuderia}</span>
											        </c:if>
												</div>
											</div>
										</li>
										
										<li class="list-group-item">
											<div class="row">
												<div class="col-12 col-sm-12 col-md-6 col-lg-3">
													<span class="negrita">Potencia</span><br>
													<c:if test="${not empty coche and not empty coche.potencia}">
											        	<span>${coche.potencia}</span>
											        </c:if>
												</div>
											</div>
										</li>
										
										<li class="list-group-item">
											<div class="row">
												<div class="col-12 col-sm-12 col-md-6 col-lg-3">
													<span class="negrita">Ganancia curva</span><br>
													<c:if test="${not empty coche and not empty coche.gananciaCurva}">
														<span>${coche.gananciaCurva}</span>
													</c:if>
												</div>
											</div>
										</li>
										
									</ul>
								</div>
							</div>
						</div>
						<!-- BOTON EDITAR -->
					    <div class="col-6 mt-3 text-left">
					    	<a class="btn btn-success btn-lg" href="/circuitokers/editarCoche/${coche.id}">Editar</a>
					    </div>
					    <!-- BOTON LISTADO -->
					    <div class="col-6 mt-3 text-right">
					    	<a class="btn btn-danger btn-lg" href="/circuitokers/coches">Volver</a>
					    </div>
					</div>
				</div>
			</div>
		</section>
	
		<%@ include file="../includes/footer.jsp" %>
	</body>
</html>