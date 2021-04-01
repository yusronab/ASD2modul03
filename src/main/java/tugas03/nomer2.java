package tugas03;
import java.util.Scanner;
public class nomer2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] data = {2,4,6,8,10,12,14,16,18,20};
        int indeksAkhir = data.length-1;
        int indeksAwal = 0;
        int found = 0;
        int tengah = 0;
        
        System.out.println("list data angka:");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        
        System.out.println("\nmasukan angka yang akan dicari:");
        int key = input.nextInt();
        
        while ((indeksAwal <= indeksAkhir)&&(found == 0)){
            tengah = (indeksAkhir+indeksAwal)/2;
            System.out.println("nilai tengah: "+tengah);
            if (key == data[tengah]){
                found = 1;
                System.out.println("nomer key: "+key+" indeks ke-"+tengah);
            }
            else{
                if (key < data[tengah]){
                    System.out.println("<- kiri");
                    indeksAkhir = tengah-1;
                }
                else{
                    System.out.println("kanan ->");
                    indeksAwal = tengah+1;
                }
            }
        }
        if (found == 1){
            System.out.println("\ndata telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
            System.out.println("\n===== hai Yusron =====");
        }
    }
}
