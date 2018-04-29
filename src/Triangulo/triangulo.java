/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;
        
import java.util.Scanner;


/**
 *
 * @author lunat
 */
public class triangulo {
    private int[] lados;

    public triangulo() {
    }
    
    public void calculoPermitro() {
        medidas();
        Boolean a = comprobarTriangulo();
        if (a == true) {
            System.out.println(getLados()[0] + getLados()[1] + getLados()[2]);
        } else {
            System.out.println("Ingrese los lados para armar un triangulo");
            calculoPermitro();
        }
    }
    public Boolean comprobarTriangulo() {
        if (getLados()[0] + getLados()[1] > getLados()[2]) {
            if (getLados()[0] + getLados()[2] > getLados()[1]) {
                return getLados()[2] + getLados()[1] > getLados()[0];
            }
            return false;
        }
        return false;
    }
    public void medidas() {
        setLados(new int[3]);
        Scanner ingreso = new Scanner(System.in);
        for (int i = 0; i < getLados().length; i++) {
            System.out.println("Ingrese lado ");
            getLados()[i] = ingreso.nextInt();
        }
    }
    

    /**
     * @return the lados
     */
    public int[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int[] lados) {
        this.lados = lados;
    }
    
}
