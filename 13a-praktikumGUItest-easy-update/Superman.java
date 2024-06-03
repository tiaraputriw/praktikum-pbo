/*
 * Nama File    : Superman.java
 * Pembuat      : Tiara Putri Wibowo - 24060122120026
 */

public class Superman extends Kryptonian{
    /* Kamus lokal */
        private String name;

    /* Algoritma */
        public Superman(String name){
            this.name = name;    
        }

        public void takeOff(){
            System.out.println("Superman melompat");
        }

        public void land(){
            System.out.println("Superman mendarat");
        }

        public void fly(){
            System.out.println("Superman terbang");
        }

        public void eat(){
            System.out.println("Nasi Goreng");
        }

        public String getName(){
            return this.name;
        }
}