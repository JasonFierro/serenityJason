Feature: Validar todo el home con textos y productos completos.

  @home
  Scenario Outline: Se debe validar el home completo incluyendo textos de cada producto
    Given "<actor>" Ingresa al homePage prixz "<recorder>"
    And Valida el logo tambien el buscador y header del home "<ingresa>" "<creaTuCuenta>"
    And Valida los textos de las categorias "<oferta>" "<farmacia>" "<diabetes>" "<genericos>" "<bienestar>" "<cuidado>" "<derma>" "<tratamiento>" "<salud>"
    And Valida que el banner si este dentro del dom
    And Valida el titulo destacados "<Tdestacados>" y confirmar los productos visibles
    And Valida el titulo tiendas oficiales "<Ttiendas>" y confirmar las tiendas visibles
    And Valida el contenedor orientación medica en linea que este visible
    And Valida el titulo club ofertas "<Tclub>" y confirmar los productos visibles
    And Valida el titulo cuida tu piel "<Tcuida>" y confirmar los productos visibles
    And Valida el titulo bienestar "<Tbienestar>" y confirmar los productos visibles
    And Valida el titulo control diabetes "<Tcontrol>" y confirmar los productos visibles
    And Valida el titulo salud sexual "<Tsalud>" y confirmar los productos visibles
    And Valida el titulo prixz en los medios y confirmar información visible
    And Valida el footer prixz  de politias salud app
    Then Valida el boton de pago
    Examples: Ejemplos para información de clientes en el Checkout
      | actor | recorder    | ingresa | creaTuCuenta   | oferta         | farmacia | diabetes | genericos | bienestar | cuidado          | derma | tratamiento         | salud        | Ttiendas          | Tclub        | Tcuida        | Tdestacados | Tbienestar | Tcontrol         | Tsalud       |
      | Jason | validarHome | Ingresa | Crea tu cuenta | Oferta express | Farmacia | Diabetes | Genéricos | Bienestar | Cuidado personal | Derma | Tratamiento capilar | Salud sexual | Tiendas oficiales | Club ofertas | Cuida tu piel | Destacados  | Bienestar  | Control diabetes | Salud sexual |
