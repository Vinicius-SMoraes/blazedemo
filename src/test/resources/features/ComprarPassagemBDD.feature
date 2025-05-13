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