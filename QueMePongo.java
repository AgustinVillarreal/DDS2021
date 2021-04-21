
/* Luego de poner en comun distintas propuestas con mi grupo 
llegamos a la conclusion que implementar un builder da lugar a 
que no se instancie una Prenda que pueda llegar a fallar, sin embargo, 
me quedan ciertas dudas sobre la implementacion de un Builder en cuanto 
a ventajas y desventajas con respecto a utilizar un constructor*/

/* Mi duda principal es en que parte es mas conveniente hacer las validaciones 
en el PrendaBuilder */

class PrendaBuilder {

    Categoria categoria;
    Material material;
    Color colorPrimario;
    TipoPrenda tipo;

    void agregarCategoria(Categoria unaCategoria) {
        this.categoria = checkNotNull(categoria, 'La categoria no puede ser nula')
    }
    void agregarmaterial(Material material) {
        this.material = checkNotNull(material, 'El material no puede ser nulo')
    }
    void agregarcolorPrimario(Color colorPrimario) {
        this.colorPrimario = checkNotNull(colorPrimario, 'El color primario no puede ser nulo')
    }
    void agregartipo(TipoPrenda tipo) {
        this.tipo = checkNotNull(tipo, 'El tipo no puede ser nulo')
    }

    void build() {
        if(!tipo.esDeCategoria(this.categoria))
            throw new Exception(message= 'El tipo de prenda no coincide con la categoria')
        return = new Prenda(this.tipo, this.categoria, this.material, this.colorPrimario)
    }

}

class Prenda {
    
    TipoPrenda tipo;
    Categoria categoria;
    Material material;
    Color colorPrimario;
    Color colorSecundario;

    void agregarColorSecundario(Color unColorSecundario) {
        this.colorSecundario = unColorSecundario;
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