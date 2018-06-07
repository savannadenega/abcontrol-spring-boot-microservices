# Abcontrol | Spring Boot | Microservices

POC para desenvolvimento de uma aplicação com Microservices, com a utilização de Spring Boot, para a disciplina de Desenvolvimento de Software II Unisinos-2018.

_ABControl é um software que irá auxiliar no controle de tarefas, recursos humanos, prazos, materiais, orçamento, estoque e qualidade para uma empresa chamada Construtora ABC que é uma companhia que presta serviços no ramo da construção civil. O software visa melhorar a comunicação com clientes e fornecedores, e melhorar o acesso à informação dos projetos._

### Recursos utilizados

- Microservices
- Spring Boot

------------------------------------------------------------------------------------------------------------------

### Como configurar o ambiente:

- Faça clone do projeto;
- Importe o projeto para sua IDE de preferência via pom (Maven).

### Realizando testes nos serviços

- Para realizar testes utilize um navegador de sua preferência ou por exemplo, utilize uma extensão para navegador no modelo `http request`, por exemplo, utilizamos para nossos testes o Postman, uma extensão do Google Chrome;
- No endereço `http://localhost:8080` execute as operações disponíveis.  

Exemplo de operação de GET: `http://localhost:8080/tarefas`  
_Esta operação retorna todas as tarefas disponíveis na base de dados._

Exemplo de operação de POST: `http://localhost:8080/tarefas`
_Esta operação adiciona uma tarefa na base de dados._
```
    {
        "id": 4,
        "nome": "Contratar empregados",
        "descricao": "Contratar empregados",
        "prioridade": "Alta",
        "status": null,
        "dataComecoRealizacao": null,
        "dataEstimadaEntrega": null,
        "usuario": null,
        "material": null,
        "anexo": null
    }
```

