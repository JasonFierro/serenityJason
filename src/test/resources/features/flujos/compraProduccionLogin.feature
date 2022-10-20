Feature: Como usuario quiero realizar la compra de uno o varios productos en prixz, logueado y des-logueado,
  se debe confirmar el flujo completo hasta la pagina final de pago.

  @Login
  Scenario Outline: Se debe realizar la compra con usuario logueado
    Given "<actor>" Ingresa al homePage prixz "<recorder>"
    And Hace click sobre el boton login ingresa usuario "<usuario>" ingresa contraseña "<contrasena>" y hace click sobre acceder
    When valida textos pantalla mi cuenta "<pedidosCuenta>" "<direccionesCuenta>" "<misDatosCuenta>" "<inicio>" "<programaLealtad>"	"<salir>"
    And Hace click en el logo
    And Agrega un producto al carrito compras puede aumentar y disminuir la cantidad
    And Hace click en seguir comprando agrega otro producto y hace click en finalizar compra
    And Envia todos los campos obligatorios "<CkNombre>" "<CkApellido>" "<CkDireccion>" "<CkExterior>" "<CkInterior>" "<CkColonia>" "<CkPostal>" "<CkEstado>" "<CkCiudad>" "<CkTelefono>" y da click en continuar compra
    And Selecciona nueva tarjeta debito o credito
    And Ingresa el N tarjeta "<Ntarjeta>" vencimiento "<Nvencimiento>" titular "<Ntitular>" CVV "<cvv>" click en continuar
    And Selecciona la cuota "<Ncuotas>"
    Then Valida el boton de pago
    Examples: Ejemplos para información de clientes en el Checkout
      | CkNombre     | CkApellido       | CkDireccion | CkExterior | CkInterior | CkColonia | CkPostal | CkEstado         | CkCiudad | CkTelefono |
      | Jason Andres | Fierro Hernandez | dirección   | NoExterior | NoInterior | Colonia   | 11870    | Ciudad de México | Ciudad   | 3058198412 |

    Examples: Ejemplos del flujo completo
      | actor | usuario                  | contrasena | pedidosCuenta | direccionesCuenta | misDatosCuenta | inicio | programaLealtad     | salir | Ntarjeta         | Nvencimiento | Ntitular | cvv | Ncuotas | recorder           |
      | Jason | jason_fierro@hotmail.com | Jadrez0323 | Tus pedidos   | Direcciones       | Mis datos      | Inicio | Programa de Lealtad | Salir | 4242424242424242 | 1127         | Jason F  | 123 | 1       | compraLoginTarjeta |
    Examples:
