/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author orjue
 */
public class ProductoAlimento  extends Producto {

    private String fechaVencimiento;

    public ProductoAlimento(int id, String nombre, double precio, int cantidad, String fechaVencimiento) {
    super(id, nombre, precio, cantidad);
    this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Alimento -> ID: " + id +
        " | Nombre: " + nombre +
        " | Precio: " + precio +
        " | Cantidad: " + cantidad +
        " | Vence: " + fechaVencimiento);
    }
}
    

