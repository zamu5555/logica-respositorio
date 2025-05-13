package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String contrasena;
        List<String> carrito = new ArrayList<>();

   
        System.out.println("=== Registro de usuario ===");
        System.out.print("Cree un nombre de usuario: ");
        usuario = scanner.nextLine();
        System.out.print("Cree una contraseña: ");
        contrasena = scanner.nextLine();
        System.out.println("Registro exitoso.\n");


        System.out.println("=== Inicio de sesión ===");
        System.out.print("Ingrese su usuario: ");
        String u = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String c = scanner.nextLine();

        if (u.equals(usuario) && c.equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso.\n");


            System.out.println("=== Selección de artículos ===");
            while (true) {
                System.out.print("Ingrese un artículo para agregar al carrito (o 'fin' para terminar): ");
                String articulo = scanner.nextLine();
                if (articulo.equalsIgnoreCase("fin")) break;
                carrito.add(articulo);
            }


            System.out.println("\n=== Revisión de artículos ===");
            if (carrito.isEmpty()) {
                System.out.println("El carrito está vacío.");
            } else {
                for (String art : carrito) {
                    System.out.println("- " + art);
                }
            }

            System.out.print("\n¿Desea confirmar la compra? (sí/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
              
                System.out.println("\n=== Método de pago ===");
                System.out.println("1. Tarjeta");
                System.out.println("2. Efectivo");
                System.out.println("3. Nequi/Daviplata");
                System.out.print("Seleccione una opción: ");
                String metodo = scanner.nextLine();
                System.out.println("Método de pago seleccionado: " + metodo);

                System.out.println("\n=== Confirmación de compra ===");
                System.out.println("Gracias por su compra. Estos son los artículos adquiridos:");
                for (String art : carrito) {
                    System.out.println("- " + art);
                }
            } else {
                System.out.println("Compra cancelada.");
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}