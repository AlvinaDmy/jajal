import java.util.*; //ini scannner atau input atau library

class BeliSendal { //ini super class atau anak

    //ini encapsulation Private = menyembunyikan hak akses(private)
    private String nama;
    private int ukuran;

    //construktor
    //di dalam construktor ada overloading = kumpulan construktor yang parameternya berbeda-beda
    public BeliSendal(String nama){
        this.nama = nama;
    }

    public BeliSendal(String nama, int ukuran){
        this.nama = nama;
        this.ukuran = ukuran;
    }

    //method = kumpulan pernyataan
    //seperti setter dan getter
    //ini method setter
    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    //ini method getter
    public String getNama() {
        return nama;
    }

    public int getUkuran() {
        return ukuran;
    }
}

//inheritance = warisan atau orang tua atau sub class
public class Sendal extends BeliSendal {

    //super = perintah khusus untuk mengakses sub class
    public Sendal(String nama){
        super(nama);
    }

    public Sendal(String nama, int ukuran){
        super(nama, ukuran);
    }

    //if(jika) this.getUkuran(ukuranSendal) > (lebih dari) 45, system print(ukuran jumbo)
    //else(kalau tidak lebih dari 45), system print(ukuran normal)
    public void sendal(){
        if (this.getUkuran() > 45){
            System.out.print("ukuran jumbo\n");
        }else{
            System.out.print("ukuran normal\n");
        }
    }
    public static void main(String[] args) {
            //cetak nama, kelas, dan nim
            String namaLengkap = "Nama  : Nurul Najwa Sabilla";
            System.out.println(namaLengkap);

            String kelasLengkap = "Kelas : TI.21.A3";
            System.out.println(kelasLengkap);

            String nimLengkap = "NIM   : 312110451\n";
             System.out.println(nimLengkap);

        try (Scanner input = new Scanner(System.in)){
    
            System.out.print("nama pemilik sendal: ");
            String nama = input.nextLine();

            System.out.println("berapa ukuran sendal anda: ");
            Integer ukuran = input.nextInt();

            //object = turunan atau hasil dari suatu class
            Sendal sendal1 = new Sendal(nama, ukuran);
            sendal1.sendal();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
