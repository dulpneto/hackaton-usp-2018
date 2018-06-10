$( document ).ready(function() {
  // Handler for .ready() called.


  // $( "#nav-ter" ).load( "terca.html", function() {
  //   alert( "Load was performed." );
  // });

  $.get("http://localhost/template-ocupacao-bandejao/terca.html", function(data) {
    $("#nav-ter").html(data);
  });

//
//   var central = $.getJSON( "https://hackaton-usp-api.herokuapp.com/api/v1/occupation?restaurant=1&callback=?", function(data) {
//   console.log( "success" );
// });

// $.ajax({
//   url: 'https://hackaton-usp-api.herokuapp.com/api/v1/occupation?restaurant=1&callback=?',
//   dataType: 'jsonp',
//   format: "json",
//   crossDomain: true,
//   type: 'GET',
//   success: function (data) {
//     console.log(data)
//   }
// });



$.ajax({
  url: 'https://hackaton-usp-api.herokuapp.com/api/v1/occupation?restaurant=1&callback=?',
  // cache: false,
  // dataType: "json",
  // format: "json",
  // crossDomain: true,
  success: function (data) {
    console.log(data)
  }
});

//   jQuery.get('test.txt',function(data){
//     console.log(data)
// },'text');



var raw_quimicas_data = {
	"status": 200,
	"message": "Ok",
	"data": [{
		"dayOfWeek": 0,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:15:00",
			"occupation": 2
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 4
		}, {
			"hour": "12:45:00",
			"occupation": 2
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 2
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 2
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:15:00",
			"occupation": 3
		}, {
			"hour": "14:30:00",
			"occupation": 3
		}, {
			"hour": "14:45:00",
			"occupation": 3
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:15:00",
			"occupation": 2
		}, {
			"hour": "19:30:00",
			"occupation": 2
		}, {
			"hour": "19:45:00",
			"occupation": 2
		}]
	}, {
		"dayOfWeek": 1,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:30:00",
			"occupation": 1
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 1
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 1
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 1
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 2
		}, {
			"hour": "12:45:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 3
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 2
		}, {
			"hour": "13:15:00",
			"occupation": 3
		}, {
			"hour": "13:15:00",
			"occupation": 2
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 2
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 2
		}, {
			"hour": "14:15:00",
			"occupation": 2
		}, {
			"hour": "14:30:00",
			"occupation": 2
		}, {
			"hour": "14:45:00",
			"occupation": 2
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 1
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:15:00",
			"occupation": 2
		}, {
			"hour": "19:30:00",
			"occupation": 2
		}, {
			"hour": "19:45:00",
			"occupation": 2
		}]
	}, {
		"dayOfWeek": 2,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 3
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 3
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 4
		}, {
			"hour": "13:45:00",
			"occupation": 4
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:15:00",
			"occupation": 3
		}, {
			"hour": "14:30:00",
			"occupation": 3
		}, {
			"hour": "14:45:00",
			"occupation": 3
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:30:00",
			"occupation": 1
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 1
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 1
		}, {
			"hour": "19:15:00",
			"occupation": 1
		}, {
			"hour": "19:30:00",
			"occupation": 1
		}, {
			"hour": "19:45:00",
			"occupation": 1
		}]
	}, {
		"dayOfWeek": 3,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:30:00",
			"occupation": 1
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 1
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 1
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 1
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 1
		}, {
			"hour": "12:45:00",
			"occupation": 4
		}, {
			"hour": "12:45:00",
			"occupation": 2
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 2
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 2
		}, {
			"hour": "13:30:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 2
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 2
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 2
		}, {
			"hour": "14:15:00",
			"occupation": 2
		}, {
			"hour": "14:30:00",
			"occupation": 2
		}, {
			"hour": "14:45:00",
			"occupation": 2
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:15:00",
			"occupation": 2
		}, {
			"hour": "19:30:00",
			"occupation": 2
		}, {
			"hour": "19:45:00",
			"occupation": 2
		}]
	}, {
		"dayOfWeek": 4,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 3
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 2
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 3
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 4
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 4
		}, {
			"hour": "14:00:00",
			"occupation": 3
		}, {
			"hour": "14:15:00",
			"occupation": 3
		}, {
			"hour": "14:30:00",
			"occupation": 3
		}, {
			"hour": "14:45:00",
			"occupation": 3
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 2
		}, {
			"hour": "18:30:00",
			"occupation": 1
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 3
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:15:00",
			"occupation": 2
		}, {
			"hour": "19:30:00",
			"occupation": 2
		}, {
			"hour": "19:45:00",
			"occupation": 2
		}]
	}, {
		"dayOfWeek": 5,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 1
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 1
		}, {
			"hour": "12:00:00",
			"occupation": 2
		}, {
			"hour": "12:15:00",
			"occupation": 1
		}, {
			"hour": "12:15:00",
			"occupation": 2
		}, {
			"hour": "12:30:00",
			"occupation": 2
		}, {
			"hour": "12:30:00",
			"occupation": 3
		}, {
			"hour": "12:45:00",
			"occupation": 2
		}, {
			"hour": "12:45:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 2
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 2
		}, {
			"hour": "13:15:00",
			"occupation": 3
		}, {
			"hour": "13:30:00",
			"occupation": 2
		}, {
			"hour": "13:30:00",
			"occupation": 3
		}, {
			"hour": "13:45:00",
			"occupation": 2
		}, {
			"hour": "13:45:00",
			"occupation": 3
		}, {
			"hour": "14:00:00",
			"occupation": 2
		}, {
			"hour": "14:00:00",
			"occupation": 4
		}, {
			"hour": "14:15:00",
			"occupation": 4
		}, {
			"hour": "14:30:00",
			"occupation": 4
		}, {
			"hour": "14:45:00",
			"occupation": 4
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 1
		}, {
			"hour": "18:45:00",
			"occupation": 2
		}, {
			"hour": "19:00:00",
			"occupation": 2
		}, {
			"hour": "19:15:00",
			"occupation": 2
		}, {
			"hour": "19:30:00",
			"occupation": 2
		}, {
			"hour": "19:45:00",
			"occupation": 2
		}]
	}, {
		"dayOfWeek": 6,
		"occupation": [{
			"hour": "11:00:00",
			"occupation": 1
		}, {
			"hour": "11:15:00",
			"occupation": 1
		}, {
			"hour": "11:30:00",
			"occupation": 2
		}, {
			"hour": "11:45:00",
			"occupation": 2
		}, {
			"hour": "12:00:00",
			"occupation": 3
		}, {
			"hour": "12:15:00",
			"occupation": 3
		}, {
			"hour": "12:30:00",
			"occupation": 4
		}, {
			"hour": "12:45:00",
			"occupation": 4
		}, {
			"hour": "13:00:00",
			"occupation": 4
		}, {
			"hour": "13:15:00",
			"occupation": 4
		}, {
			"hour": "13:30:00",
			"occupation": 4
		}, {
			"hour": "13:45:00",
			"occupation": 4
		}, {
			"hour": "14:00:00",
			"occupation": 4
		}, {
			"hour": "14:15:00",
			"occupation": 4
		}, {
			"hour": "14:30:00",
			"occupation": 4
		}, {
			"hour": "14:45:00",
			"occupation": 4
		}, {
			"hour": "17:00:00",
			"occupation": 1
		}, {
			"hour": "17:15:00",
			"occupation": 1
		}, {
			"hour": "17:30:00",
			"occupation": 1
		}, {
			"hour": "17:45:00",
			"occupation": 1
		}, {
			"hour": "18:00:00",
			"occupation": 1
		}, {
			"hour": "18:15:00",
			"occupation": 1
		}, {
			"hour": "18:30:00",
			"occupation": 1
		}, {
			"hour": "18:45:00",
			"occupation": 1
		}, {
			"hour": "19:00:00",
			"occupation": 1
		}, {
			"hour": "19:15:00",
			"occupation": 1
		}, {
			"hour": "19:30:00",
			"occupation": 1
		}, {
			"hour": "19:45:00",
			"occupation": 1
		}]
	}]
};

var monday = [];
var tuesday = [];
var wedne = [];

$.each(raw_quimicas_data, function() {
      $.each(this, function(k, v) {
          day_of_week = k;
          console.log(day_of_week);
          occupation = v;
      });
  });

});

function loadData(restaurant, dayOfWeek){
	$.ajax({
	  url: 'https://hackaton-usp-api.herokuapp.com/api/v1/occupation?restaurant='+restaurant,
	  success: function (data) {
	    console.log(data)
	  }
	});
}


function plotChart(dayOfWeek){

	


	var ctx = document.getElementById("myChart_"+dayOfWeek+"_l").getContext('2d');
      var myChart = new Chart(ctx, {
          type: 'line',
          data: {
            // label: ['Votes', 'askda'],
              // labels: ["11:15", "11:30", "11:45", "12:15", "12:30", "12:45", "13:15", "13:30", "13:45", "14:15"],
              datasets: [{
                  label: 'Lotação',

                  borderColor: 'rgb(11,130,151)',
                  backgroundColor: 'rgb(11,130,151,0.15)',
                  fill: true,
                    borderDash: [5, 10],
                  data: [

                    {
                      x: moment("11:15:00", "HH:mm:ss"),
                      y: 25
                    },
                    {
                      x: moment("11:30:00", "HH:mm:ss"),
                      y: 25
                    },
                    {
                      x: moment("11:45:00", "HH:mm:ss"),
                      y: 45
                    },
                    {
                      x: moment("12:00:00", "HH:mm:ss"),
                      y: 75
                    },
                    {
                      x: moment("12:15:00", "HH:mm:ss"),
                      y: 100
                    },
                    {
                      x: moment("12:30:00", "HH:mm:ss"),
                      y: 100
                    },
                    {
                      x: moment("12:45:00", "HH:mm:ss"),
                      y: 100
                    },
                    {
                      x: moment("13:00:00", "HH:mm:ss"),
                      y: 75
                    },
                    {
                      x: moment("13:15:00", "HH:mm:ss"),
                      y: 75
                    },
                    {
                      x: moment("13:30:00", "HH:mm:ss"),
                      y: 25
                    },
                    {
                      x: moment("13:45:00", "HH:mm:ss"),
                      y: 25
                    },
                    {
                      x: moment("14:00:00", "HH:mm:ss"),
                      y: 25
                    },
                    {
                      x: moment("14:15:00", "HH:mm:ss"),
                      y: 25
                    },

                  ],

                    // 30, 55, 60, 85, 88, 75, 54, 40, 35, 20, 6, 5, 2, 1, 10],
                  borderWidth: 1
              },


            ]
          },
          options: {
            // showAllTooltips: true,

            tooltips: {
              callbacks: {
                // title: (items, data) => data.datasets[items[0].datasetIndex].data[items[0].index].x,
                title: (items, data) => '',
                label: (item, data) => data.datasets[item.datasetIndex].data[item.index].y + '%'
              }
            },
              scales: {
                  yAxes: [{
                      type: 'linear',
                      scaleLabel: {
                        display: true,
                        labelString: "% Lotação"
                      },
                      ticks: {
                          beginAtZero:true,
                          stepSize: 25,
                          suggestedMax: 100
                      },
                      gridLines: {
                        display: true
                      }
                  }],
                  xAxes: [{
                    // scaleLabel: {
                    //   display: true
                    // },
                    type: 'time',
                    distribution: 'series',
                    time: {
                      unit: "minute",
                      // unitStepSize: 15,
                      displayFormats: {
                        minute: "HH:mm"
                      },
                      ticks: {
                          // stepSize: 0.5,
                          source: 'auto',
                          autoSkip: false,
                          offset: true,
                          beginAtZero:true
                      }

                    },
                      // bounds: {
                      //   ticks: true
                      // },

                  }]
              },
              elements: {
                  line: {
                      // tension: 0, // disables bezier curves
                  },
                  // yAxisID: 'oi'
              }
          }
      });
}
