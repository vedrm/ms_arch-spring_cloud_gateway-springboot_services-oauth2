
$(function(){
	'use strict'
	
	/*
	var flot1 = $.plot('#flotChart', [{
		data: df3,
		color: '#69b2f8'
	},{
		data: df1,
		color: '#d1e6fa'
	},{
		data: df2,
		color: '#d1e6fa',
		lines: {
			fill: false,
			lineWidth: 1.5
		}
	}], {
		series: {
			stack: 0,
			shadowSize: 0,
			lines: {
				show: true,
				lineWidth: 0,
				fill: 1
			}
		},
		grid: {
			borderWidth: 0,
			aboveData: true
		},
		yaxis: {
			show: false,
			min: 0,
			max: 350
		},
		xaxis: {
			show: true,
			ticks: [[0,''],[8,'Jan'],[20,'Feb'],[32,'Mar'],[44,'Apr'],[56,'May'],[68,'Jun'],[80,'Jul'],[92,'Aug'],[104,'Sep'],[116,'Oct'],[128,'Nov'],[140,'Dec']],
			color: 'rgba(255,255,255,.2)'
		}
	});

	var flot2 = $.plot('#flotChart2', [{
		data: [[0,55],[1,38],[2,20],[3,70],[4,50],[5,15],[6,30],[7,50],[8,40],[9,55],[10,60],[11,40],[12,32],[13,17],[14,28],[15,36],[16,53],[17,66],[18,58],[19,46]],
		color: '#69b2f8'
	},{
		data: [[0,80],[1,80],[2,80],[3,80],[4,80],[5,80],[6,80],[7,80],[8,80],[9,80],[10,80],[11,80],[12,80],[13,80],[14,80],[15,80],[16,80],[17,80],[18,80],[19,80]],
		color: '#f0f1f5'
	}], {
		series: {
			stack: 0,
			bars: {
				show: true,
				lineWidth: 0,
				barWidth: .5,
				fill: 1
			}
		},
		grid: {
			borderWidth: 0,
			borderColor: '#edeff6'
		},
		yaxis: {
			show: false,
			max: 80
		},
		xaxis: {
			ticks:[[0,'Jan'],[4,'Feb'],[8,'Mar'],[12,'Apr'],[16,'May'],[19,'Jun']],
			color: 'rgba(255,255,255,0)',
		}
	});


	$.plot('#flotChart2', [{
		data: df3,
		color: '#0168fa',
		curvedLines: { apply: true }
	}], {
		series: {
			shadowSize: 0,
			lines: {
				show: true,
				lineWidth: 1.5,
				fill: .05
			}
		},
		grid: {
			borderWidth: 0,
			labelMargin: 0
		},
		yaxis: {
			show: false,
			max: 55
		},
		xaxis: {
			show: true,
			color: 'rgba(131,146,165,.08)',
			min: 48,
			max: 102,
			tickSize: 5
		}
	});
	
	*/
	$.plot('#flotChart7', [{
		data: df3,
		color: '#0168fa',
		curvedLines: { apply: true }
	}], {
		series: {
			shadowSize: 0,
			lines: {
				show: true,
				lineWidth: 1.5,
				fill: .05
			}
		},
		grid: {
			borderWidth: 0,
			labelMargin: 0
		},
		yaxis: {
			show: false,
			max: 55
		},
		xaxis: {
			show: true,
			color: 'rgba(131,146,165,.08)',
			min: 48,
			max: 102,
			tickSize: 5
		}
	});
	/*

	$('#vmap').vectorMap({
		map: 'usa_en',
		showTooltip: true,
		backgroundColor: '#fff',
		color: '#d1e6fa',
		colors: {
			fl: '#69b2f8',
			ca: '#69b2f8',
			tx: '#69b2f8',
			wy: '#69b2f8',
			ny: '#69b2f8'
		},
		selectedColor: '#00cccc',
		enableZoom: false,
		borderWidth: 1,
		borderColor: '#fff',
		hoverOpacity: .85
	});


	var ctxLabel = ['6am', '10am', '1pm', '4pm', '7pm', '10pm'];
	var ctxData1 = [20, 60, 50, 45, 50, 60];
	var ctxData2 = [10, 40, 30, 40, 55, 25];

	// Bar chart
	var ctx1 = document.getElementById('chartBar1').getContext('2d');
	var chartBar = new Chart(ctx1, {
		type: 'horizontalBar',
		data: {
			labels: ctxLabel,
			datasets: [{
				data: ctxData1,
				backgroundColor: '#69b2f8'
			}, {
				data: ctxData2,
				backgroundColor: '#d1e6fa'
			}]
		},
		options: {
			maintainAspectRatio: false,
			responsive: true,
			legend: {
				display: false,
				labels: {
					display: false
				}
			},
			scales: {
				yAxes: [{
					gridLines: {
						display: false
					},
					ticks: {
						display: false,
						beginAtZero: true,
						fontSize: 10,
						fontColor: '#182b49'
					}
				}],
				xAxes: [{
					gridLines: {
						display: true,
						color: '#eceef4'
					},
					barPercentage: 0.6,
					ticks: {
						beginAtZero: true,
						fontSize: 10,
						fontColor: '#8392a5',
						max: 80
					}
				}]
			}
		}
	});
	*/
	 var flotChartOption1 = {
			    series: {
			      shadowSize: 0,
			      bars: {
			        show: true,
			        lineWidth: 0,
			        barWidth: .5,
			        fill: 1
			      }
			    },
			    grid: {
			      aboveData: true,
			      color: '#e5e9f2',
			      borderWidth: 0,
			      labelMargin: 0
			    },
			    yaxis: {
			      show: false,
			      min: 0,
			      max: 25
			    },
			    xaxis: {
			      show: false
			    }
			  };	
	var flotChart3 = $.plot('#flotChart3', [{
		data: [[0,12],[1,10],[2,7],[3,11],[4,15],[5,20],[6,22],[7,19],[8,18],[9,20],[10,17],[11,19],[12,18],[13,14],[14,9]],
		color: '#a9d5a9'
	},{
		data: [[0,0],[1,0],[2,0],[3,2],[4,5],[5,2],[6,12],[7,15],[8,10],[9,8],[10,10],[11,7],[12,2],[13,4],[14,0]],
		color: '#f77eb9'
	}], flotChartOption1);
		
	
	window.darkMode = function(){

	}

	window.lightMode = function() {

	}

	var hasMode = Cookies.get('df-mode');
	if(hasMode === 'dark') {
		darkMode();
	} else {
		lightMode();
	}
	
	
	
})
