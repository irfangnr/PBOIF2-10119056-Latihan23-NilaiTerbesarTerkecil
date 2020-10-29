/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan23.nilaiterbesarterkecil;
import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Nilai besar kecil
 */

public class PBOIF210119056Latihan23NilaiTerbesarTerkecil {

    public static void main (String args[]){
        
        Scanner masukan=new Scanner(System.in);
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.print("Masukan Nama Petugas : ");
        String nama=masukan.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa: ");
        int min,max;
        int n=masukan.nextInt();
        int arr[]=new int[n]; 

        for(int i=0; i<n; i++){
           System.out.print("Masukan Nilai Mahasiswa Ke-"+(i+1)+" = ");
           arr[i]=masukan.nextInt();
           }
           min=arr[0];
           max=arr[0];
           for(int i=0; i<n; i++){
             if(min>arr[i]){
               min=arr[i];
             }

             if(max<arr[i]){
               max=arr[i];  
             }
           }
           System.out.println("\n=====Hasil Nilai Mahasiswa=====");
           for(int i=0; i<n; i++){
           System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" = "+arr[i]+"\n");
           }
           System.out.print("\nNilai Terbesar adalah "+max);
           System.out.print("\nNilai Terkecil adalah "+min);
           System.out.println("\n\nPetugas : "+nama);
        }
    }

