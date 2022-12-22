
let list;


$(()=> {
    /* $("#searchclk").click(() => {
         console.log("Lættis")
         $.get("/api/test/", (list) => {
             getRoutes(list);
         })

     })*/

    $("#ListOfPlaces").click(
      /*  $.get("/api/test/", (list) => {
            getRoutes(list)
        })*/
    console.log("funk")

    )
})


function getRoutes(list) {

    for(let i = 0; i<list.length; i++){
        $("#results").append(list[i]);
        console.log(list);
        console.log("hei")
    }
    let grade;
    function TypeofGrade(grade){

        //get logic on place, then create in db
        let gradestype = {
            French : ["4a", "4b", "4c", "5a", "5b", "5c" ],
            UIAA : ["IV", "IV+", "V", "V+"],
            Yosemite : ["5.5","5.6","5.7", "5.8"]
        }
    }
//ajax call for the routes avaible
}
