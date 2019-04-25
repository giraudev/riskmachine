<h2>RISKMACHINE</h2>

*Instruções:*
- abrir o terminal;<br />
- Digitar: git clone https://github.com/giraudev/riskmachine.git;<br />
- Importar o projeto na IDE de sua preferência;<br />
- Desejável que já possua gradle(<https://gradle.org/install/>), postman (https://www.getpostman.com/downloads/) e <br /> lombok(https://plugins.gradle.org/plugin/io.freefair.lombok);
- build: ./gradlew clean build<br />
- run: gradle bootRun<br />
- a aplicação rodará em: http://localhost:8080
- URl's:
       <p> - POST_http://localhost:8080/risk/data<br />
          REQUEST: {"nomeDoCliente":"Gabriela","limiteDeCredito":120}</p>
       <p> - POST_http://localhost:8080/risk/save<br />
        REQUEST:{"nomeDoCliente":"LOJOF","limiteDeCredito":120000,<br />"riscos":{"tipoDeRisco": "C","valorTotal": 132000,"taxa": 10}}</p>
          - GET_http://localhost:8080/risk/data<br /><br />

*Premissas:*
- Uso de JPA, SQL, FlyWay, Spring;<br />
- Criaçao de duas entidades, `TAX` (para facilitar a adição e exclusão de novos tipos de riscos) e 'RISK' (que armazenará <br />somente o risco + taxa selecionada pelo usuário);<br />
- Uso de POST para criar e salvar e GET para retornar todas as entidades;<br />
- Uso de plugin Lombok para deixar o código mais limpo;<br />
- Uso de DTO para não expor o domínio;<br />
- Sem front, usuário colocará o nome e valor do limite de crédito, retornaremos uma lista de cálculo com base em todos
os tipos de riscos armazenados na base;<br />

Focando em resolver o problema e levando em conta a execução do teste durante uma noite, estes são os *Gaps:*
- Sem tratamento de exception;
- Sem testes unitários e de integração;
- Sem documentação de código, tipo swagger;
- Sem uso de container;
- Sem aplicação de autenticação (role)
- Uso de banco embarcado (H2);
