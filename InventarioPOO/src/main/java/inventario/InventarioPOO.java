package inventario;

import java.util.Scanner;

public class InventarioPOO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n===== SISTEMA DE INVENTARIO =====");
            System.out.println("1. Agregar producto electrónico");
            System.out.println("2. Agregar alimento");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Buscar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");

            try {

                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Precio: ");
                        double precio = scanner.nextDouble();

                        System.out.print("Cantidad: ");
                        int cantidad = scanner.nextInt();

                        System.out.print("Meses de garantía: ");
                        int garantia = scanner.nextInt();

                        ProductoElectronico pe =
                                new ProductoElectronico(id, nombre, precio, cantidad, garantia);

                        inventario.agregarProducto(pe);

                        System.out.println("Producto electrónico agregado.");
                        break;

                    case 2:

                        System.out.print("ID: ");
                        int idA = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nombre: ");
                        String nombreA = scanner.nextLine();

                        System.out.print("Precio: ");
                        double precioA = scanner.nextDouble();

                        System.out.print("Cantidad: ");
                        int cantidadA = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Fecha de vencimiento: ");
                        String fecha = scanner.nextLine();

                        ProductoAlimento pa =
                                new ProductoAlimento(idA, nombreA, precioA, cantidadA, fecha);

                        inventario.agregarProducto(pa);

                        System.out.println("Alimento agregado.");
                        break;

                    case 3:

                        inventario.mostrarProductos();
                        break;

                    case 4:

                        System.out.print("Ingrese ID a buscar: ");
                        int buscar = scanner.nextInt();

                        Producto encontrado = inventario.buscarProducto(buscar);

                        if (encontrado != null) {
                            encontrado.mostrarInfo();
                        } else {
                            System.out.println("Producto no encontrado.");
                        }

                        break;

                    case 5:

                        System.out.print("Ingrese ID a eliminar: ");
                        int eliminar = scanner.nextInt();

                        inventario.eliminarProducto(eliminar);

                        break;

                    case 6:

                        System.out.println("Saliendo del sistema...");
                        break;

                    default:

                        System.out.println("Opción inválida.");
                }

            } catch (Exception e) {

                System.out.println("Error: entrada inválida.");
                scanner.nextLine();
            }

        }

    }

}