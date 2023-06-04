/**
 * 
 */

function buttonCircuitoFormatter(cellvalue, options, rowObject)
{
	let urlCircuito = 'http://localhost:8080/circuitokers/circuito/';
	
	let button = '';
	
	if(cellvalue != null && cellvalue !== 'null' && cellvalue.trim !== '' )
	{
		button = '<a href="'+urlCircuito+cellvalue+'" class="btn btn-primary btn-sm" style="margin: 0%; width: 15 px; height: 30px">' +
	 		'<i class="fa fa-search-plus" aria-hidden="true"></i></a>';
	}
	
	return button;
}

function buttonCocheFormatter(cellvalue, options, rowObject)
{
	
	let urlCoche = 'http://localhost:8080/circuitokers/coche/';
	
	let button = '';
	
	if(cellvalue != null && cellvalue !== 'null' && cellvalue.trim !== '' )
	{
		button = '<a href="'+urlCoche+cellvalue+'" class="btn btn-primary btn-sm" style="margin: 0%; width: 15 px; height: 30px">' +
	 		'<i class="fa fa-search-plus" aria-hidden="true"></i></a>';
	}
	
	return button;
}