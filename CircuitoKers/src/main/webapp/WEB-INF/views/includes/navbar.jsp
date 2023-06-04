<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/inicio"><img src="/resources/libs/img/icono.png" alt=""/></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <%-- CIRCUITOS --%>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Circuitos
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/circuitokers/crearCircuito">Crear</a>
          <%--<a class="dropdown-item" href="#">Buscar</a>--%>
          <a class="dropdown-item" href="/circuitokers/circuitos">Listado</a>
        </div>
      </li>
      
      <%-- COCHES --%>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Coches
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/circuitokers/crearCoche">Crear</a>
          <%--<a class="dropdown-item" href="#">Buscar</a>--%>
          <a class="dropdown-item" href="/circuitokers/coches">Listado</a>
        </div>
      </li>
    
      <%-- PRUEBAS --%>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Pruebas
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="/circuitokers/calcularPrueba">Crear</a>
        </div>
      </li>
    
    
    </ul>
  </div>
</nav>