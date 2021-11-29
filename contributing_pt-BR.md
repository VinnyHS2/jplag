Nós ficariamos felizes em incorporar todas as melhorias no JPlag neste repositório. Fique a vontade para criar um fork do repositório e enviar pull requests. Se você é novo no JPlag, verifique as [good first issues](https://github.com/jplag/jplag/issues?q=is%3Aissue+is%3Aopen+label%3A%22good+first+issue%22).

Por favor tente fazer uma submissão bem documentada e estruturada de forma clara.
* Todos os artefatos (código, comentários...) devem estar em inglês
* Utiliza o JavaDoc para documentar as classes e os métodos publicos.
* Tente seguir o estilo de código como visto no [projeto central](https://github.com/jplag/JPlag/tree/master/jplag/src/main/java/de/jplag), como os frontends são antigos;
* Crie pull requests bem explicados para propor suas funcionalidade;
* Quando reutilizar códigos de outros projetos, marque-os e tenha certeza que as licenças permitem o reúso;
* Suas mudanças devem sempre melhorar a qualidade do código base, especialmente quando estiver trabalhando com componentes antigos.


### Realizando uma build a partir do código fonte 
1. Baixe ou faça um clone deste repositório.
2. Execute `mvn clean install` na raiz do repositório para instalar todos os submódulos. Você vai encontrar os arquivos JARs nos respectivos diretórios `target`.
3. Dentro do diretório `jplag` execute `mvn clean generate-sources package assembly:single`. 

Você irá encontrar o JAR gerado com todas as dependencias em `jplag/target`.

## Adding new languages
Adicionar novas linguagens é bem simples. Dê uma olhada em um dos projetos `jplag.frontend`. Tudo que você precisa é uma ferramenta para analisar a linguagem (Ex., para ANTLR ou para JavaCC) e algumas linhas de código que enviam tokens (que são gerados pela ferramenta da analisar) para o JPlag.