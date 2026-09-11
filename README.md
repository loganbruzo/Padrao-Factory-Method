# Padrão Factory Method

Implementação do padrão Factory Method em Java utilizando o exemplo de músicas.

## Sobre o projeto

O projeto utiliza uma fábrica para criar diferentes tipos de música sem que o código principal precise instanciar diretamente cada classe.

## Tipos de música

- Rap
- Trap
- Anime

## Testes

Foram criados testes utilizando JUnit para verificar:

- Criação de música Rap
- Criação de música Trap
- Criação de música Anime
- Tratamento de tipo de música inválido

## Diagrama de Classes

Método:

tocar(): String

MusicaRap

tocar(): String

MusicaTrap

tocar(): String

MusicaAnime

tocar(): String

MusicaFactory

Método:

obterMusica(tipo: String): IMusica
