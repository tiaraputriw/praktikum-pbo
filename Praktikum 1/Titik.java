/*Nama File : Titik.java*/
/*Nama/NIM : Tiara Putri Wibowo - 24060122120026*/
/*Tanggal : 19 Februari 2024*/

class Titik {
    double absis, ordinat;
    static double counter;

    Titik(){
        absis = 0;
        ordinat = 0;
        counter++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counter++;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static double getCounter(){
        return counter;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }
}
