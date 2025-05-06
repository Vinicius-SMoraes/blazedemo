#language: pt

Funcionalidade: Comprar passagem 
    Escolher e comprar passagens

    Cenario: Comprar com sucesso
        Dado que acesso o site "https://www.blazedemo.com"
        Quando seleciono a origem "São Paolo" e destino "Cairo"
        E clico no botao "Find Flights"
        Entao vizualizo a lista de voos


        