/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Sultan Firdaus
 */
public class Shape {

    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double compareTo(Shape shape) {
        shape.calculateVolume();
        double selisih = shape.volume - this.volume;
        selisih = selisih < 0 ? selisih * -1 : selisih;
        return selisih;
    }

    private void calculateVolume() {
        this.volume = length * width * height;
    }

    public void cetak() {
        calculateVolume();
        System.out.println("Panjang x lebar x tinggi = " + length + " x " + width + " x " + height);
        System.out.println("Volume = " + volume);
    }
}
