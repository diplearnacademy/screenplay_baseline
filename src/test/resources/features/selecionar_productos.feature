#language:es

Característica: Como usuario
  quiero seleccionar un producto
  segun talla, color y cantidad
  para agregarlos al carrito de compras


  Escenario: Seleccion de productos con varias caracteristicas
    Dado  Que Bryan esta en la pagina de teststore
    Cuando Agregar los productos con sus caracteristicas al carrito
      | Producto                | caracteristicas        | Cantidad |
      | sweater                 | Talla: M               | 2        |
      | The best is yet to come | Dimension: 60x90cm     | 2        |
      | Hummingbird printed     | Talla: L, Color: Negro | 2        |
    Entonces  verifa que los productos fueron agregados al carrito