"# hackaton-usp-2018"

Breve resumo:
O intuito do projeto é utilizar aprendizado de máquina para estimar a lotação do Bandejão e ajudar os alunos a escolher o melhor local e horário para as refeições



Descrição dos projetos criados:

- crawler : Places.ipynb é um crawler que consulta lotação dos bandejões no Google Maps (usado pra criação do dataset)
- crawler : LocatacaoBandejao.xlsx analise dos dados obtidos no crawler e categorização dos cardapios

- hackaton : Utilitario em Java para criação do dataset com base na distribuição obtida no crawler ( salva dataset.csv e CollectedOccupationData no mongo db)

- classifier: Utilitario para classificação com base no dataset. Faz o treinamento do modelo, validação do modelo e predição dos dados futuros. Os dados futuros são inseridos no mongo db (EstimatedOccupationData)

- hackaton-usp-api: Api em Java(Play framework) com deploy em https://hackaton-usp-api.herokuapp.com/api/v1/occupation?restaurant=1 para disponibilização dos dados coletados e estimados

- template-ocupacao-bandejao: projeto front end para simulação do app de cardapios e visualização dos dados de lotação dos bandejões

- https://sites.google.com/view/bandejo-usp/ - link com simulação de uma aplicação de gestão do bandejão com analise dos dados
