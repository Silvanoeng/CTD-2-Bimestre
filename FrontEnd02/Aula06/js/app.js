

const listaDeFelinos = [
    {
        title: 'O tigre',
        nome: 'Tigre',
        id: 'tigre',
        imgUrl: './img/tigre.jpg',
        description: 'O Tigre (Panthera tigris) é uma das espécies da subfamília dos panterinos (família Felidae) pertencente ao gênero Panthera. Só é encontrado no continente asiático; É um predador carnívoro e é a maior espécie de felino do mundo, junto com o leão, podendo ambos atingir um tamanho comparável ao dos maiores fósseis de felinos.',
        createdAt: '2021-06-01T23:12:11.837Z'
    },
    {
        title: 'O leão',
        nome: 'Leão',
        id: 'leao',
        imgUrl: './img/leao.jpg',
        description: 'O leão (Panthera leo) é um mamífero carnívoro da família dos felídeos que é uma das cinco espécies do gênero Panthera. Leões selvagens vivem em populações cada vez mais dispersas e fragmentadas na África Subsaariana (com exceção das regiões de selva da costa atlântica e da Bacia do Congo) e em uma pequena área do noroeste da Índia',
        createdAt: '2021-05-05T23:12:11.837Z'
    },
    {
        title: 'O leopardo',
        nome: 'Leopardo',
        id: 'leopardo',
        imgUrl: './img/leopardo.jpg',
        description: 'O leopardo (Panthera pardus) é um mamífero carnívoro da família dos felídeos. Como três dos outros gatos do gênero Panthera: o leão, o tigre e a onça, eles se caracterizam por uma modificação no osso hióide que lhes permite rugir. É também conhecida como pantera marrom e, quando tem a pelagem totalmente escura, como pantera negra (melânica).',
        createdAt: '2021-05-05T23:12:11.837Z'
    },
    {
        title: 'A pantera negra',
        nome: 'Pantera Negra',
        id: 'pantera-negra',
        imgUrl: './img/pantera-negra.jpg',
        description: 'A pantera negra é uma variação negra (melanismo) de várias espécies de grandes felinos, principalmente o leopardo (Panthera pardus) e a onça pintada (Panthera onca). Mas deve-se ressaltar que não é uma espécie nova, nem mesmo uma subespécie, é simplesmente uma variação negra desses animais.',
        createdAt: '2021-04-09T23:12:11.837Z'
    },
    {
        title: 'O jaguar',
        nome: 'Jaguar',
        id: 'jaguar',
        imgUrl: './img/jaguar.jpg',
        description: 'O jaguar, jaguar ou yaguareté (Panthera onca) é um felino carnívoro da subfamília dos Panterinos e gênero Panthera. É a única das cinco espécies atuais desse gênero encontradas na América. É também o maior felino da América e o terceiro maior do mundo, depois do tigre (Panthera tigris) e do leão (Panthera leo).',
        createdAt: '2021-05-18T23:12:11.837Z'
    },
    {
        title: 'O guepardo',
        nome: 'Guepardo',
        id: 'guepardo',
        imgUrl: './img/chita.jpg',
        description: 'A chita (Acinonyx jubatus) 1 é um membro atípico da família dos felídeos. É o único representante vivo do gênero Acinonyx. Ele caça graças à sua visão e grande velocidade. É o animal terrestre mais rápido, atingindo velocidade máxima de 115 km / h em corridas de até quatrocentos ou quinhentos metros.',
        createdAt: '2021-05-22T23:12:11.837Z'
    },
];

let contador = 0;

function alimentarFelinos() {

    let divContainerFelinos = document.querySelector('div.containerFelinos');

    if (contador < listaDeFelinos.length) {

        let divFelinos = document.createElement('div');
        divFelinos.classList.add('felinos');

        let divId = document.createElement('div');
        divId.id = listaDeFelinos[contador].id;
        divId.classList.add('divId');
        
        divContainerFelinos.appendChild(divId);
        divContainerFelinos.appendChild(divFelinos);
        

        

        let title = document.createElement('h2');
        title.innerHTML = listaDeFelinos[contador].title;  


        let felinoAlimentado = document.querySelector('h3.felinoAlimentado')
        if(contador<listaDeFelinos.length && contador>0){
            felinoAlimentado.innerHTML += "  ";
        }

        let linkFelino = document.createElement("a")
        linkFelino.href = "#" + listaDeFelinos[contador].id;
        linkFelino.classList.add('linkFelino');
        linkFelino.innerHTML += listaDeFelinos[contador].nome;
        
        felinoAlimentado.appendChild(linkFelino);
        
        let imgUrl = document.createElement("img");
        imgUrl.src = listaDeFelinos[contador].imgUrl;

        let description = document.createElement("h3");
        description.classList.add('textoFelinos')
        description.innerHTML = listaDeFelinos[contador].description;

        let createdAt = document.createElement("h6");
        createdAt.innerHTML = listaDeFelinos[contador].createdAt;

        
        divFelinos.appendChild(title);
        divFelinos.appendChild(imgUrl);
        divFelinos.appendChild(description);
        divFelinos.appendChild(createdAt);

        contador++;

    }else {
        return alert('Estão todos alimentados.');
    }

}
