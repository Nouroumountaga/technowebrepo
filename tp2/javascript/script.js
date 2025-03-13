const ctx = document.querySelector('#myChart');
const graph = document.querySelector("#myChart2");
const graph3 = document.querySelector("#myChart3");

new Chart(ctx, {
    type: 'bar',
    data: {
    labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
    datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1,
        backgroundColor: [
        'rgba(255, 99, 132, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(255, 205, 86, 0.2)',
        'rgba(75, 192, 192, 0.2)',
        'rgba(153, 102, 255, 0.2)',
        'rgba(255, 159, 64, 0.2)'
     ],
        borderColor:[
        'rgb(255, 99, 132)',
        'rgb(54, 162, 235)',
        'rgb(255, 205, 86)',
        'rgb(75, 192, 192)',
        'rgb(153, 102, 255)',
        'rgb(255, 159, 64)'
     ]
    }]
    },
    options: {
    scales: {
        y: {
        beginAtZero: true
        }
    }
    }
});


new Chart(graph,{
    type:"doughnut",
    data:{
        labels:["Je suis mort","Je suis en train de mourir","Je n'ai pas entendu la sonnerie"],
        datasets:[{
            label:"Ce que pense ma mère quand je ne réponds pas au téléphone",
            data:[48,48,4],
            borderWidth:0,
            backgroundColor: [
                'rgb(255, 99, 132)',
                'rgb(54, 162, 235)',
                'rgb(255, 205, 86)'
              ],            
        }]
    },
})

new Chart(graph3,{
    type:"line",
    data: {
        labels: [2000 , 2001 , 2002 , 2003 , 2004, 2005,2006,2007,2008,2009],
        datasets: [
        {
            label : 'Consommation de margarine par habitat',
            data: [9, 8, 7,7, 6.5, 4, 4.5 , 4.3, 3.5],
            fill: false,
            borderColor: 'rgb(22, 81, 190)',
            tension: 0.1
        },
        {   
            label:"Taux de  divorce dans le maine",
            data: [8, 7 ,6.8 ,6.8 , 6.5 , 4,4.2,4.1, 4.0],
            fill: false,
            borderColor: 'rgb(231, 0, 0)',
            tension: 0.1,
        },
        {yAxisID : "B"},
    ]
    },
    options:{
        scale:{
            A:{
                position:"left"
            },
            B:{
                position:"right"
            }
        }
    }
})
var map = L.map('map').setView([49.244, 4.063], 17);

const tiles = L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
		maxZoom: 19,
		attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
	}).addTo(map);