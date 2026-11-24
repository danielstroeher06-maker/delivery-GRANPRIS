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
        vinhos.innerHTML = ("");
        Data.forEach(function (vinho) {
            const div = document.createElement("div");
            div.className = "vinho";
            vinhos.append(div);
            const title = document.createElement("h4");
            title.textContent = vinho.nome;
            div.append(title);
            const tipo = document.createElement("span");
            tipo.className = "tipo";
            tipo.textContent = vinho.tipoUva;
            div.append(tipo);
            const descri = document.createElement("p");
            descri.textContent = vinho.descricao;
            div.append(descri);
            const preco = document.createElement("span");
            preco.classPreco = "preço";
            preco.textContent = vinho.preco;
            div.append(preco);
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



