/**
 * 
 */

function listadoCircuitos()
{
	let gridId = 'circuitos-grid';
	let pagerId = 'circuito-pager';
	let url = 'http://localhost:8080/circuitokers/circuitospage';
	let caption = '';
	let button = '<button class="btn btn-primary btn-sm" style="margin: 0%; width: 15 px; height: 30px">' +
	 	'<i class="fa fa-search-plus" aria-hidden="true"></i></button>';
	let colModel = [
        { label: 'ID', 				name: 'id', 	hidden:true, key: true, width: 0 },
		{ label: 'Ver', 			name: 'id', 		width: 60, height: '50', align: 'center', search: false, sortable: false, formatter: buttonCircuitoFormatter },
        { label: 'Nombre', 			name: 'nombre', 	width: 100 },
        { label: 'Ciudad', 			name: 'ciudad', 	width: 100 },
        { label: 'Pais', 			name: 'pais', 		width: 100 },
        { label: 'Nº vueltas', 		name: 'numVueltas', width: 80 },
        { label: 'Log vuelta', 		name: 'longVuelta', width: 80 },
        { label: 'Nº curvas', 		name: 'numCurvas', 	width: 80 }
    ];
	
	let height = 250;
	let rowNum = 10;
	
	jgQrid(url, caption, colModel, height, rowNum, pagerId, gridId);
}

function listadoCoches()
{
	let gridId = 'coches-grid';
	let pagerId = 'coches-pager';
	let url = 'http://localhost:8080/circuitokers/cochespage';
	let caption = '';
	let colModel = [
        { label: 'ID', 				name: 'id', 	hidden:true, key: true, width: 0 },
		{ label: 'Ver', 			name: 'id', 			width: 60, height: '50', align: 'center', search: false, sortable: false, formatter: buttonCocheFormatter },
        { label: 'Nombre', 			name: 'nombre', 		width: 100 },
        { label: 'Escuderia', 		name: 'escuderia', 		width: 100 },
        { label: 'Potencia', 		name: 'potencia', 		width: 60 },
        { label: 'Ganancia curva', 	name: 'gananciaCurva', 	width: 80 }
    ];

	
	let height = 250;
	let rowNum = 10;
	
	jgQrid(url, caption, colModel, height, rowNum, pagerId, gridId);
}



//Funcion general
function jgQrid(url, caption, colModel, height, rowNum, pagerId, gridId)
{
	$(document).ready(function () {
		$('#' + gridId).jqGrid({
	        url: url,
	        mtype: "GET",
	        caption: caption,
			styleUI : 'Bootstrap4',
			iconSet : 'Octicons',
	        datatype: "json",
	        colModel: colModel,
			viewrecords: true,
	        height: 'auto'/*height*/, 
	        rowNum: rowNum,
			rowList: [10, 20,50,100],
	        pager: pagerId,
			loadonce: true,
			gridview: true,
		    autowidth: true,
			//width: 1200,
		    shrinkToFit: true,
		    searching: {
		        multipleSearch: true,
		        loadDefaults: false,
		        sopt: ['eq', 'ne', 'cn', 'bw', 'bn', 'ge', 'le', 'lt', 'gt'],
		        showQuery: false
		      },
		    navOptions: { add: false, edit: false, search: false, del: false, refresh: true, refreshstate: 'current' },			
			/*onCellSelect: function(rowid, iCol,cellcontent, e) {
		        // Si se pulsa sobre la columna 1, pulsan sobre el boton
		        if (iCol === 1 )
		        {
		        	// Obtenemos el valor de la columna oculta
		        	let idCelValue = jQuery( '#' + gridId ).jqGrid ('getCell', rowid, 'id');
					let urlId = ""+urlEntity+idCelValue;
		        	console.log('Se ha pulsado sobre el boton ver para ir al circuito con id: ' + urlId);
					$.get(urlId, function( data ) {});
		        }
		    }*/
	    });

		$('#' + gridId).jqGrid('filterToolbar', {searchOperators : false});
	});
}
