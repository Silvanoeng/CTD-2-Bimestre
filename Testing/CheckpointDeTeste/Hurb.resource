# Silvano Araujo Pereira

*** variables ***
${SITE}  https://www.hurb.com/br
${BROWSER}  chrome
${PERMITIR_COOKIES}  css=#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll
${SELECIONAR_PACOTES}  css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.h-91nvuq > div > button:nth-child(2) > span
${SELECIONAR_CIDADE}  css=#downshift-1-input
${CLICAR_PESQUISAR}  css=#__next > div.Header_Header__1jiZz > div.hrc-2LOsj > div > div > div.hrc-2_yd0.hrc-SLIuR > button
${SELECIONAR_PACOTE}  css=#__next > div > main > div.ResultsCardsContainer_ResultsCardContainer__1jtiB > a:nth-child(3) > div.hrc-2MRhP.hrc-oxPyE > div:nth-child(1) > h3
${ESCOLHER_OPCAO}  css=body > div:nth-child(4) > section > div.box-offer-top.box-nopadding.col-sm-6.col-md-6 > div > section.box-offer-main.pull-left > div:nth-child(5) > div.pull-left.first-box > button
${CLICAR_COMPRAR}  css=#offer-options > div.offer-options--items > div:nth-child(4) > div.row.flex > div.col-xs-12.col-sm-4.col-md-4.offer-options--box-right.main-package > div > div.col-xs-12.col-sm-7.col-md-7.offer-options--box.offer-options--box-price.flex > div:nth-child(2) > div:nth-child(4) > a
${VALIDAR_CONFIGURACAO}  css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(7) > div > div > div:nth-child(2) > div.col-xs-8.col-sm-8.col-md-8.text-right
${VALIDAR_PERIODO_INICIO}  css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(9) > div > div > div:nth-child(2) > div.col-xs-7.col-sm-7.col-md-7.text-right.booking-info__date-formatted.summary-highlight
${VALIDAR_PERIODO_FINAL}  css=body > div.container > div > div.col-md-4.col-sm-4.hidden-xs > div.summary > div:nth-child(9) > div > div > div:nth-child(3) > div.col-xs-7.col-sm-7.col-md-7.text-right.booking-info__date-formatted.summary-highlight
${CLICAR_BOLETO}  css=#ui-id-1
${CLICAR_NOME}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(1) > div > input
${CLICAR_CPF}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(2) > div > input
${CLICAR_CELULAR}  css=#paymentMethods__bill > section > div:nth-child(2) > div:nth-child(3) > div > input
${CLICAR_POLITICA_PRIVACIDADE}  css=#cancellation-policy
${VALIDAR_CANCELAMENTO_GRATIS}  css=#purchase-confirmation > div:nth-child(1) > div > div > div.free-cancellation-policy__message


*** keywords ***
Clicar em "Permitir todos os cookies"
  Open Browser  ${SITE}  ${BROWSER}
  Sleep  6s
  Click Element  ${PERMITIR_COOKIES}

Selecionar a opção "Pacotes"
  Click Element  ${SELECIONAR_PACOTES}

Buscar por alguma cidade turística (Ex: Buenos Aires, Florença, Orlando) e clicar em "Pesquisar"
  Input Text  ${SELECIONAR_CIDADE}  Buenos Aires
  Click Element  ${CLICAR_PESQUISAR}

Selecionar um pacote de viagem
  Click Element  ${SELECIONAR_PACOTE}

Clicar em "ESCOLHER OPÇÃO"
  Switch Window   NEW
  Click Element  ${ESCOLHER_OPCAO}
  
Escolher uma opção de viagem e clicar em "COMPRAR"
  Sleep  6s
  Click Element  ${CLICAR_COMPRAR}  

Validar as informações da "Configuração" da viagem
  Element Should Contain  ${VALIDAR_CONFIGURACAO}  9 Noites\n1 pessoa por pacote


Validar as informações do período da viagem
  Element Should Contain  ${VALIDAR_PERIODO_INICIO}  01 Set 2022
  Element Should Contain  ${VALIDAR_PERIODO_FINAL}  30 Jun 2023

Selecionar a opção "Boleto parcelado"
  Click Element  ${CLICAR_BOLETO}

Preencher os dados de pagamento
  Input Text  ${CLICAR_NOME}  Silvano
  Input Text  ${CLICAR_CPF}  705.127.670-09
  Input Text  ${CLICAR_CELULAR}  (11) 99000-0000

Marcar o checkbox "Li e aceito as condições de termos de uso e política de privacidade"
  Select Checkbox  ${CLICAR_POLITICA_PRIVACIDADE}

Validar a informação sobre cancelamento grátis
  Element Should Contain  ${VALIDAR_CANCELAMENTO_GRATIS}  Cancelamento Grátis!
  Close Browser
