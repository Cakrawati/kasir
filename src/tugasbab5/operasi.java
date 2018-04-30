/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbab5;

/**
 *
 * @author ASUS
 */
public class operasi {
    public float jmlice;
    public float hasil;
    public float jumlah;
    public float jmlrp;
    public int penyedia;
    public String nama;
    public String name;

    public float dikali(){
        float kali;
        kali = jmlice * jumlah;
        hasil = kali;
        return kali;
    }
        
    public float kalirp(){
        float kalirp;
        kalirp = jmlrp * jumlah;
        hasil = kalirp;
        return kalirp;
    }
    
    public String namapenyedia(){
        String namapenyedia;
        if (penyedia == 1){
            nama = ("Indomaret");
        }
        else if (penyedia == 2){
            nama = ("Alfamart");
        }
        else{
            System.out.println("Maaf Input yang Anda masukkan salah");
            System.exit (0);
        }
        name = nama;
        return nama;
    }    

}
