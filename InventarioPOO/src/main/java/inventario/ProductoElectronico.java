/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

public class ProductoElectronico extends Producto {

    private int garantiaMeses;

    public ProductoElectronico(int id, String nombre, double precio, int cantidad, int garantiaMeses) {
        super(id, nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(
                "Electrónico -> ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: " + precio +
                " | Cantidad: " + cantidad +
                " | Garantía: " + garantiaMeses + " meses"
        );
    }
}