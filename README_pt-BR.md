<p align="center"> 
	<img alt="JPlag logo" src="jplag/src/main/resources/de/jplag/reporting/data/logo-dark.png">
</p>

# JPlag - Software de Detecção de Plágio

[![Fluxo de Trabalho Maven](https://github.com/jplag/jplag/actions/workflows/maven.yml/badge.svg)](https://github.com/jplag/jplag/actions/workflows/maven.yml)
[![Última Versão](https://img.shields.io/github/release/jplag/jplag.svg)](https://github.com/jplag/jplag/releases/latest)
[![Licença](https://img.shields.io/github/license/jplag/jplag.svg)](https://github.com/jplag/jplag/blob/master/LICENSE)

## Descrição
O JPlag é um software que compara códigos (formatos aceitos atualmente: java1, java2, java5, java5dm, java7, java9, python3, cpp, csharp, char, text, scheme) e textos com a finalidade de detectar plágio.

## Objetivo do repositório
Este repositório é referente a um projeto executado na disciplina Engenharia de Software 1 (BCC35E) do curso de Bacharelado em Ciências da Computação da UTFPR de Campo Mourão. O objetivo do projeto é o desenvolvimento de algumas funcionalidades, considerando o processo de engenharia de software e suas atividades desde a engenharia de requisitos até a entrega. 

## Baixando e Instalando

### Baixando uma versão
Baixe a [última versão](https://github.com/jplag/jplag/releases), a mais recente é a [v3.0.0](https://github.com/jplag/jplag/releases/tag/v3.0.0-SNAPSHOT).
Todas as versões são disponibilizadas como um único pacote JAR executável.

### Realizando uma build a partir do código fonte 
1. Baixe ou faça um clone deste repositório.
2. Execute `mvn clean install` na raiz do repositório para instalar todos os submódulos. Você vai encontrar os arquivos JARs nos respectivos diretórios `target`.
3. Dentro do diretório `jplag` execute `mvn clean generate-sources package assembly:single`. 

Você irá encontrar o JAR gerado com todas as dependencias em `jplag/target`.

## JPlag versão legado
Caso você dependa de uma versão legado do JPlag nós indicamos [versão legado v2.12.1](https://github.com/jplag/jplag/releases/tag/v2.12.1-SNAPSHOT) e a [branch legado](https://github.com/jplag/jplag/tree/legacy).

As funcionalidades a seguir estão disponíveis somente a partir da versão v3.0.0:
* API java para integração com terceiros
* Uma interface simplifica de linhas de comando
* Suporte para arquivos Java contendo novas funcionalidades da linguagem
* Cores melhoradas para códigos que coincidem no relatório
* Modo de comparação paralela

As seguintes funcionalidades estão disponíveis somente na versão legado:

* Agrupamento de resultados
* Comparação baseada no máximo de similaridade

## Uso
O JPlag pode ser tanto usado por linhas de comando quanto diretamente por sua API Java.

## Conceitos

Está seção explicará alguns dos conceitos fundamentais sobre o JPlag para facilicar seu entendimento e uso.

### Diretório Raiz 

O diretório raiz é utilizado pelo JPlag para procurar por submissões.

### Submissões

Submissões possuem o código fonte que o JPlag irá analisar e comparar. Eles devem ser filhos direto do diretorio raiz e podem ser tanto arquivos únicos quanto diretórios.

#### Exemplo: Submissão de arquivo único

```
/path/to/root-directory
├── Submission-1.java
├── ...
└── Submission-n.java
```

#### Exemplo: Submissão de diretórios

O JPlag irá ler as submissões dos diretórios recursivamente, então eles podem conter diversos (aninhado) código fonte.

```
/path/to/root-directory
├── Submission-1
│   ├── Main.java
│   └── util
│       └── Utils.java
├── ...
└── Submission-n
    ├── Main.java
    └── util
        └── Utils.java
```

Se você quer que o JPlag busque por um subdiretório especifico de uma submissão nos arquivos do código fonte (ex. `src`), você pode passar a opção `-S`:

```
Com a opção --subDir=src

/path/to/root-directory
├── Submission-1
│   ├── src                 
│   │   ├── Main.java       # Included
│   │   └── util            
│   │       └── Utils.java  # Included
│   ├── lib                 
│   │   └── Library.java    # Ignored
│   └── Other.java          # Ignored
└── ...
```

### Código base

O código base é uma forma especial de submissão. É o padrão no qual todas as outras serão baseadas. Jplag irá ignorar qualquer semelhança em duas submissões que sejam parte do código base.

Como qualquer outra submissão, o código base deve estar em um único arquivo ou diretório no diretório raiz.

```
/path/to/root-directory
├── BaseCode
│   └── Solution.java
├── Submission-1
│   └── Solution.java
├── ...
└── Submission-n
    └── Solution.java
```

#### Exemplo

No exemplo, os estudantes tem que resolver um dado problema, implementando o método `run` no template abaixo. Como eles não precisam alterar a função `main`, elas serão idênticas para todos os estudantes. 

```java
// BaseCode/Solution.java
public class Solution {

    // DO NOT MODIFY
    public static void main(String[] args) {
        Solution solution = new Solution();  
        solution.run();
    }
    
    public void run() {
        // TODO: Implement your solution here.
    }
}
```

Para evitar que o JPlag dectecte similaridades na função `main` (e outras partes do template), nós podemos instruir o JPlag a ignorar conflitos com os códigos base informando a opção `--baseCode=<base-code-name>`. 

O `<base-code-name>` no exemplo acima é `BaseCode`.
