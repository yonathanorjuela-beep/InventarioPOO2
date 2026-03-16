/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> listaProductos = new ArrayList<>();

    // Agregar producto
    public void agregarProducto(Producto producto) {

        for (Producto p : listaProductos) {
            if (p.getId() == producto.getId()) {
                System.out.println("Error: ya existe un producto con ese ID.");
                return;
            }
        }

        listaProductos.add(producto);
    }

    // Mostrar productos
    public void mostrarProductos() {

        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        for (Producto p : listaProductos) {
            p.mostrarInfo();
        }

    }

    // Buscar producto
    public Producto buscarProducto(int id) {

        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }

    // Eliminar producto
    public void eliminarProducto(int id) {

        for (int i = 0; i < listaProductos.size(); i++) {

            if (listaProductos.get(i).getId() == id) {
                listaProductos.remove(i);
                System.out.println("Producto eliminado correctamente.");
                return;
            }

        }

        System.out.println("Producto no encontrado.");
    }

}