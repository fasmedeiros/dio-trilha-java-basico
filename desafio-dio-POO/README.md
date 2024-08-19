# Bootcamp Java Developer

Este projeto simula um sistema de bootcamp no qual desenvolvedores podem se inscrever, progredir em cursos e mentorias, e calcular a experiência adquirida (XP). O sistema é composto por várias classes que representam o conteúdo educacional, desenvolvedores e o próprio bootcamp.

## Descrição

O sistema foi desenvolvido para gerenciar bootcamps, permitindo que desenvolvedores se inscrevam, concluam cursos e mentorias, e acumulem pontos de experiência (XP) à medida que progridem. O projeto demonstra conceitos de Programação Orientada a Objetos (POO) como herança, polimorfismo, encapsulamento e abstração.

### Estrutura do Projeto

O projeto contém as seguintes classes:

- **Curso**: Representa um curso com título, descrição e carga horária.

- **Mentoria**: Representa uma mentoria com título, descrição e data.

- **Bootcamp**: Agrupa cursos e mentorias para um programa de treinamento.

- **Dev**: Representa um desenvolvedor que pode se inscrever em bootcamps e progredir nos conteúdos.

### Funcionamento

1. Um bootcamp é criado com cursos e mentorias.

2. Desenvolvedores (Devs) se inscrevem no bootcamp.

3. Os Devs podem progredir através dos cursos e mentorias disponíveis.

4. O sistema calcula a experiência (XP) acumulada com base nos conteúdos concluídos.

## Saídas

Conteúdos inscritos [Curso: titulo=curso java, descricao=descrição curso java, cargaHoraria=8, Curso: titulo=curso js, descricao=descrição curso js, cargaHoraria=4, Mentoria: titulo=mentoria de java, descricao=descricao mentoria java, data=2024-08-18]

-

Conteúdos inscritos []
Conteúdos concluídos [Curso: titulo=curso java, descricao=descrição curso java, cargaHoraria=8]

XP: 10.0

-----------

Conteúdos inscritos [Mentoria: titulo=mentoria de java, descricao=descricao mentoria java, data=2024-08-18]
Conteúdos concluídos [Curso: titulo=curso java, descricao=descrição curso java, cargaHoraria=8, Curso: titulo=curso js, descricao=descrição curso js, cargaHoraria=4]

XP: 24.0
