### Proyecto base ScreenPlay

Este proyecto implementa  usando  screenplay aplicando sus diferentes capas (interactions, questions, task, userinterface) mostrando un ejemplo de como se compone cada capa ademas de capas adicionales como utilerias


- Rama **main**: Esta rama contiene una estructura basica  de las capas de screenPlay y sus capas con un ejemplo basico
- Rama **saucedemo_builder**: Esta rama contiene ademas de la implementacion de screenplay el patron builder para manejar datos de prueba
- Rama **teststore_saucedemo**: Esta rama contiene  la implementacion de screenplay en 2 paginas diferentes con un ejemplo en cada 1

#### Consideraciones
- cada rama tiene uncluida  el chromedrver o el edgedriver con la version 120.0 de los respectivos navegadores  verifique que su navegador tiene esta version en el caso de tener una version diferente
  actualice en la carpeta  `RUTA_DEL_PRUYECTO/src/test/java/resource/drivers` el driver correspondiente a la version de su navegador

- chrome: https://chromedriver.chromium.org/downloads/version-selection
- Edge : https://developer.microsoft.com/es-es/microsoft-edge/tools/webdriver/?form=MA13LH#downloads

####  Ejecuccion con Gradle

- Abrir una terminal en la ubicacion del proyecto  y ejecutar el siguiente comando

  `gradle clean test`
  o
  `./gradlew clean test`
  si quieres ver la trazabilidad de la ejcución, anade al comando que vas a ejecutar

  `--info --stacktrace`

- si quiere ejecutar los escenarios de forma independiente puede usar las opcines del IDE en cada clase
#### Revisión de resultado

Gradle genera un reporte en HTML para revisar este reporte ve a la siguiente ruta

`RUTA_DEL_PRUYECTO\target\site\serenity/index.html`

### Happy Coding!


------------

#### Diplomado de Automatización de Pruebas Web
##### Dip Learn Academy y AseUTP
##### Juan de Jesús Fernández Graciano
##### Bryan Estefan Moreno Diaz