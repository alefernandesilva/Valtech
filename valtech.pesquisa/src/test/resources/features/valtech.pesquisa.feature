#Author: alefernandes26@gmail.com

@positivos
Feature: Title of your feature
  Eu como usuario quero fazer uma pesquisa para validar os resultados

  @google
  Scenario: Pesquisar a palavra Valtech no Google
    Given que o usuario esteja na homepage do buscador "https://www.google.com.br/"
    When o usuario digita a palavra "Valtech" no buscador google
    And o buscador apresenta os resultados
    Then o usuario valida os resultados "https://www.valtech.com › pt-br" no buscador google
    
  @bing
  Scenario: Pesquisar a palavra Valtech no Bing
    Given que o usuario esteja na homepage do buscador "https://www.bing.com.br/"
    When o usuario digita a palavra "Valtech" no buscador bing
    And o buscador apresenta os resultados
    Then o usuario valida os resultados "https://www.valtech.com" no buscador bing
    
  @yahoo
  Scenario: Pesquisar a palavra Valtech no Yahoo
    Given que o usuario esteja na homepage do buscador "https:/br.yahoo.com/"
    When o usuario digita a palavra "Valtech" no buscador yahoo
    And o buscador apresenta os resultados
    Then o usuario valida os resultados "www.valtech.com › pt-br" no buscador yahoo