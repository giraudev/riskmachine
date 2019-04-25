RISKMACHINE

Premissas:
- Uso de JPA, SQL, FlyWay, Spring;
- Criaçao de duas entidades, `TAX` (para facilitar a adição e exclusão de novos tipos de riscos) e 'RISK' (que armazenará somente
o risco + taxa selecionada pelo usuário);
- Uso de POST para criar e salvar e GET para retornar todas as entidades;
- Uso de plugin Lombok para deixar o código mais limpo;
- Uso de DTO para não expor o domínio;
- Sem front, usuário colocará o nome e valor do limite de crédito, retornaremos uma lista de cálculo com base em todos
os tipos de riscos armazenados na base;

Focando em resolver o problema e levando em conta a execução do teste durante uma noite, estes são os gaps
- Sem tratamento de exception;
- Sem testes unitários e de integração;
- Sem documentação de código, tipo swagger;
- Sem uso de container;
- Sem aplicação de autenticação (role)
- Uso de banco embarcado (H2);
