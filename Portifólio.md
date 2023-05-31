# Michael Felipe Santos Silva
Metodologia da Pesquisa Cientifico Tecnologica

## Introdução
Olá seja bem vindo,Sou Michael, estudante de Banco de Dados pela FATEC Prof.Jasseb Vidal.

Tenho 27 anos e trabalho como Estagiario em QA.

<html>
  <body>
     <table align="center">
     <tr>
       <p align="center"><img src="https://github.com/fluffyfatec/Iacit/blob/Sprint-1/GIT/cabecario%20(3).jpg" width="100%" height="100%"></img></p>
     </tr>
    </table>

## Empresa parceira

A IACIT é uma empresa brasileira, fundada em 1986, e com sede em São José dos Campos (SP), um dos principais polos tecnológicos do Brasil e do mundo.

São 36 anos de experiência que começaram com a prestação de suporte técnico à Tecnasa, fabricante de equipamentos para o segmento de navegação aérea. Desde então, a empresa é impulsionada pelos constantes esforços para ampliar suas referências e conquistar novos mercados.

<h1>Portifólio da 3°API</h1>
<p align="justify"> Portfólio das Aprendizagens a partir de Projeto Integrador (APIs),
apresentado à Faculdade de Tecnologia de São José dos Campos,
como parte dos requisitos necessários para a obtenção do título de Tecnólogo em Banco de Dados.</p>
<hr>
<h2><li><b>Descrição do Projeto</b></li></h2>
    <p align="justify">
      <a href="https://github.com/heyMichaelS/Iacit">#DASHBOARD METEOROLÓGICO</a> Foi elaborado um programa online para a empresa Iacit que permite automatizar o download, processamento e armazenamento simplificado dos dados meteorológicos no banco de dados. Além disso, será possível filtrar esses dados por temperatura, umidade, estações, vento, pressão atmosférica, radiação solar e precipitação, bem como visualizá-los de várias formas. Além disso, foram desenvolvidos diferentes níveis de usuários, juntamente com um painel administrativo, que permite exportar relatórios com base nos dados obtidos.
    </p>

<h2>Tecnologias Utilizadas</h2>
    <details open>
<summary>Front-End</summary>

* JavaScript
* HTML
* CSS
* ChartJs

</details>

 <details open>
<summary>Back-End</summary>

* Java
* Python
* Spring boot

</details>

<details open>
<summary>Banco de Dados</summary>

* PostgresSQL

</details>

<details open>
<summary>Reuniões e Comunicação</summary>

* Discord
* Whatsaap
* Slack

</details>

<details open>
<summary>Outras Ferramentas</summary>

* Github
* Eclipse IDE
* Intellij IDE
* Azure DevOps
* Photoshop

</details>
    

Minha atuação como desenvolvedor do grupo Fluffy fiquei na parte do front-end onde tivemos uma missão de criar um deashbord intuitivo que fosse possivel ter a visualização de algumas formas de dados meterologicos
<br>
 
# Contribuicoes individuais

<details open>
 <summary>Plotar Graficos</summary>
  
  ```
  let tipo = ''

function btnlinha(){
    tipo = 'line'
    gerarGrafico()
}

function btnhist(){
    tipo = 'bar'
    gerarGrafico()
}


function gerarGrafico(){

    if (tipo == 'line'){ //LINHA///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        const ctx = document.getElementById('grafico').getContext('2d');
        const myChart = new Chart(ctx, {
            type: tipo,
            data: {
                labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
                datasets: [{
                    label: '# of Votes',
                    data: [12, 19, 3, 5, 2, 3],
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)',
                        'rgba(153, 102, 255, 0.2)',
                        'rgba(255, 159, 64, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)',
                        'rgba(153, 102, 255, 1)',
                        'rgba(255, 159, 64, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });

    } else { //HISTOGRAMA///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        const ctx = document.getElementById('grafico').getContext('2d');
        const myChart = new Chart(ctx, {
          type: 'bar',
          data: {
            labels: [0, 1, 2, 3, 4, 5],
            datasets: [{
              label: 'Number of Arrivals',
              data: [12, 19, 3, 5, 2, 3],
              backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            }]
          },
          options: {
            scales: {
              xAxes: [{
                display: false,
                barPercentage: 1.3,
                ticks: {
                  max: 3,
                }
              }, {
                display: true,
                ticks: {
                  autoSkip: false,
                  max: 4,
                }
              }],
              yAxes: [{
                ticks: {
                  beginAtZero: true
                }
              }]
            }
          }
        });
    }

}
  
  ```
</details>



<details open>
 <summary>Desenvolvi telas do deashbord</summary>
  
  ```
  
  
  ```
</details>


<details open>
 <summary> Desenvolvi a tabela juntamente com a paginação</summary>
  
  ```
  // get the table element
var $table = document.getElementById("tabelaPrecipitacao"),
// number of rows per page
$n = 16,
// number of rows of the table
$rowCount = $table.rows.length,
// get the first cell's tag name (in the first row)
$firstRow = $table.rows[0].firstElementChild.tagName,
// boolean var to check if table has a head row
$hasHead = ($firstRow === "TH"),
// an array to hold each row
$tr = [],
// loop counters, to start count from rows[1] (2nd row) if the first row has a head tag
$i,$ii,$j = ($hasHead)?1:0,
// holds the first row if it has a (<TH>) & nothing if (<TD>)
$th = ($hasHead?$table.rows[(0)].outerHTML:"");
// count the number of pages
var $pageCount = Math.ceil($rowCount / $n);
// if we had one page only, then we have nothing to do ..
if ($pageCount > 1) {
  // assign each row outHTML (tag name & innerHTML) to the array
  for ($i = $j,$ii = 0; $i < $rowCount; $i++, $ii++)
    $tr[$ii] = $table.rows[$i].outerHTML;
  // create a div block to hold the buttons
  $table.insertAdjacentHTML("afterend","<div id='buttons'></div");
  // the first sort, default page is the first one
  sort(1);
}

// ($p) is the selected page number. it will be generated when a user clicks a button
function sort($p) {
  /* create ($rows) a variable to hold the group of rows
  ** to be displayed on the selected page,
  ** ($s) the start point .. the first row in each page, Do The Math
  */
  var $rows = $th,$s = (($n * $p)-$n);
  for ($i = $s; $i < ($s+$n) && $i < $tr.length; $i++)
    $rows += $tr[$i];
  
  // now the table has a processed group of rows ..
  $table.innerHTML = $rows;
  // create the pagination buttons
  document.getElementById("buttons").innerHTML = pageButtons($pageCount,$p);
  // CSS Stuff
  document.getElementById("id"+$p).setAttribute("class","chart");
}


// ($pCount) : number of pages,($cur) : current page, the selected one ..
function pageButtons($pCount,$cur) {
  /* this variables will disable the "Prev" button on 1st page
     and "next" button on the last one */
  var $prevDis = ($cur == 1)?"disabled":"",
    $nextDis = ($cur == $pCount)?"disabled":"",
    /* this ($buttons) will hold every single button needed
    ** it will creates each button and sets the onclick attribute
    ** to the "sort" function with a special ($p) number..
    */
    $buttons = "<input class='chart' type='button' value='&lt;&lt; Anterior' onclick='sort("+($cur - 1)+")' "+$prevDis+">";
  for ($i=1; $i<=$pCount;$i++)
    $buttons += "<input  class='chart' type='button' id='id"+$i+"'value='"+$i+"' onclick='sort("+$i+")'>";
  $buttons += "<input class='chart' type='button' value='Próximo &gt;&gt;' onclick='sort("+($cur + 1)+")' "+$nextDis+">";
  return $buttons;
}
  
  ```
</details>




<details open>
 <summary>Auxilei também na exportação tanto das tabelas quanto dos graficos em pdf</summary>
  
  ```
  function jsGraficosPDF(chart1, chart2, tela) {

    const canvas = document.getElementById(chart1);
    const canvas2 = document.getElementById(chart2);

    //criando a imagem a partir do gráfico
    const canvasImage = canvas.toDataURL('image/png', 1);
    const canvasImage2 = canvas2.toDataURL('image/png', 1);

    //variáveis para o texto do PDF
    var estado = document.getElementById('estado');
    var estacao = document.getElementById('estacao');
    var dataMin = document.getElementById('dtMin');
    var dataMax = document.getElementById('dtMax');

    //passando a imagem para o pdf
    let pdf = new jsPDF('landscape');
    pdf.setFontSize(24);
    pdf.setFont('helvetica', 'bold');
    pdf.text(15, 15, ["Estação " + estacao.innerText + ", Estado de " + estado.innerText, " "]);
    pdf.setFont('helvetica', '');
    pdf.text(15, 15, [" ", "Dados de " + dataMin.innerText + " até " + dataMax.innerText]);
    pdf.addImage(canvasImage, 'PNG', 10, 35, 275, 150);
    pdf.addPage();
    pdf.addImage(canvasImage2, 'PNG', 10, 30, 275, 150);
    pdf.save('Gráficos ' + tela + ' (' + estacao.innerText + ').pdf');

}

  
  ```
</details>


# Aprendizados Efetivos
<br>
  
Trabalhar no projeto da IACIT foi uma experiência enriquecedora para o meu desenvolvimento como profissional na área de front-end. Durante o projeto, fui responsável por diversas tarefas que contribuíram significativamente para a criação de um dashboard eficiente e intuitivo.

Uma das tarefas que executei foi a plotagem de gráficos, onde pude aplicar meus conhecimentos em bibliotecas de visualização de dados, como o Chart.js. Essa atividade me permitiu explorar diferentes tipos de gráficos, como gráficos de linha, barras e histograma, e apresentar as informações meteorológicas de forma clara e atraente.

Além disso, fui encarregado de desenvolver as telas do dashboard, garantindo uma interface amigável e responsiva. Utilizando tecnologias como HTML, CSS e JavaScript, pude criar um layout intuitivo, facilitando a visualização e a interação dos usuários com os dados meteorológicos.

Outra tarefa importante que desempenhei foi o desenvolvimento da tabela, juntamente com a implementação da paginação. Por meio de frameworks como Bootstrap Table, pude criar uma tabela dinâmica que exibisse os dados de forma organizada e permitisse a navegação por várias páginas. Isso tornou a experiência do usuário mais agradável, permitindo uma fácil visualização dos dados.

Além disso, tive a oportunidade de auxiliar na implementação da funcionalidade de exportação, tanto das tabelas quanto dos gráficos, em formato PDF. Essa funcionalidade permitiu que os usuários do sistema pudessem salvar e compartilhar os dados de forma conveniente e portátil.

Essas tarefas desempenhadas no projeto da IACIT contribuíram significativamente para o meu crescimento profissional no campo do front-end. Aprendi a trabalhar com tecnologias avançadas, melhorar minhas habilidades de design de interface e me familiarizar com a manipulação de dados em tempo real. Estou orgulhoso do meu envolvimento no projeto e grato pela oportunidade de aprimorar minhas habilidades no front-end.
