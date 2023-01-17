import java.util.ArrayList;
public class ArratList {

    public static void main(String[] args) {
        int[] angka1 = new int[2];
        angka1[0] = 1;
        angka1[1] = 2;

        ArrayList<Integer> angka = new ArrayList<Integer>();
        angka.add(0,1);
        angka.add(1,3);
        for(int index=0; index<angka.size();index++){
            System.out.println(angka.get(index));
        }

        ArrayList<String> Kalimat = new ArrayList<String>();
        Kalimat.add(0,"Hello");
        Kalimat.add(2,"Kelas 1A");