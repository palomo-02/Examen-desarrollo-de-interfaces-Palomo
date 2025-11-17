/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGICA;

import DTO.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LogicaRegistro {
        private static ArrayList<Registro> listaRegistros = new ArrayList<>();

    public static void añadirregistro(Registro registro) {

        listaRegistros.add(registro);

    }

    public static List<Registro> getRegistro() {

        return listaRegistros;

    }
}
