package com.alura.challegenliteralura.menu;

public class Menu {
    private String menu = """
    1-Buscar libro por título
    2-Buscar libros registrados
    3-Buscar autores registrados
    4-Buscar autores vivos en un determinado año
    5-Buscar libros por idioma
    0-Salir
    
    Elija una opción: """;
    private String bienvenida = "Bienvenidos a literAlura";

    public String getMenu() {
        return menu;
    }

    public String getBienvenida() {
        return bienvenida;
    }
}
