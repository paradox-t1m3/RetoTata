# Introduction 
Se realiza solucion para el reto de automatización propuesto por QVision

Reto técnico de automatización.
Stack Tecnológico
•	Screenplay
•	Gradle
•	Cucumber BDD
•	Serenity BDD

Carolina es la jefe de ventas en la agencia de viajes DX Hotels: https://js.devexpress.com/Demos/DXHotels/#home y como parte de las tareas que tiene que hacer, está el de verificar las tarifas cobradas a los clientes; de manera que ella hace  una búsqueda de los hoteles con la tarifa más económica en los diferentes destinos ofrecidos y valida que el precio total sea correcto. El problema es que Carolina maneja muchos clientes a nivel nacional de manera que requiere de un analista de automatización que le ayude a validar esta información antes de sacar los planes a PDN.
Cree un robot que permita seleccionar el hotel con la tarifa más económica para cada uno de los destinos ofrecidos y que valide que el precio total a pagar (TOTAL TO PAY NOW) sea el correspondiente con la siguiente fórmula: No días x Tarifa día.

Tenga en cuenta que el robot debe tener la lógica que permita seleccionar el hotel con la tarifa más baja y no porque se le indique explícitamente cuál seleccionar.
Nota: El presente ejercicio sólo contempla los resultados de la primera página de resultados, si lo desea puede implementar la lógica que permita navegar por los controles de paginación cuando se muestran los resultados. Se tiene en cuenta como un plus.
 
Los datos de Location, Check In, CheckOut y valor total esperado deben ser enviados desde el feature.


Para la evaluación se tendrán en cuenta:
•	Buenas prácticas de desarrollo.
•	Correcta implementación del patrón de diseño.
•	Correcto uso de los selectores HTML.
•	Enviar el comando de gradle para ejecutar la automatización desde la línea de comandos.
•	Que se dé solución al problema propuesto en el enunciado
•	Generación del reporte de resultados de Serenity

# Ejecución del Proyecto

1. Realice la clocacion del proyecto desde la siguiente pagina:

https://github.com/desarrollojesusdorado/RetoAutomatizacionQVision

2. Luego de clonado importelo en un IDE preferiblemente Intellij

3. Configurar data en el feature, las fechas enviadas deben ser a partir de fecha actual con la estructura mes/dia/año

4. Para realizar la ejecucion del proyecto debe entrar a la raiz del proyecto y desde el cmd ejecutar el comando

gradle  clean test --tests *VerificarTarifasDxHotels* aggregate --info

5. Para consultar el reporte de evidencias de serenity ejecute el index.html ubicado en la ruta del proyecto target\site\serenity



