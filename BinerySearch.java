package tugas;

public class BinerySearch {

    public static void main(String[] args) {
        int data = 9; char abjad = 65; char[] huruf = new char[1000];
        int mid = (data-1)/2;

        char pilihan = 70;

        // Data
        for (int i = 0; i < data; i++){
            huruf[i] = abjad++;
        }

        seleksiTampilan(pilihan,huruf,mid,data);

    }

    private static void seleksiTampilan (char pilihan, char[] huruf, int mid, int data){
        if (pilihan < huruf[mid]){
            kurang(mid, huruf, pilihan);
        } else if (pilihan >= huruf[mid]){
            lebih(mid,huruf,pilihan,data);
        }
    }

    private static void kurang (int mid, char[] huruf, char pilihan){
        for (int i = 0; i < mid; i++){
            if (huruf[i] == pilihan){
                System.out.println(huruf[i]+" ditemukan pada indeks "+i);
                break;
            }
        }
    }

    private static void lebih (int mid, char[] huruf, char pilihan, int data){
        for (int i = mid; i < data; i++){
            if (huruf[i] == pilihan){
                System.out.println(huruf[i]+" ditemukan pada indeks "+i);
                break;
            }
        }
    }

}
