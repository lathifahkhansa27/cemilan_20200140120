/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan_20200140120.camilan_20200140120;

/**
 *
 * @author Dell Inspiron
 */
public class Menucamilan {
     public Double getharga(String hsayur){
       
        Double hargasayur = Double.valueOf(hsayur);
        
        return hargasayur;
    }
    
    public Double getjumlah(String jsayur){
    
        Double jumlahsayur = Double.valueOf(jsayur);
    
        return jumlahsayur;
    }
    
    public Double gettotalbayar(Double jbayar, Double hdiskon){
    
        Double tbayar = jbayar - hdiskon;
        
        return tbayar;
    }
    
    public Double getjumlahbayar(Double hsayur, Double jsayur){
    
        Double jbayar = hsayur * jsayur;
    
        return jbayar;
    }
    
    public String getdisc(Double jbayar){
    
        String disc = null;
        
        if (jbayar <16000) {
            disc = "0";
        }else if (jbayar <25000){
            disc = "10";
        }else{
            disc = "15";
        }
        return disc;
    }
    
    public Double gethargadisc(Double jbayar, Integer disk){
        
        Double hdiskon = jbayar*disk/100;
    
        return hdiskon;
    }
    
    public void gettdiskon(Double tbayar, Double jumbayar, Double hdiskon, Integer diskon){
        
        if(jumbayar < 16000){
            diskon = 0;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
            
        }else if( jumbayar < 25000){
            diskon = 10;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
        }else {
            diskon = 15;
            tbayar = jumbayar - (jumbayar*diskon/100);
            hdiskon = jumbayar*diskon/100;
        }
    }
    
    public Double getpembayaran (String uangbayar) {
        Double pembayaran = Double.valueOf(uangbayar);
        
        return pembayaran;
    }
    
    public Double getkembalian(Double tbayar,Double uangbayar){
        Double uangkembalian = uangbayar - tbayar;
        
        return uangkembalian;
    }
}
