*** Settings ***
library  SeleniumLibrary

*** variables ***

*** test case ***
Sauce demo
  Acessar o site do Sauce
  Fazer login no site com o usuário "standard_user"
  Acessar os detalhes do produto "Sauce Labs Backpack"
  Adicionar o produto "Sauce Labs Backpack" ao carrinho de compras
  Abrir o carrinho de compras
  Remover o produto "Sauce Labs Backpack" do carrinho de compras
  Clicar em "Continue Shopping" para voltar à Página Inicial
  Adicionar o produto "Sauce Labs Fleece Jacket" ao carrinho de compras
  Abrir o carrinho de compras 2
  Clicar em "Checkout" para finalizar a compra
  Preencher os dados: PRIMEIRO NOME (FIRST NAME), SOBRENOME (LAST NAME) E CEP (POSTAL CODE)
  Clicar no botão "CONTINUE"
  Validar se o valor total cobrado é de "$53.99"
  Clicar no botão "FINISH"
  Validar que a compra foi realizada e a mensagem "THANK YOU FOR YOUR ORDER" está sendo exibida

*** keywords***
Acessar o site do Sauce
  Open Browser  https://www.saucedemo.com  chrome

Fazer login no site com o usuário "standard_user"
  Input Text  css=#user-name  standard_user
  Input Text  css=#password  secret_sauce
  Click Element  css=#login-button

Acessar os detalhes do produto "Sauce Labs Backpack"
  Click Element  css=#item_4_title_link > div

Adicionar o produto "Sauce Labs Backpack" ao carrinho de compras
  Click Element  css=#add-to-cart-sauce-labs-backpack

Abrir o carrinho de compras
  Click Element  css=#shopping_cart_container > a

Remover o produto "Sauce Labs Backpack" do carrinho de compras
  Click Element  css=#remove-sauce-labs-backpack

Clicar em "Continue Shopping" para voltar à Página Inicial
  Click Element  css=#continue-shopping

Adicionar o produto "Sauce Labs Fleece Jacket" ao carrinho de compras
  Click Element  css=#add-to-cart-sauce-labs-fleece-jacket

Abrir o carrinho de compras 2
  Click Element  css=#shopping_cart_container > a

Clicar em "Checkout" para finalizar a compra
  Click Element  css=#checkout

Preencher os dados: PRIMEIRO NOME (FIRST NAME), SOBRENOME (LAST NAME) E CEP (POSTAL CODE)
  Input Text  css=#first-name  Silvano
  Input Text  css=#last-name  Araujo
  Input Text  css=#postal-code  96270000

Clicar no botão "CONTINUE"
  Click Element  css=#continue

Validar se o valor total cobrado é de "$53.99"
  Element Should Contain  css=#checkout_summary_container > div > div.summary_info > div.summary_total_label  $53.99

Clicar no botão "FINISH"
  Click Element  css=#finish

Validar que a compra foi realizada e a mensagem "THANK YOU FOR YOUR ORDER" está sendo exibida
  Element Should Contain  css=#checkout_complete_container > h2  THANK YOU FOR YOUR ORDER
  Close Browser



