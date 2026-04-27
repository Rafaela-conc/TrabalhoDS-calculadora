### Projeto Calculadora de Materiais para Obra Residencial🧱💻
# Modelagem do grafo:
No meu projeto, a planta foi modelada como um grafo e as paredes representam arestas. Eu fiz um codigo inicial para a representacao e depois eu cliquei na tela e apertei no botao para que fizesse os getters e stters automaticamente (é um comando)
# Volume do concreto:
A formula que foi utilizada foi (Volume= Largura X Comprimento X Altura) e além disso o serviço foi exposto via API REST.
# Configuração do Banco: 
Para que o banco fosse configurado eu tive que configurar no pom.xml (para prover o suporte de armazenamento quando executado) e no application properties (para que a comunicação conseguisse se comunicar com a base de dados de forma automática) o H2 para que funcionasse.
# Detalhes extras:
Primeiramente eu instalei no spring initialzr e depois abri a pasta no IJ e fiz as configurações mo código para que o calculo pudesse ser feito. E ao longo do projeto tive que fazer alterações como o H2 citado anteriormente.
