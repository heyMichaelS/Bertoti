# Michael Felipe Santos Silva
## RA 1460282123026
# Padrões de  Projetos de Sistemas 4°BD-Noite



<table>
  <thead>
    <tr>
      <th>Padrão</th>
      <th>Antipadrão</th>
      <th>Descrição</th>
      <th>Problema Resolvido</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Strategy</td>
      <td>Herança</td>
      <td>Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.</td>
      <td>Permite escolher um algoritmo em tempo de execução, evitando a necessidade de múltiplos condicionais para lidar com diferentes comportamentos.</td>
    </tr>
    <tr>
      <td>Observer</td>
      <td>Acoplamento excessivo</td>
      <td>Define uma dependência um-para-muitos entre objetos, de forma que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.</td>
      <td>Permite o desacoplamento entre o sujeito observado e os observadores, permitindo que diferentes objetos sejam notificados de mudanças de estado sem que precisem conhecer uns aos outros.</td>
    </tr>
    <tr>
      <td>Singleton</td>
      <td>Diversas instâncias da mesma classe</td>
      <td>Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso para ela.</td>
      <td>Resolve o problema de garantir que uma classe tenha apenas uma instância, útil quando é necessário compartilhar uma única instância em todo o sistema.</td>
    </tr>
    <tr>
      <td>Composite</td>
      <td>Tratamento diversificado de classes</td>
      <td>Permite que objetos sejam agrupados em estruturas de árvore para representar hierarquias parte-todo. Os clientes podem tratar objetos individuais e composições de forma uniforme.</td>
      <td>Resolve o problema de tratar objetos individuais e coleções de objetos de maneira uniforme, permitindo que os clientes sejam indiferentes à diferença entre objetos individuais e composições.</td>
    </tr>
    <tr>
      <td>Facade</td>
      <td> Classe Fachada sobrecarregada de funcionalidades/responsabilidades</td>
      <td>Fornece uma interface simplificada para um conjunto complexo de subsistemas, tornando mais fácil de usar e reduzindo a dependência entre o cliente e os subsistemas.</td>
      <td>Resolve o problema de complexidade desnecessária, fornecendo uma fachada que encapsula a funcionalidade dos subsistemas e fornece uma interface simples para o cliente.</td>
    </tr>
  </tbody>
</table>

<h3



# Observer
<img src="https://user-images.githubusercontent.com/81486915/204660216-35816772-382b-4f6a-816f-bc9cc5be565a.png">

# Composite

 ![composite drawio](https://user-images.githubusercontent.com/118699747/233846314-f42781ef-ebe3-4cea-95d7-6ca1e9809176.png)

# Facade

![composite-Página-3 drawio](https://user-images.githubusercontent.com/118699747/233846429-bd1c238f-b1aa-4d54-9a13-c042978999e7.png)

# Singleton

![Singleton](https://github.com/heyMichaelS/Bertoti/assets/118699747/03524ec9-9b48-4ada-ba76-47c977925b6b)

 
# Strategy

![Strategy drawio (1)](https://user-images.githubusercontent.com/118699747/233846540-83137772-a38a-4928-94f0-e46abb0ed9a9.png)
