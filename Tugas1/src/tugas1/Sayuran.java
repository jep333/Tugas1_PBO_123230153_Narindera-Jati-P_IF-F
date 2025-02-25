/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

public class Sayuran {
    public static void main(String[] args) {
        Carrot wortel = new Carrot();
        Spinach bayam = new Spinach();
        Broccoli brokoli = new Broccoli();

        wortel.tampilkanInfo();
        wortel.tumbuh();
        wortel.caraMakan();
        wortel.khasiat();
        
        System.out.println();

        bayam.tampilkanInfo();
        bayam.tumbuh();
        bayam.caraMakan();
        bayam.khasiat();
        
        System.out.println();

        brokoli.tampilkanInfo();
        brokoli.tumbuh();
        brokoli.caraMakan();
        brokoli.khasiat();
    }
}

abstract class Vegetable {
    String nama; 

    public Vegetable(String nama) {
        this.nama = nama;
    }

    abstract void tumbuh();

    public void tampilkanInfo() {
        System.out.println(nama + " adalah sayuran yang sehat.");
    }
}

interface Edible {
    void caraMakan(); 
    void khasiat();
}

class Carrot extends Vegetable implements Edible {
    public Carrot() {
        super("Wortel"); 
    }

    @Override
    void tumbuh() {
        System.out.println("Wortel tumbuh di dalam tanah.");
    }

    @Override
    public void caraMakan() {
        System.out.println("Wortel bisa dimakan mentah atau dimasak.");
    }
    
    @Override
    public void khasiat(){
        System.out.println("Wortel mengandung khasiat menjaga kesehatan mata");
    }
}

class Spinach extends Vegetable implements Edible {
    public Spinach() {
        super("Bayam");
    }

    @Override
    void tumbuh() {
        System.out.println("Bayam tumbuh di tanah dengan banyak sinar matahari.");
    }

    @Override
    public void caraMakan() {
        System.out.println("Bayam lebih enak dimakan segar atau direbus.");
    }
    
    @Override
    public void khasiat(){
        System.out.println("Bayam kaya akan zat besi");
    }
}

class Broccoli extends Vegetable implements Edible {
    public Broccoli() {
        super("Brokoli");
    }

    @Override
    void tumbuh() {
        System.out.println("Brokoli tumbuh dengan baik di cuaca dingin.");
    }

    @Override
    public void caraMakan() {
        System.out.println("Brokoli biasanya dikukus atau ditumis.");
    }
    
    @Override
    public void khasiat(){
        System.out.println("Brokoli jika dikonsumsi baik untuk sistem pernapasan");
    }
}



