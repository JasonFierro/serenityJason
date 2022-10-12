Feature: Realizar el login en la pagina ToolsQA
#
#  Scenario: Se debe ingresar a la pagina ToolsQA y realizar el login exitoso
#    Given Ingresar a la pagina principal toolsQA
#    And Seleccionar el icono Book Store
#    And Hacer click sobre Login ingresar usuario y contrasena
#    When Hacer click sobre el boton login
#    Then Validar que ingreso a la pagina principal

  Scenario Outline: Se debe ingresar a la pagina ToolsQA y realizar el login exitoso
    Given "<actor>" Ingresar a la pagina principal toolsQA "<recorder>"
    And Seleccionar el icono Book Store
    And Hacer click sobre Login ingresar usuario "<usuario>" y contrasena "<contrasena>"
    Then Validar que ingreso a la pagina principal "<textoEsperadoUser>"
    Examples:
      | usuario | contrasena | actor | recorder      | textoEsperadoUser |
      | Prueba1 | Prueba1*   | Jason | login_exitoso | Books :.          |
#      | Prueba  | prueba1    | Andres |
#      |         |            | Jorge  |
#      |         | prueba1    | Lorem  |

#  Scenario Outline: Se debe ingresar a la pagina ToolsQA y realizar el login fallido
#    Given "<actor>" Ingresar a la pagina principal toolsQA "<recorder>"
#    And Seleccionar el icono Book Store
#    And Hacer click sobre Login ingresar usuario "<usuario>" y contrasena "<contrasena>"
#    #When Hacer click sobre el boton bookStore
#    Then Validar que ingreso a la pagina principal "<textoEsperadoUser>" "<textoEsperadoPass>"
#    Examples:
#      | usuario | contrasena | recorder      | actor | textoEsperadoUser | textoEsperadoPass |
#      | Prueba1 | prueba     | login_fallido | Jason | UserName :        | Password :        |

#  Scenario Outline: Se debe ingresar a la pagina ToolsQA y realizar el login vacio
#    Given Ingresar a la pagina principal toolsQA
#    And Seleccionar el icono Book Store
#    And Hacer click sobre Login ingresar usuario "<usuario>" y contrasena "<contrasena>"
#    When Hacer click sobre el boton bookStore
#    Then Validar que ingreso a la pagina principal
#    Examples:
#      | usuario | contrasena |
#      | Prueba1 |            |