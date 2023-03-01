let list;
let test
$(() => {
    let route = {
        name : null,
        grade : null,

    }
    console.log("ready sire");
    /* $("#searchclk").click(() => {
         console.log("Lættis")
         $.get("/api/test/", (list) => {
             getRoutes(list);
         })

     })*/
//test to make sure that everything is connected
    $("#ListOfPlaces").click(
        //const i;
        $.get("api/test/", test,() => {
            console.log(test)
          })
    )
})


function printroutes(routes){
    let out;
    for(const i  of routes){
        out += "<option>" + i.name + i.grade + "</option>";
    }
}