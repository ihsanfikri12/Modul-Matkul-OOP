import java.util.Scanner;

class PercabanganKetiga {
    
    public static void main(String args []) {
        String text;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama anda = ");
        String nama = input.nextLine();
        

        switch (nama) {
            case "Nurul":
                text = "Halo nama saya nurul";
                break;
            case "Fikri":
                text = "Halo nama saya Fikri";
                break;
            case "Andi":
                text = "Halo nama saya Andi";
                break;
            default:
                text = "Halo, saya tidak punya nama";
                break;
        }

        System.out.println(text);
    }
}