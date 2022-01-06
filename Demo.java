package TugasAkhirPBO;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        System.out.println("*Selamat datang, Silakan isi formulir pendaftaran dibawah" + "\n" +
                            "Untuk mendaftar pada Institut Teknologi Telkom Purwokerto* " + "\n");
        Scanner nama = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String inputnama = nama.nextLine();

        Scanner alamat = new Scanner(System.in);
        System.out.print("Masukkan alamat : ");
        String inputalamat = alamat.nextLine();

        Scanner asalSekolah = new Scanner(System.in);
        System.out.print("Masukkan asal sekolah : ");
        String inputasalSekolah = asalSekolah.nextLine();

        Scanner keyboardtahunLulus = new Scanner(System.in);
        System.out.print("Masukkan tahun lulus : ");
        int inputtahunLulus = keyboardtahunLulus.nextInt();

        Scanner jurusan = new Scanner(System.in);
        System.out.print("Masukkan program studi yang dipilih : ");
        String inputJurusan = jurusan.nextLine();

        Var2 an = new Var2 (inputnama, inputalamat, inputasalSekolah, inputtahunLulus, inputJurusan);
//      an.nama = inputnama/
//      an.alamat = input alamat/
//      an.asalSekolah = inputasalSekolah/
//      an.tahunLulus = input tahunLulus/
//      an.jurusan = inputJurusan/
        Kalimat ki = new Kalimat();
        ki.Pembuka();
        System.out.println("Nama            : "+ an.nama);
        System.out.println("Alamat          : "+ an.alamat);
        System.out.println("Asal Sekolah    : "+ an.asalsekolah);
        System.out.println("Tahuh Lulus     : "+ an.tahunlulus);
        System.out.println("Jurusan         : "+ an.jurusan);
        ki.Penutup();
    }
}
