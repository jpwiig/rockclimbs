

function getRoutes(chckroute,list) {

    for(let i = 0; i<list.length; i++){
        if (list[i] == chckroute) return true;
    }
//ajax call for the routes avaible
}

$(()=>({
    $:("#searchclk").click(() => {
        alert("a")
        getRoutes(document.getElementById("search-input"), $.get("api/test/", () => {
        }));

    })
}))

