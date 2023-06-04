<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../includes/tlds.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="../includes/head.jsp" %>
	<%@ include file="../includes/jqgridcss.jsp" %>
</head>
<body>
	<%@ include file="../includes/navbar.jsp" %>
	
	<!-- CONTENIDO -->
	<section class="container-fluid" >
		<div class="container mt-5 mb-5 main div-left">
			<div class="col-12">
				<div class="row form-group">
					<div class="col-12">
						<h3>Listado de Circuitos</h3>
					</div>
					<div class="col-12">
						<table id="circuitos-grid"></table>
						<div id="circuito-pager"></div>
					</div>
					<!-- BOTONES -->
                    <div class="col-12 mt-3 text-right">
                       	<a class="btn btn-danger btn-lg" href="/inicio">Ir a inicio</a>
                    </div>
				</div>
			</div>
		</div>
	</section>

   <%@ include file="../includes/footer.jsp" %>
   <%@ include file="../includes/jqgridjs.jsp" %>
   
   <script type="text/javascript"> 
   		listadoCircuitos();        
   </script>
</body>
</html>

