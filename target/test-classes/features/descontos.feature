# language: pt
  # história do usuário
  Funcionalidade: Receber o cupom de desconto desconto da qazando
    Eu como usuário da qazando
    Quero receber um cupom de desconto
    Para comprar um curso com valor reduzido

  # cenário
  Cenário: visualizar código de desconto
    Dado que estou no site da qazando
    Quando eu preencher o meu e-mail
    E clico no botão ganhar cupom
    Então eu vejo o código de desconto