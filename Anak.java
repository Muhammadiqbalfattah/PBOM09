import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

public class Anak extends Induk {
    Anak(){
        super();
        System.out.println("Ini adalah Konsttruktor anak ");
    }

    public void informasi(){
        System.out.println("Nama : " + this.nama);
    }

    @Override
    public void makan() {
        super.makan(); //untuk menampilakn keduanya induk n anak
        System.out.println("Saya Suka makan Mie Ayam ");
    }
}
