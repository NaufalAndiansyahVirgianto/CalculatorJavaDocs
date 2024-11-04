import java.util.Scanner;

/**
 * Program kalkulator sederhana untuk melakukan operasi aritmatika dasar:
 * penjumlahan, pengurangan, perkalian, dan pembagian.
 * 
 * <p>
 * Program ini meminta dua angka dari pengguna dan menawarkan pilihan
 * operasi yang ingin dilakukan, kemudian menampilkan hasilnya.
 * </p>
 * 
 * @author YourName
 * @version 1.0
 */
public class SimpleCalculator {
    
    /**
     * Menambahkan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan dari a dan b
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Mengurangi angka kedua dari angka pertama.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan dari a dan b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Mengalikan dua angka.
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian dari a dan b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Membagi angka pertama dengan angka kedua.
     * 
     * <p>
     * Jika angka kedua adalah nol, metode ini akan menampilkan pesan error
     * dan mengembalikan nilai 0 untuk mencegah pembagian oleh nol.
     * </p>
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pembagian dari a dan b, atau 0 jika b adalah nol
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
        return a / b;
    }

    /**
     * Metode utama yang meminta input dari pengguna, menampilkan pilihan operasi,
     * dan mencetak hasil dari operasi yang dipilih.
     * 
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Kalkulator Sederhana!");
        
        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();
        
        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();
        
        // Memilih operasi
        System.out.println("Pilih operasi: ");
        System.out.println("1 - Penjumlahan");
        System.out.println("2 - Pengurangan");
        System.out.println("3 - Perkalian");
        System.out.println("4 - Pembagian");
        
        System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
        int choice = scanner.nextInt();
        
        double result = 0;
        
        // Menghitung hasil berdasarkan pilihan
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Hasil penjumlahan: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Hasil pengurangan: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Hasil perkalian: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                System.out.println("Hasil pembagian: " + result);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1 sampai 4.");
        }
        
        scanner.close();
        System.out.println("Terima kasih telah menggunakan Kalkulator Sederhana!");
    }
}
