
let list;


$(()=>({
    $:("#searchclk").click(() => {
        alert("a")
        $.get("/api/test/", (list) => {
            getRoutes(list);
        })

    })
}))
function getRoutes(list) {

    for(let i = 0; i<list.length; i++){
        $("#results").append(list[i]);
        console.log(list);
    }
//ajax call for the routes avaible
}
