# 1. Introdução
Robocode[^1] é um programa onde se simula uma batalha de tanques robôs programados em Java[^2]. O objetivo desta atividade era, através da programação de um robô no Robocode, aprender a usar Git[^3] e GitHub e entender a importância do controle de versão para o desenvolvimento de software, já que sem o controle de versão, arrumar erros em um código já inserido em vários computadores ou programar em uma equipe com todos ao mesmo tempo se torna desafiador.

# 2. Objetivos da Atividade
Nosso objetivo com esta atividade era:

* Aprender como usar o Git e GitHub.
* Entender a importância desta ferramenta para o controle de erros e programação em equipe.
* Praticar o que aprendemos sobre Java nas aulas de ALG durante o desenvolvimento do robô.

# 3. Descrição da Atividade
Para iniciar, escolhemos um robô de base para fazermos alterações (o SpinBot). Então, cada integrante, após modificar o robô com suas ideias para melhora-lo, salvava as alterações em uma branch própria no github. De tempos em tempos, fazíamos um Merge nas branches de cada integrante. Caso houvesse, nós resolvíamos os conflitos para enfim salvar na branch master. Após fazer o Merge, testávamos o robô para ver se as funções adicionadas por cada integrante era compatível com as outras funções adicionadas ou se elas afetavam a performance do robô.

# 4. Estrutura do Git Utilizada

O repositório foi criado a partir do website da plataforma GitHub para centralizar o desenvolvimento do projeto, possibilitando o controle de versão entre diferentes iterações do robô e simplificando a integração e análise do código entre os colaboradores. 

### 4.1 Branches

Para a organização do trabalho, foram definidas três branches com o objetivo de garantir maior autonomia aos integrantes da equipe e separar versões estáveis das versões em desenvolvimento.

 - Branch "**master**": Utilizada como a base do projeto, contendo apenas versões estáveis do robô.
 - Branches "**Evaldo**" e "**Gabriel**": Utilizadas como um ambiente intermediário pelos respectivos colaboradores para testar e desenvolver funcionalidades experimentais antes da consolidação das alterações na branch master.

### 4.2 Commits

Os commits foram essenciais para o desenvolvimento do projeto, permitindo o registro das iterações do robô e das mudanças realizadas de maneira organizada, facilitando a depuração de erros e a comparação entre diferentes versões. Ao longo do trabalho, commits foram feitos antes dos períodos de aula e ao término dos mesmos com mensagens claras, objetivas e concisas, documentando as modificações e permitindo a continuidade do desenvolvimento no período seguinte.

### 4.3 Pull Requests

Pull requests são solicitações utilizadas para integrar alterações de código de uma branch para outra, permitindo a análise das mudanças antes de serem mescladas na branch de destino. Durante o desenvolvimento, pull requests foram usadas para comparar diferentes branches e revisar o código de funcionalidades experimentais antes de serem implementadas à branch principal, garantindo que o código estava adequado para a realização do merge.

# 5. Resultados e Aprendizados

A partir desta atividade, foi possível obter uma compreensão prática da utilização e de conceitos essenciais de Git e GitHub, que foram indispensáveis para o desenvolvimento colaborativo do trabalho, com o uso de branches, commits e pull requests auxiliando significativamente a divisão de tarefas e a organização da equipe.

Além disso, o projeto constituiu uma excelente oportunidade para a aplicação de diversos fundamentos de Java estudados ao decorrer do semestre por meio do programa Robocode, no qual eventos foram empregados pela primeira vez como forma de definir o comportamento e a lógica de decisão do robô.

Ao longo da atividade surgiram múltiplos desafios, incluindo conflitos de merge, incompatibilidades de funcionalidades e mensagens de commit com erros de digitação, que exigiram revisões manuais em Visual Studio Code[^4] e maior aprofundamento sobre as funcionalidades de Git e GitHub, resultando no aprendizado de comandos como `git push --force` e `git push --force-with-lease` como maneiras de sobrescrever partes do histórico e corrigir commits.

Portanto, com este projeto tivemos a oportunidade de nos familiarizarmos com ferramentas e plataformas de controle de versão e foi possível desenvolver diversas habilidades de extrema importância, como a resolução de conflitos, a organização de commits e competências de desenvolvimento colaborativo.

# 6. Conclusão

Esta atividade possibilitou a aplicação prática das ferramentas Git e GitHub, evidenciando a importância do controle de versão para a organização e desenvolvimento de projetos coletivos. A utilização destas ferramentas permitiram a divisão de tarefas, a integração de diferentes funcionalidades e a resolução de conflitos de maneira eficiente, resultando em um fluxo de trabalho estruturado e cooperativo. Ademais, a experiência de programação em Robocode reforçou conceitos de Java e contribuiu significativamente para a aprendizagem contínua da linguagem.

Desta maneira, as experiências e conhecimentos obtidos por meio dessa atividade são indispensáveis e diretamente aplicáveis em futuros projetos, tanto acadêmicos quanto profissionais, uma vez que otimizam a organização, o desenvolvimento, a colaboração em equipe e a manutenção de sistemas.

# 7. Anexos

### Exemplos de commits feitos neste trabalho:

<img width="1090" height="835" alt="image" src="https://github.com/user-attachments/assets/a5ca0b18-5a6d-4ece-a126-b012c9039dc8" /> <br />

### Robô Steve em uma arena contra outros robôs:

<img width="602" height="402" alt="image" src="https://github.com/user-attachments/assets/0c1ce77c-2e73-4564-80b1-f29fe399a1ca" /> <br />

### Robô Steve ao ser atingido fica vermelho:

<img width="609" height="404" alt="image" src="https://github.com/user-attachments/assets/f5c76860-9979-49e7-ab27-dea1e43fa2c7" /> <br />

### Desempenho do robô Steve em rodadas participadas:

<img width="945" height="200" alt="image" src="https://github.com/user-attachments/assets/df8723b8-ba8f-45b4-8b53-3659100da7f5" /> <br />

<img width="945" height="100" alt="image" src="https://github.com/user-attachments/assets/bbafb2a8-22e7-4be3-92dd-da205cfca05f" /> <br />

<img width="945" height="90" alt="image" src="https://github.com/user-attachments/assets/e668a21c-6b88-41e3-896b-e8184627562d" /> <br />

[^1]: Robocode: https://robocode.sourceforge.io/
[^2]: Java: https://www.java.com/
[^3]: Git: https://git-scm.com/
[^4]: Visual Studio Code: https://code.visualstudio.com/
