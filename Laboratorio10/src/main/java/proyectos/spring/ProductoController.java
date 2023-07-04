package proyectos.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @GetMapping("/producto")
    public Producto obtenerProducto() {
        Producto producto = new Producto();
        producto.setCodigo("P001");
        producto.setDescripcion("Torta de Chocolate");
        producto.setPrecio(10.99);
        
        return producto;
    }
}
