
let list;


$(()=>({
   /* $("#searchclk").click(() => {
        console.log("Lættis")
        $.get("/api/test/", (list) => {
            getRoutes(list);
        })

    })*/

    $("#ListOfPlaces").click(
        $.get("/api/test/", (list) => {
            getRoutes(list)
        }))

}))
function getRoutes(list) {

    for(let i = 0; i<list.length; i++){
        $("#results").append(list[i]);
        console.log(list);
        console.log("hei")
    }
//ajax call for the routes avaible
}
