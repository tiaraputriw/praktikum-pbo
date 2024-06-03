/**
 * Nama File    : Bird.java
 * Pembuat      : Tiara Putri Wibowo
 */

public class Bird extends Animal implements IFlyer{
    /* Kamus lokal */

    /* Algoritma */
        public void takeOff(){
            System.out.println("Burung meregangkan sayap");
        }

        public void land(){
            System.out.println("Burung mendarat");
        }

        public void fly(){
            System.out.println("Burung terbang");
        }

        public void eat(){
            System.out.println("Makanan Burung");
        }
}
