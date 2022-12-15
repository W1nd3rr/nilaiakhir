
import java.util.Scanner;


public class NilaiAkhir {
// nilai akhir diambil dari 35% nilai uts, 45% nilai uas & 20% nilai tugas mandiri
    public static void main(String[] args) {
        int uas,uts,mandiri,hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai UJIAN TENGAH SEMESTER ANDA ");
        uts = input.nextInt();
        System.out.println("Masukkkan nilai UJIAN AKHIR SEMESTER ANDA ");
        uas = input.nextInt();
        System.out.println("Masukkan nilai TUGAS MANDIRI ANDA ");
        mandiri = input.nextInt();
        hasil = ((35 * uts / 100 ) + (45 * uas / 100) + (20 * mandiri / 100));
        System.out.println("Nilai Akhir Anda Adalah " + hasil);
        if (hasil >= 85)
        {
            System.out.println("Nilai Anda adalah A");
        }
        else if (hasil >= 70 && hasil < 85)
        {
            System.out.println("Nilai Anda adalah B");
        }
        else if (hasil >= 55 && hasil < 70)
        {
            System.out.println("Nilai Anda adalah C");
        }
        else if (hasil >= 40 && hasil < 55)
        {
            System.out.println("Nilai Anda adalah D");
        }
        else if (hasil >= 0 && hasil < 40)
        {
            System.out.println("Nilai Anda adalah E");
        }
        else 
        {
            System.out.println("Maaf inputan anda salah");
        }
    }
    
}
