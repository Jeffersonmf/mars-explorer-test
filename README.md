![POD](https://img.shields.io/badge/version-v1.0.0-blue.svg)
![POD](https://img.shields.io/badge/language-Scala-orange.svg)
![POD](https://img.shields.io/badge/platform-Linux-black.svg)
[![POD](https://img.shields.io/badge/license-GNU-lightgrey.svg)](./LICENSE)
![SBT compatible](https://img.shields.io/badge/SBT-compatible-4BC51D.svg?style=flat)

# Explorando Marte

Code time!

No nosso desafio você terá que codar um programa para pousar uma sonda em marte.

Vamos avaliar o seu estilo de programação e quais decisões você toma ao resolver um
problema. Crie um repo no github para podermos acompanhar a árvore de commits!
Sinta-se à vontade para criar em cima do problema abaixo. 
Caso algo não esteja claro,
pode assumir o que for para você, apenas indique suas suposições em documentação.
A especificação é bem simples. Não é necessário criar interfaces gráficas ou apis.
Qualquer dúvida maior pode nos perguntar, mas no geral, divirta-se!

# Explorando Marte

Um conjunto de sondas foi enviado pela NASA à Marte e irá pousar num planalto. Esse
planalto, que curiosamente é retangular, deve ser explorado pelas sondas para que
suas câmeras embutidas consigam ter uma visão completa da área e enviar as
imagens de volta para a Terra.
A posição e direção de uma sonda são representadas por uma combinação de
coordenadas x-y e uma letra representando a direção cardinal para qual a sonda
aponta, seguindo a rosa dos ventos em inglês.

![IMAGE](./estrela.png)

O planalto é dividido numa malha para simplificar a navegação. Um exemplo de
posição seria (0, 0, N), que indica que a sonda está no canto inferior esquerdo e
apontando para o Norte.

Para controlar as sondas, a NASA envia uma simples sequência de letras. As letras
possíveis são "L", "R" e "M". Destas, "L" e "R" fazem a sonda virar 90 graus para aesquerda ou direita, respectivamente, sem mover a sonda. "M" faz com que a sonda
mova-se para a frente um ponto da malha, mantendo a mesma direção.

Nesta malha o ponto ao norte de (x,y) é sempre (x, y+1).

Você deve fazer um programa que processe uma série de instruções enviadas para as
sondas que estão explorando este planalto. O formato da entrada e saída deste
programa segue abaixo.

A forma de entrada e saída dos dados fica à sua escolha.

# Requisitos Minimos

Technology | Version
------- | --------
Linux | MacOSX | FreeBSD | Windows 10
Scala | V2.11, 2.12
SBT   | 1.2.8

# Instalação e Preparação do ambiente Scala

Recomendo instalar o [SDKMAN](https://sdkman.io/) via CLI.

No Terminal digite:

```
$ curl -s "https://get.sdkman.io" | bash

$ source "$HOME/.sdkman/bin/sdkman-init.sh"

$ sdk version
```
Após a instalação execute os seguintes comandos:

```
#caso não tenha o Java8 instalado (opcional)
$ sdk install java

$ sdk install sbt

$ sdk install scala
```

Com o ambiente pronto iremos agora executar o programa:

```
# Entre na pasta raiz do projecto onde se encontra o build.sbt

$ sbt clean compile

$ sbt run
```

Paras os testes unitários, utilizei o conceito de Infix com ScalaTest,
no qual simulo um BDD nativo dentro da linguagem Scala. 

```
# Basta executar:

$ sbt test
```

Espero que gostem ;)

# Communication

Contact the developer:
[jeffersonm.ferreira@gmail.com](mailto:jeffersonm.ferreira@gmail.com)