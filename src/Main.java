import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka: ");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        System.out.println("Masukkan angka-angka: ");
        for (int i = 0; i<n; i++){
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++){ //pada loop dibagian ini seharusnya dimulai dari 0
            total += angka[i];
        }

        double rataRata = (double) total/n;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }
}
