# Projeto Controle de Acesso! :closed_lock_with_key::bar_chart:

Sistema de controle de acesso inteligente, desenvolvido em Java, para um estabelecimento fictício que irá categorizar as pessoas que acessam o estabelecimento em três grupos: _menores de 18 anos, adultos entre 18 e 49 anos e pessoas com 50 anos ou mais_. O objetivo é que o sistema apresente um relatório que auxilie o cliente na tomada de decisões para alcançar ou fidelizar a clientela.

O sistema apresenta um **menu interativo com as opções de acesso ao estabelecimento e finalização do sistema com a geração do relatório**. O fluxo do sistema é definido em duas etapas principais: inserir a idade do cliente e finalizar o sistema para gerar o relatório. Após a inserção da idade, o sistema irá liberar a catraca e exibir uma mensagem adequada de acordo com a categoria de idade. O ciclo se repete até que a opção de finalização seja escolhida e o relatório seja gerado. Esse relatório é crucial para que o proprietário possa traçar estratégias e tomar decisões que impactem positivamente no aumento do lucro e consequentemente, gerando mais empregos!

<details>
  <summary><strong>Fluxograma</strong></summary><br />
    <img src="img/controle-acesso.png" alt="SistemaFluxograma">
</details>
<details>
  <summary><strong>Rodando Localmente a Aplicação</strong></summary><br />
  
  <p>Para executar a aplicação e os testes, siga os passos abaixo:</p>
  <ol>
    <li>Clone o projeto.</li>
    <li>Abra o terminal e navegue até a raiz do projeto.</li>
    <li>Instale as dependências com o comando <code>mvn install</code>.</li>
    <li>Importe o projeto para sua IDE</li>
    <li>Para iniciar a interação com menu utilizae <code>Run As Java Application</code></li>
  </ol>
</details>
<details>
  <summary><strong>Demonstração</strong></summary><br />
  
  **EXEMPLO -**
      <p>Conteúdo do console depois de inserir a idade da primeira pessoa cliente será:</p>
  
````
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostar relatório
1
Entre com a sua idade:
18
Pessoa adulta, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostrar relatório
````
  
  **EXEMPLO -** 
    <p>Saída do relatório, considerando que 173 pessoas visitaram o estabelecimento, das quais 34 eram menores de 18 anos, 108 eram adultas entre 18 e 49 anos de idade, e 31 tinham a partir de 50 anos:</p>
  
````
----- Quantidade -----
menores: 34
adultas: 108
a partir de 50: 31

----- Percentual -----
menores: 19.65%
adultas: 62.43%
a partir de 50: 17.92%

TOTAL: 173
````
</details>
