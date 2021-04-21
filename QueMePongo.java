
/* Luego de poner en comun distintas propuestas con mi grupo 
llegamos a la conclusion que implementar un builder da lugar a 
que no se instancie una Prenda que pueda llegar a fallar, sin embargo, 
me quedan ciertas dudas sobre la implementacion de un Builder en cuanto 
a ventajas y desventajas con respecto a utilizar un constructor*/

/* Mi duda principal es en que parte es mas conveniente hacer las validaciones 
en el PrendaBuilder y sobre el colorSecundario */

class Atuendo {
    List<Prenda> prendas;

    void Atuendo(prendas) {
        this.prendas = prendas;
    }
}

class PrendaBuilder {

    Prenda prenda;

    void PrendaBuilder(){
        prenda = new Prenda();
    }

    void agregarCategoria(Categoria categoria) {
        prenda.setCategoria(checkNotNull(categoria, 'La categoria no puede ser nula'));
    }
    void agregarMaterial(Material material) {
        prenda.setMaterial(checkNotNull(material, 'El material no puede ser nulo'));
    }
    void agregarColorPrimario(Color colorPrimario) {
        prenda.setColorPrimario(checkNotNull(colorPrimario, 'El color primario no puede ser nulo'))
    }
    void agregarTipo(TipoPrenda tipo) {
        prenda.setTipo(checkNotNull(tipo, 'El tipo no puede ser nulo'))
    }


    Prenda getPrenda() {
        return prenda;
    }

}

class PrendaDirector {
    
    PrendaBuilder builder;

    void PrendaDirector(){
        builder = new PrendaBuilder();
    }

 
    void ConstruirPrenda(categoria, material, color, tipo)
    {
        
        if(!tipo.esDeCategoria(categoria))
            throw new Exception(message= 'El tipo de prenda no coincide con la categoria');

        builder.agregarCategoria(categoria);
        builder.agregarMaterial(material);
        builder.agregarColorPrimario(color);
        builder.agregarTipo(tipo);

    }
 
    public Vehiculo GetVehiculo()
    {
        return builder.GetVehiculo();
    }

	// void Prenda(CategoriaPrenda categoria, Material material, Color color, TipoPrenda tipo){
	// 	this.categoria = categoria;
	// 	this.material = material;
	// 	this.color = color;
	// 	this.tipo = tipo;
	// }




}

class Prenda {
    
    Categoria categoria;
    Material material;
    Color colorPrimario;
    TipoPrenda tipo;
    Color colorSecundario;

    void setCategoria(categoria) {
        this.categoria = categoria
    }
    void setMaterial(material) {
        this.material = material
    }
    void setColorPrimario(color) {
        this.colorPrimario = color
    }
    void setTipo(tipo) {
        this.tipo = tipo
    }
    

    // Me gustaria saber si existe alguna otra forma mas eficiente (o usando el BUILDER) de implentar el agregado OPCIONAL de un color secundario
    void agregarColorSecundario(Color colorSecundario) {
        this.colorSecundario = checkNotNull(colorSecundario, 'El tipo no puede ser nulo');
    }

}

class TipoPrenda {
    Categoria categoria;

    esDeCategoria(unaCategoria) {
        return unaCategoria == this.categoria;
    }
}

Enum Categoria {
    PARTESUPERIOR,
    CALZADO, 
    PARTEINFERIOR, 
    ACCESORIOS,
}

Enum Material {
    ALGODON, 
    HILO,
}

Enum Color {
    AMARILLO,
    AZUL,
    ROJO,
    ROSA,
    VIOLETA,
    NEGRO,
    BLANCO,
}


// PrendaDirector prenda = new PrendaDirector()
// prenda.construirPrenda(...)
// prenda.agregarColorSecundario()