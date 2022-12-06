# springboot-student-crud

Uma simples API REST de um CRUD responsável por manejar estudantes em um banco de dados.

Foi feita com o objetivo de aprender os conceitos básicos do Spring Framework, Métodos HTTP, Modelo MVC, Persistência e Arquitetura N-Tier.

Possui apenas um domínio, Student, dividido entre cinco camadas, são elas:

StudentController - Responsável pelo mapeamento do EndPoint principal dos e métodos HTTP: GET, POST, PUT, DELETE.

StudentService - Responsável por fazer validações e implentar a lógica de negócio.

StudentRepository - Responsável por gerenciar transações e queries no banco de dados.

StudentConfig - Neste caso foi usada para a criação de um Beam de teste que insere um estudante padrão no banco de dados.

Student - Modelo POJO responsável que além encapsular os dados de um estudante, com o auxílio do mecanismo de persistência é capaz de criar um represenção sua como uma tabela no banco de dados.

Através desse projeto fui apresentado ao conceito de injeção de dependência que se mostrou muito útil no decorrer do projeto, útilizei o Postman para efetuar as Requests HTTP e usei PostgreSQL como banco de dados.


             ![image](https://user-images.githubusercontent.com/87951363/206018286-ca4fae05-7180-4385-8ea9-c6e9aa9f71ff.png)
