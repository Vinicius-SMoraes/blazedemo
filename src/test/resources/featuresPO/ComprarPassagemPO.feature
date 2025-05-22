#language: pt

Funcionalidade: Comprar passagem PO
    Escolher e comprar passagens

    Esquema do Cenario: Comprar com sucesso PO
        Dado que acesso o site "https://www.blazedemo.com" PO
        Quando seleciono a <origem> e <destino> PO
        E clico no botao "Find Flights" PO
        Entao vizualizo a lista de voos PO
    Exemplos:
    | origem     | destino |
    |"São Paolo" | "Cairo" |
    |"Boston"    | "London"|
