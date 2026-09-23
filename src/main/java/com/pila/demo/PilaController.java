package com.pila.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PilaController {

    private pila pila = new pila();

    @PostMapping("/insertar")
    public String insertar(@RequestParam String elemento) {
        pila.agregar(elemento);
        return "Elemento agregado: " + elemento;
    }

    @DeleteMapping("/eliminar")
    public String eliminar() {
        String elemento = pila.quitar();

        if (elemento == null) {
            return "La pila está vacía";
        }

        return "Elemento eliminado: " + elemento;
    }

 @GetMapping("/ver")
public String ver() {
    return pila.obtenerElementos();
}

    @GetMapping("/tamanyo")
    public int tamanyo() {
        return pila.size();
    }
}