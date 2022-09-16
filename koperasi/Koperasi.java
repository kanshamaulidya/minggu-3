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
public class Koperasi {
    private String nik;
    private String nama;
    private float limit;
    private float simpanan;
    
    Koperasi(String nik, String nama, float limit){
        this.nik = nik;
        this.nama = nama;
        this.limit = limit;
        this.simpanan = 0;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public void setLimit(float limit){
        this.limit = limit;
    }
    public String getNik(){
        return nik;
    }
    public String getNama(){
        return nama;
    }
    public float getLimit(){
        return limit;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void pinjam(float uang){
        simpanan += uang;
        if(uang > limit){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            simpanan =0;
        }else{
            System.out.println();
        }
    }
    public void setor(float uang){
        if(uang <= 400000){
            System.out.print("Maaf, angsuran harus 10% dari jumlah pinjaman");
            simpanan -= 0;
        }else{
            simpanan -= uang;
        }
    }
}
