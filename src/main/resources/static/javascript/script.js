let list;


$(() => {
    console.log("ready sire");
    /* $("#searchclk").click(() => {
         console.log("Lættis")
         $.get("/api/test/", (list) => {
             getRoutes(list);
         })

     })*/

    $("#ListOfPlaces").click(

        $.get("/api/test/", (routes) => {
              getRoutes(routes)
          }),
        console.log("funk")
    )
})


function printroutes(routes){
    let out;
    console.log("Routes: " + routes)
    for(let i  of routes){
        out += "<option>" + i.name + i.grade + "</option>";
    }
}