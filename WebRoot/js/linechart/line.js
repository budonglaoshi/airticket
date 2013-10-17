var chart;
// 加载曲线图
function loadLine(dcity, acity, prices, times) {
	chart = new Highcharts.Chart({
		chart : {
			renderTo : 'container',
			defaultSeriesType : 'spline',
			marginRight : 130,
			marginBottom : 25
		},
		title : {
			text : '<b>' + dcity + ' ' + 'to' + ' ' + acity + '</b>',
			x : -20
		// center
		},
		xAxis : {
			// y
			categories : times
		},
		yAxis : {
			title : {
				// text: '实时票价(元)'
				text : ''
			},
			plotLines : [ {
				value : 0,
				width : 1,
				color : '#808080'
			} ],
			labels : {
				formatter : function() {
					return this.value + '元';
				}
			}
		},
		tooltip : {
			crosshairs : true,
			formatter : function() {
				var time = this.x.split("-");
				var msg = "<b>" + time[0]+"月"+time[1]+"日" + "<br /><label style='color:#F16366'>" + this.y + "元</label></b>";
				return msg;
			}
		},
		plotOptions : {
			series : {
				cursor : 'pointer',
				point : {
					events : {
						click : function() {
							alert(dcity + '-' + acity + ' 起飞时间:'+ this.x + ' 价格:' + this.y);
							// hs.htmlExpand(null, {
							// pageOrigin: {
							// x: this.pageX,
							// y: this.pageY
							// },
							// headingText: this.series.name,
							// maincontentText: Highcharts.dateFormat('%A, %b
							// %e, %Y', this.x) +':<br/> '+ this.y +' visits',
							// width: 200
							// });
						}
					}
				},
				marker : {
					lineWidth : 1
				}
			}
		},
		legend : {
			layout : 'vertical',
			align : 'right',
			verticalAlign : 'top',
			x : -10,
			y : 100,
			borderWidth : 0
		},
		series : [ {
			name : '价格',
			marker : {
				symbol : 'cyclo'
			},
			// x
			data : prices
		} ]
	});
}
