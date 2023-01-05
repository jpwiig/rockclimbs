let list;


$(() => {
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
    for(let i  of routes){
        out += i.
    }
}