Feature: Store Exito

  @CP01
  Scenario Outline: validate name of product add to shopping cart
    Given The user are in the page Exito
    When the user choose a category
    And the user chosse five producs
      | pro1   | pro2   | pro3   | pro4   | pro5   |
      | <pro1> | <pro2> | <pro3> | <pro4> | <pro5> |
    Then The name of the added products must be the same as in the cart
    Examples:
      | pro1                                    | pro2                                                   | pro3                                                                            | pro4                                       | pro5                                             |
      | Microsoft 365 Personal 15M 196742049381 | Televisor HISENSE 50 Pulgadas LED Uhd4K Smart TV 50A7K | Computador ASUS Vivobook 15 Intel Core i5 1235U RAM 8 GB 1 TB SSD X1504ZANJ619W | Celular MOTOROLA G72 128 GB 6 GB RAM Negro | Celular SAMSUNG GALAXY A24 128 GB 4 GB RAM Negro |
      | Microsoft 365 Personal 15M 196742049381 | Televisor HISENSE 50 Pulgadas LED Uhd4K Smart TV 50A7K | Computador ASUS Vivobook 15 Intel Core i5 1235U RAM 8 GB 1 TB SSD X1504ZANJ619W | Celular MOTOROLA G72 128 GB 6 GB RAM Negro | Celular SAMSUNG GALAXY A24 128 GB 4 GB RAM Negro |