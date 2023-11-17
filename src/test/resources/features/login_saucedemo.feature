#language:es

Característica: Login en Sauncedemo
  yo como usuario de Saucedemo
  Quiero autenticarme
  para ver los productos de la pagina

  Escenario: Login con usuario bloqueado
    Dado que Bryan se encuentra en la pagina
    Cuando el ingresa sus credenciales de usuario bloqueado
    Entonces  el usuario deberia ingresar a la pagina products

  Escenario: Login con usuario con errores
    Dado que Bryan se encuentra en la pagina
    Cuando el ingresa sus credenciales de usuario con errores
    Entonces  el usuario deberia ingresar a la pagina products



  Esquema del escenario: Login con usuario con errores
    Dado que Bryan se encuentra en la pagina
    Cuando el ingresa sus credenciales
      | username   | password   |
      | <username> | <password> |
    Entonces  el usuario deberia ingresar a la pagina products
    Ejemplos:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | error_user      | secret_sauce |

  Escenario: Login con usuario habilitado
    Dado que Bryan se encuentra en la pagina
    Cuando el ingresa sus credenciales de usuario habilitado
    Entonces  el usuario deberia ingresar a la pagina products






