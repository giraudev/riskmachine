<h2>RISKMACHINE</h2>

<h3>Instruções:</h3>
<p>- abrir o terminal;<br />
- digitar: git clone https://github.com/giraudev/riskmachine.git;<br />
- importar o projeto na IDE de sua preferência;<br />
- desejável que já possua gradle(<https://gradle.org/install/>), postman (https://www.getpostman.com/downloads/) <br /> e lombok
(https://plugins.gradle.org/plugin/io.freefair.lombok);<br />
- build: ./gradlew clean build<br />
- run: gradle bootRun<br />
- a aplicação rodará em: http://localhost:8080
- URl's:
       <p> - POST_http://localhost:8080/risk/data<br />
          REQUEST: <pre><code>{"nomeDoCliente":"Gabriela","limiteDeCredito":120}</code></pre></p>
       <p> - POST_http://localhost:8080/risk/save<br />
        REQUEST: <pre><code>{"nomeDoCliente":"LOJOF","limiteDeCredito":120000,</code></pre><br />
        <pre><code>"riscos":{"tipoDeRisco": "C","valorTotal": 132000,"taxa": 10}}</code></pre></p>
          - GET_http://localhost:8080/risk/data<br /><br />



<h3>Premissas:</h3>
- Uso de JPA, SQL, FlyWay, Spring;<br />
- Criaçao de duas entidades, `TAX` (para facilitar a adição e exclusão de novos tipos de riscos) e 'RISK' (que armazenará <br />somente o risco + taxa selecionada pelo usuário);<br />
- Uso de POST para criar e salvar e GET para retornar todas as entidades;<br />
- Uso de plugin Lombok para deixar o código mais limpo;<br />
- Uso de DTO para não expor o domínio;<br />
- Sem front, usuário colocará o nome e valor do limite de crédito, retornaremos uma lista de cálculo com base em todos
os tipos de riscos armazenados na base;<br />

Focando em resolver o problema e levando em conta a execução do teste durante uma noite, estes são os <br />
<h3>Gaps:</h3>
- Sem tratamento de exception;
- Sem testes unitários e de integração;
- Sem documentação de código, tipo swagger;
- Sem uso de container;
- Sem aplicação de autenticação (role)
- Uso de banco embarcado (H2);
