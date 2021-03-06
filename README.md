# Abcontrol | Spring Boot | Microservices

POC para desenvolvimento de uma aplicação com Microservices, com a utilização de Spring Boot.

_ABControl é um software que irá auxiliar no controle de tarefas, recursos humanos, prazos, materiais, orçamento, estoque e qualidade para uma empresa chamada Construtora ABC que é uma companhia que presta serviços no ramo da construção civil. O software visa melhorar a comunicação com clientes e fornecedores, e melhorar o acesso à informação dos projetos._

### Recursos utilizados

- Microservices
- Spring Boot

- Mockito

------------------------------------------------------------------------------------------------------------------

### Como configurar o ambiente:

- Faça clone do projeto;
- Importe o projeto para sua IDE de preferência via pom (Maven).

### Realizando testes nos serviços

- Nós utilizamos para nossos testes o software [Postman](https://www.getpostman.com/);
- No endereço `http://localhost:8080` execute as operações disponíveis.  

Exemplo de operação de GET: `http://localhost:8080/tarefas`  
_Esta operação retorna todas as tarefas disponíveis na base de dados._

Exemplo de operação de inserção, POST: `http://localhost:8080/tarefas`
_Esta operação adiciona uma tarefa na base de dados, utilizando o modelo JSON abaixo._
```
    {
        "id": 4,
        "nome": "Contratar empregados",
        "descricao": "Contratar empregados",
        "prioridade": "Alta",
        "status": "Em construção",
        "dataComecoRealizacao": "07/08/2017",
        "dataEstimadaEntrega": "08/12/2018",
        "usuario": "Savanna Denega",
        "material": "Material 1",
        "anexo": "Sem anexo"
    }
```

