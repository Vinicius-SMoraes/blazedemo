#language: pt

Funcionalidade: Comprar passagem 
    Escolher e comprar passagens


    Cenario: Comprar com sucesso
        Dado que acesso o site "https://www.blazedemo.com"
        Quando seleciono a origem "São Paolo" e destino "Cairo"
        E clico no botao "Find Flights"
        Entao vizualizo a lista de voos

    Esquema do Cenario: Comprar com sucesso DDT
        Dado que acesso o site "https://www.blazedemo.com" 
        Quando seleciono a <origem> e <destino>
        E clico no botao "Find Flights"
        Entao vizualizo a lista de voos
    Exemplos:
    | origem     | destino |
    |"São Paolo" | "Cairo" |
    |"Boston"    | "London"|


    Esquema do Cenario: Login positivo
        Dado que acesso a pagina de login
        Quando preencho o <email> e a <senha> 
        E clico no botao login 
        Então exibe a mensagem de login com sucesso 
        |email                  | senha   |
        |emailpositivo@exm.com  | Senha123| # 1 Teste VV

    Esquema do Cenario: Login negativo
        Dado que acesso a pagina de login
        Quando preencho o email e a senha incorretos
        E clico no botao login 
        Então exibe a mensagem de email ou senha incorretos
        |email                    | senha     |
        |emailpositivo@exm.com    | Senha1234 | # 1 Teste Verdadeiro Falso
        |emailpositivo1@exm.com   | Senha123  | # 1 Teste Falso Verdadeiro
        |emailpositivo1@exm.com   | Senha1234 | # 1 Teste Falso Falso
        |                         | Senha123  | # 1 Teste Branco Verdadeiro
        |                         | Senha1234 | # 1 Teste Branco Falso 
        |emailpositivo@exm.com    |           | # 1 Teste Verdadeiro Branco
        |emailpositivo1@exm.com   |           | # 1 Teste Falso Branco
        |                         |           | # 1 Teste Branco Branco