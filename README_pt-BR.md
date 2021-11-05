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

### CLI
*Perceba que a [legacy CLI](https://github.com/jplag/jplag/blob/legacy/README.md) possui algumas diferenças.*

```
JPlag - Software de Detecção de Plágio

Uso: JPlag [ opções ] [<diretório-raiz>]
 <diretório-raiz>        O diretório do qual possui todas as submissões

argumentos nomeados:
  -h, --help             Exibe esta mensagem de ajuda e finaliza
  -l                     {java1,java2,java5,java5dm,java7,java9,python3,cpp,csharp,char,text,scheme} Seleciona a linguagem para analisar as submissões (Padrão: java9)
  -bc BC                 Nome do diretório que possui o código base(Framework utilizado como base em todas as submissões)
  -v                     {quiet,long} Nivel de detalhamento do log (Padrão: quiet)
  -d                     (Debug) parser. Arquivos não analisáveis serão armazenados (Padrão: false)
  -S S                   Procura nos diretórios <diretório-raiz>/*/<diretório> por arquivos
  -p P                   Lista separada por vírgulas de todos os sufixos com o nome dos arquivo incluídos
  -x X                   Todos os arquivos com o nome nesta lista serão ignorados durante a comparação (lista separada por linhas)
  -t T                   Altera a sensibilidade da comparação. Um valor de <n> menor terá uma sensibilidade maior
  -m M                   Limite de similaridade [0-100]: Todas as comparações que estiverem acima deste limite serão salvas (Padrão: 0.0)
  -n N                   Número máximo de comparações que irão ser salvas. Se o valor for -1 todas as comparações serão salvas (Padrão: 30)
  -r R                   Nome do diretório no qual os resultados das comparações serão guardados(Padrão: result)
  -c {normal,parallel}   Modo de comparação usado para comparar os arquivos(Padrão: normal)
```

### API Java

A nova API deixou mais facil de integrar o detector de plagiarismo JPlag em projetos externos implementados em Java.

#### Exemplo 

```java
JPlagOptions options = new JPlagOptions("/path/to/rootDir", LanguageOption.JAVA_1_9);
options.setBaseCodeSubmissionName("template");

JPlag jplag = new JPlag(options);
JPlagResult result = jplag.run();

List<JPlagComparison> comparisons = result.getComparisons();

// Optional
File outputDir = new File("/path/to/output");
Report report = new Report(outputDir);

report.writeResult(result);
```

#### Diagrama de Classe
<p align="center">
	<img alt="UMLClassDiagram.png" src="UMLClassDiagram.png?raw=true" width="800">
</p>

## Conceitos

Está seção explicará alguns dos conceitos fundamentais sobre o JPlag para facilicar seu entendimento e uso.

### Diretório Raiz 

O diretório raiz é utilizado pelo JPlag para procurar por submissões.

### Submissões

Submissões possuem o código fonte que o JPlag irá analisar e comparar. Eles devem ser filhos direto do diretorio raiz e podem ser tanto arquivos únicos quanto diretórios.

#### Exemplo: Submissão de arquivo único

```
/caminho/para/diretório-raiz
├── Submissão-1.java
├── ...
└── Submissão-n.java
```

#### Exemplo: Submissão de diretórios

O JPlag irá ler as submissões dos diretórios recursivamente, então eles podem conter diversos (aninhado) código fonte.

```
/caminho/para/diretório-raiz
├── Submissão-1
│   ├── Main.java
│   └── util
│       └── Utils.java
├── ...
└── Submissão-n
    ├── Main.java
    └── util
        └── Utils.java
```

Se você quer que o JPlag busque por um subdiretório especifico de uma submissão nos arquivos do código fonte (ex. `src`), você pode passar a opção `-S`:

```
Com a opção --subDir=src

/caminho/para/diretório-raiz
├── Submissão-1
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
/caminho/para/diretório-raiz
├── CódigoBase
│   └── Solução.java
├── Submissão-1
│   └── Solução.java
├── ...
└── Submissão-n
    └── Solução.java
```

#### Exemplo

No exemplo, os estudantes tem que resolver um dado problema, implementando o método `run` no template abaixo. Como eles não precisam alterar a função `main`, elas serão idênticas para todos os estudantes. 

```java
// BaseCode/Solution.java
public class Solution {

    // NÃO MODIFIQUE
    public static void main(String[] args) {
        Solution solution = new Solution();  
        solution.run();
    }
    
    public void run() {
        // TODO: Implemente seua solução aqui.
    }
}
```

Para evitar que o JPlag dectecte similaridades na função `main` (e outras partes do template), nós podemos instruir o JPlag a ignorar conflitos com os códigos base informando a opção `--baseCode=<base-code-name>`. 

O `<base-code-name>` no exemplo acima é `BaseCode`.

## Contribuindo
Nós ficariamos felizes em incorporar todas as melhorias ao JPlag nesse código base. Fique a vontade para criar um fork do projeto e enviar pull requests.

### Adicionando novas linguagens
Adicionar novas linguagens é bem simples. Dê uma olhada em um dos projetos `jplag.frontend`. Tudo que você precisa é uma ferramenta para analisar a linguagem (Ex., para ANTLR ou para JavaCC) e algumas linhas de código que enviam tokens (que são gerados pela ferramenta da analisar) para o JPlag.

## Pesquisa
Se você está fazendo uma pesquisa relacionada ao JPlag, nós adorariamos saber o que você está fazendo. Se sinta livre para entrar em contato conosco em jplag@ipd.kit.edu ou aqui no GitHub.
