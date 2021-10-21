<p align="center"> 
	<img alt="JPlag logo" src="jplag/src/main/resources/de/jplag/reporting/data/logo-dark.png">
</p>

# JPlag - Software de Detecção de Plágio

[![Fluxo de Trabalho Maven](https://github.com/jplag/jplag/actions/workflows/maven.yml/badge.svg)](https://github.com/jplag/jplag/actions/workflows/maven.yml)
[![Última Versão](https://img.shields.io/github/release/jplag/jplag.svg)](https://github.com/jplag/jplag/releases/latest)
[![Licença](https://img.shields.io/github/license/jplag/jplag.svg)](https://github.com/jplag/jplag/blob/master/LICENSE)

## Objetivo do repositório
O atual repositório tem o objetivo de criar uma ferramenta que seja capaz de identificar possíveis plágios e semelhanças em códigos Java. 

## Baixando e Instalando

### Baixando uma versão
Baixe a [última versão](https://github.com/jplag/jplag/releases), a mais recente é a [v3.0.0](https://github.com/jplag/jplag/releases/tag/v3.0.0-SNAPSHOT).
Todas as versões são versões em jars únicos.

### Building from sources 
1. Baixe ou faça um clone deste repositório.
2. Execute `mvn clean install` na raiz do repositório para instalar todos os submódulos. Você vai encontrar os arquivos JARs nos respectivos diretórios `target`.
3. Dentro do diretório `jplag` execute `mvn clean generate-sources package assembly:single`. 

Você irá encotnrar o JAR gerado com todas as dependencias em `jplag/target`.

## JPlag versão legado
Caso você dependa de uma versão legado do JPlag nós indicamos [versão legado v2.12.1](https://github.com/jplag/jplag/releases/tag/v2.12.1-SNAPSHOT) e a [branch legado](https://github.com/jplag/jplag/tree/legacy).

As funcionalidades a seguir estão disponíveis somente a partir da versão v3.0.0:
* API java para integração com terceiros
* Uma interface simplifica de linhas de comando
* Suporte para arquivos Java contendo novas funcionalidades da linguagem
* Cores melhoradas para códigos que coincidem no relatório
* Modo de comparação paralela

The following features are currently only supported in the legacy version:
* Agrupamento de resultados
* Comparação baseada no máximo de similaridade

## Uso
O JPlag pode ser tanto usado por linhas de comando quanto diretamente por sua API Java.