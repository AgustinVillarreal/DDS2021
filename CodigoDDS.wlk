class Prenda {
  var precioPropio
  var estado

  method precio(){
    return estado.precio(precioPropio)
  }

  method tipo(){
    return tipo
  }
}

class Pantalon inherits Prenda {

}

class Saco inherits Prenda {

}

class Camisa inherits Prenda {

}

class Nuevo {
  method precio(unPrecio){
    return unPrecio
  }
}

class Promocion {
  const descuento = 10
  method precio(unPrecio){
    return unPrecio - descuento
  }
}

class Liquidacion {
  method precio(unPrecio){
    return unPrecio / 2
  }
}

class Venta {
  const prendas = [prenda]
  const fecha = new Date()
  const medioPago

  method precioTotal(){
    return medioPago.obtenerRecargo(self.precio()) + self.precio()
  }

  method cantidadDe(unaPrenda){
    return prendas.filter(prenda => prenda == unaPrenda).length()
  }

  method precio(){
    return prendas.map(prenda => prenda.precio()).sum()
  }

  method precioPorPrenda(prenda){
    return
  }

}

class Efectivo {
  method obtenerRecargo(unPrecio){
    return 0
  }
}

class Tarjeta {
  var cantidadCuotas = 3
  const coeficienteFijo
  method obtenerRecargo(unPrecio){
    return cantidadCuotas * coeficienteFijo + 0.01 * unPrecio
  }
}

class Dia {
  const ventas = []
  method gananciasDelDia(){
    return ventas.sum(venta => venta.precioTotal())
  }
}
