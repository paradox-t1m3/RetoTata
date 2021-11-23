#language: es

Característica: Realizar registro de datos y adicion de productos en demoblaze
  Yo como usuario de demoblaze
  Quiero realizar el registro de mis datos
  Para realizar adicion de productos en la pagina

  Antecedentes:
    Dado que Cristian ingresa a la pagina de demoblaze

  @RutaCritica
  @RegistroDeUsuario
  Esquema del escenario: Realizar registro de usuario
    Dado que Cristian ingresa al registro de usuario
    Cuando ingresa los datos de registro
      | usuarioRegistro   | claveRegistro   |
      | <usuarioRegistro> | <claveRegistro> |
    Entonces se muestra el mensaje Sign up successful
    Ejemplos:
      | usuarioRegistro | claveRegistro |
      | prueba6usuario  | 1234          |

  @RutaCritica
  @Login
  Esquema del escenario: Realizar inicio de sesion
    Dado que Cristian ingresa al inicio de sesion
    Cuando ingresa sus credenciales
      | usuario   | clave   |
      | <usuario> | <clave> |
    Entonces Inicia sesion en la pagina
    Ejemplos:
      | usuario   | clave |
      | cvillegas | 1234  |

  @RegistroDeFormulario
  Esquema del escenario: Realizar registro de formulario de contacto
    Dado que Cristian ingresa al registro de fomulario de contacto
    Cuando ingresa los datos del formulario
      | emailContacto   | nombreContacto   | mensaje   |
      | <emailContacto> | <nombreContacto> | <mensaje> |
    Entonces se muestra el mensaje Thanks for the message!!
    Ejemplos:
      | emailContacto      | nombreContacto | mensaje            |
      | prueba@hotmail.com | cristian       | prueba de contacto |

  @AdicionDeProducto
  Esquema del escenario:Realizar adicion de producto
    Dado que Cristian ingresa al home
    Cuando selecciona una categoria de producto
      | categoria   |
      | <categoria> |
    Y selecciona el producto
      | producto   |
      | <producto> |
    Y adiciona el producto
    Entonces se muestra el mensaje Product added
    Ejemplos:
      | categoria | producto    |
      | Laptops   | MacBook Pro |


