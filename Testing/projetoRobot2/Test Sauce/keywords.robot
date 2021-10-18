***Settings***
Library  SeleniumLibrary
Resource  ./variables.robot

*** keywords***
Acessar site sauce demo
  Open Browser  ${SITE}  ${BROWSER}
  Maximize Browser Window

Fazer login no site com o usuário standard_user  
  Input Text  ${LOGIN}  standard_user
  Input Text  ${SENHA}  secret_sauce
  Click Element  ${BOTAOLOGIN}

Acessar os detalhes do produto Sauce Labs Backpack
  Click Element  ${DETALHES_SAUCELABSPACK}

Adicionar o produto Sauce Labs Backpack ao carrinho de compras
  Click Element  ${ADICIONAR_SAUCELABSPACK}

Abrir o carrinho de compras
  Click Element  ${CARRINHO}

Remover o produto Sauce Labs Backpack do carrinho de compras
  Click Element  ${REMOVER_SAUCELABSPACK}

Clicar em Continue Shopping para voltar à Página Inicial
  Click Element  ${CONTINUESHOPPING}

Adicionar o produto Sauce Labs Fleece Jacket ao carrinho de compras
  Click Element  ${ADICIONAR_FLEECEJACKET}

Abrir o carrinho de compras 2
  Click Element  ${CARRINHO}

Clicar em Checkout para finalizar a compra
  Click Element  ${CHECKOUT}

Preencher os dados: PRIMEIRO NOME (FIRST NAME), SOBRENOME (LAST NAME) E CEP (POSTAL CODE)
  Input Text  ${FIRSTNAME}  Fulano
  Input Text  ${LASTNAME}  de Tal
  Input Text  ${POSTALCODE}  09099900

Clicar no botão CONTINUE
  Click Element  ${BOTAOCONTINUE}

Validar se o valor total cobrado é de $53.99
  Element Should Contain  ${VALORTOTAL}  $53.99

Clicar no botão FINISH
  Click Element  ${BOTAOFINISH}

Validar que a compra foi realizada e a mensagem THANK YOU FOR YOUR ORDER está sendo exibida
  Wait Until Element is Visible  ${THANKYOU}  10
  Close Browser