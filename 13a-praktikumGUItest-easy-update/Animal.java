/*
 * Nama File    : Animal.java
 * Pembuat      : Tiara Putri Wibowo - 24060122120026
 */

public abstract class Animal {
    /* Kamus lokal */

    /* Algoritma */
        public abstract void eat();
        public String toString(){
            return this.getClass().getSimpleName();
        }
}
