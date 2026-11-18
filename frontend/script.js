console.log('hello world');

let botao = document.querySelectorAll(".quantidade-button");
let vinhos = document.querySelector(".vinhos");

fetch("http://localhost:8080/vinhos/listar")
    .then(Response => {
        console.log(Response.status);
        console.log(Response.ok);
        return Response.json();
    })
    .then(Data => {
        console.log(Data);
        Data.forEach(function (vinho) {
        });
    });

botao.forEach(function (botoes) {
    botoes.addEventListener("click", function () {
        let contador = botoes.textContent;

        if (contador === "+") {
            const div = botoes.parentElement;
            const input = div.querySelector(".quantidade-input");
            input.value = Number(input.value) + 1;
        } else {
            const div = botoes.parentElement;
            const input = div.querySelector(".quantidade-input");
            input.value = Math.max(0, Number(input.value) - 1);
        }
    });
});



