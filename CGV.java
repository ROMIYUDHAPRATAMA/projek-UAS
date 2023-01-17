package model;

import java.util.ArrayList;
import java.util.Scanner;

public class CGV {
    private String IDMovie;
    private String JumUser;
    private int JumTicket;
    private String MovieName;
    private int MoviePrice;
    private String UserName;

    public CGV() {
    }

    public String getIDMovie() {
        return IDMovie;
    }

    public void setIDMovie(String IDMovie) {
        this.IDMovie = IDMovie;
    }

    public String getJumUser() {
        return JumUser;
    }

    public void setJumUser(String jumUser) {
        JumUser = jumUser;
    }

    public int getJumTicket() {
        return JumTicket;
    }

    public void setJumTicket(int jumTicket) {
        JumTicket = jumTicket;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getMoviePrice() {
        return MoviePrice;
    }

    public void setMoviePrice(int moviePrice) {
        MoviePrice = moviePrice;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public static void main(String[] args) {
        int jumuser = 20;
        Scanner sc = new Scanner(System.in);
        ArrayList<CGV> nontonapa = new ArrayList<>();
        System.out.println("Film yang akan ditonton");
        String movieSelect = sc.nextLine();
        ArrayList<String> myUser1 = new ArrayList<>();
        CGV pesanan = new CGV();
        for (int index = 0; index < jumuser; index++) {
            System.out.println("Nama user : ");
            String myUser = sc.nextLine();
            myUser1.add(myUser);
            pesanan.setIDMovie("1");
            pesanan.setJumTicket(jumuser);
            pesanan.setMovieName(movieSelect);
            pesanan.setMoviePrice(55000);
            pesanan.setUserName(myUser);
            nontonapa.add(pesanan);
            System.out.println("Nama penonton " + myUser);
            jumuser--;
            System.out.println("sisa tiket " + jumuser);
            System.out.println("room bioskop " + "1");
            System.out.println("film yang di tonton " + movieSelect);
            System.out.println("harga tiket " + 55000);
        }
        for (int index = 0; index < jumuser; index++) {
            System.out.println("data penonton" + myUser1);
        }
        // Menampilkan Jumlah penonton movie tertentu
        //pesanan.TotalJumlahPenonton(nontonApa,"Avatar");
    }
}
