console.log("Bem-vindos ao DHBank!")
//Simula a requisição para o banco de dados.
const contaBancaria = {
    usuario: "Patolino",
    situacao: "Ativo",
    valorConta: 500,58
}

let minhaPromise = new Promise((resolve, reject) =>{
    // Chamamos um resolve (...) quando o que estavamos fazendo termina com sucesso e o reject (...) quando falha.
    // Neste exemplo, usamos um setTimeout(...) para simular código Assíncrono, por exemplo, um pedido ao servidor.
    //Na "vida real", recorremos a uma função fetch() [próxima aula]

    setTimeout(function(){
        if (contaBancaria.valorConta<1){
            reject({
                mensagem: "Saldo insuficiente na conta."
            });
        } else if (contaBancaria.situacao!=="Ativo"){
            reject({
                mensagem: "A conta não se encontra ativa."
            });
        } else {
            reject({
                mensagem: "A transação foi realizada com sucesso."
            });
        }
    }, 2500)
});


let tentativa;
const caixa = document.querySelector('.bancoMobile')
minhaPromise.then((resposta)=>{
    tentativa = resposta.mensagem;
    console.log(tentativa)
    caixa.innerHTML=`<h4> ${tentativa.mensagem} </h4>`
    console.log(tentativa)
}).catch((erro)=>{
    tentativa = erro.mensagem;
    console.log(tentativa)
    caixa.innerHTML=`<h4> ${tentativa} </h4>`
    
})