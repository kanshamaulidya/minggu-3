/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Koperasi kp = new Koperasi("111333444","Kansha", 5000000);
        
        System.out.println("Nama Anggota: " +kp.getNama());
        System.out.println("Limit Pinjaman : " + kp.getLimit());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        kp.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " +kp.getSimpanan());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        kp.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini : " +kp.getSimpanan());
        
        System.out.println("\nMembayar uang 100.000...");
        kp.setor(100000);
        System.out.println("Jumlah pinjaman saat ini: " +kp.getSimpanan());
        
        System.out.println("\nMembayar uang 2.000.000...");
        kp.setor(2000000);
        System.out.println("Jumlah pinjaman saat ini: " +kp.getSimpanan());
        
    }
}
