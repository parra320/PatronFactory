/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.articulos.Celular;
import ico.fes.articulos.Computadora;
import ico.fes.articulos.Tablets;

/**
 *
 * @author fredy
 */
public class ArtFactory
{
    public static Articulo crearArticulo (int tipo )
    {
        switch(tipo)
        {
            case Articulo.COMPUTADORA_SAMSUNG:
                return new Computadora("Samsung", "Rizen 5", 8, 1000);
            case Articulo.COMPUTADORA_DELL:
                return new Computadora("Dell Alienware", "Intel Core i7", 16, 512);
            case Articulo.COMPUTADORA_APPLE:
                return new Computadora("MacBook Air", "Chip M1", 8, 512);
            case Articulo.CELULAR_XIAOMI:
                return new Celular("Redmi Note 10S", 6, 128);
            case Articulo.CELULAR_OPPO:
                return new Celular("Realme 7", 6, 64);
            case Articulo.CELULAR_IPHONE:
                return new Celular("Iphone XS", 3, 64);
            case Articulo.TABLET_LENOVO:
                return new Tablets("Yoga Tab", 8, 128.0f);
            case Articulo.TABLET_MICROSOFT:
                return new Tablets("Surface Pro 7", 16, 256.0f);
            case Articulo.TABLET_HUAWEI:
                return new Tablets("MatePad Pro 12.6 ", 8, 256.0f);
            default:
                throw new AssertionError();
        }
    }
}
