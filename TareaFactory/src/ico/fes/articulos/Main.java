/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.articulos;

import ico.fes.factory.ArtFactory;
import ico.fes.factory.Articulo;
import java.util.Scanner;

/**
 *
 * @author fredy
 */
public class Main
{
    public static void main(String[] args)
    {     
        int seleccion = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Que deseas comprar?:");
        System.out.println(Computadora.COMPUTADORA_SAMSUNG + ") Computadora Samsung");
        System.out.println(Computadora.COMPUTADORA_DELL + ") Computadora Dell");
        System.out.println(Computadora.COMPUTADORA_APPLE + ") Computadora Apple");
        System.out.println(Celular.CELULAR_XIAOMI + ") Celular Xiaomi");
        System.out.println(Celular.CELULAR_OPPO + ") Celular Oppo");
        System.out.println(Celular.CELULAR_IPHONE + ") Celular Iphone");
        System.out.println(Tablets.TABLET_LENOVO + ") Tablet Lenovo");
        System.out.println(Tablets.TABLET_MICROSOFT + ") Tablet Microsoft");
        System.out.println(Tablets.TABLET_HUAWEI + ") Tablet Huawei");
        
        try
        {
            System.out.print("Elige un numero: ");
            seleccion = teclado.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("No tecleaste ningun numero");            
        }
        
        Articulo producto = ArtFactory.crearArticulo(seleccion);
        System.out.println(producto.toString());
    }
}
