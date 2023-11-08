/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author Sultan Firdaus
 */
public class Child extends Parent {

    public Child() {

    }

    public void method1() {
        System.out.println("Child's method1()");
    }

    public static void main(String args[]) {
        Parent p = new Child();
        p.method2();
    }
}
