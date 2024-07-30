## SQL to be formated
```sql

selct * from Person;

INSERT INTO Person (name) VALUES ('Raphael Araujo Gonçalves');

INSERT INTO Fone (PERSON_ID, number) VALUES (1,'9999-9999');
INSERT INTO Fone (PERSON_ID, number) VALUES (1,'8888-8888');
INSERT INTO Fone (PERSON_ID, number) VALUES (1,'7777-7777');
INSERT INTO Fone (PERSON_ID, number) VALUES ('6666-6666');
INSERT INTO Fone (number) VALUES ('5555-5555');

INSERT INTO Blog (conteudo, titulo) VALUES ('conteudo 1', 'titulo 1');
INSERT INTO Blog (categoria_id, conteudo, titulo) VALUES (null, 'conteudo 1', 'titulo 1');


INSERT INTO categoria (nome) VALUES ('categoria');
INSERT INTO categoria (blog_id, nome) VALUES (null, 'categoria');


