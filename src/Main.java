/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung Energi Kinetik dan Usaha
 *
 */
public class Main {
    public static void main(String[] args) {
        BolaBaseball bb = new BolaBaseball(145, 25);

//        diketahui
        System.out.println("Bola Baseball dilembar dengan ketentuan :\n");
        System.out.print("Massa \t\t= "+bb.getMassa()+ " gram");
        bb.setMassa(bb.getMassa()/1000);
        System.out.println(" atau "+bb.getMassa()+" kilogram");
        System.out.println("Kecepatan \t= "+bb.getKecepatan()+ " m/s");

//        ditanyakan
        System.out.println("\nA. Memiliki Energi Kinetik = "+bb.hitungEnergiKinetik()+" joule");

        System.out.println("B. Usaha yang dilakukan pada bola untuk mencapai " +
                "\n\tkecepatan ini, jika dumulai dari " +
                "keadaan diam \n\t = "
                +bb.hitungUsaha(0, 25)+" joule");
    }
}
