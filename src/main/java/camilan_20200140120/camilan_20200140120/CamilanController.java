/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camilan_20200140120.camilan_20200140120;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dell Inspiron
 */
@Controller
public class CamilanController {
    
    
    
    @RequestMapping("/viewbayar")
    public String strukcamilan(HttpServletRequest data, Model sayur){
        
        Menucamilan Mc = new Menucamilan();
        
        String nsayur = data.getParameter("var_namasayur");
        String hsayur = data.getParameter("var_hargakilo");
        String jsayur = data.getParameter("var_jumlahbeli");
        String uangbayar = data.getParameter("var_bayarsayur");
        
        
        Double hargasayur = Mc.getharga(hsayur);
        Double jumlahsayur = Mc.getjumlah(jsayur);
        Double jumlahbayar = Mc.getjumlahbayar(hargasayur, jumlahsayur);
        String disc = Mc.getdisc(jumlahbayar);
        Double hargadiskon = Mc.gethargadisc(jumlahbayar, Integer.valueOf(disc));
        Double totalbayar =  Mc.gettotalbayar(jumlahbayar, hargadiskon);
        Double pembayaran = Mc.getpembayaran(uangbayar);
        Double kembalian = Mc.getkembalian(totalbayar,pembayaran);
        Mc.gettdiskon(totalbayar, jumlahbayar, hargasayur, Integer.valueOf(disc));
        
        
        
        sayur.addAttribute("name",nsayur);
        sayur.addAttribute("price",hsayur);
        sayur.addAttribute("kilo",jsayur);
        sayur.addAttribute("tbayar",totalbayar);
        sayur.addAttribute("hargadisc",hargadiskon);
        sayur.addAttribute("disc",disc);
        sayur.addAttribute("total10",jumlahbayar);
        sayur.addAttribute("jumlah",pembayaran);
        sayur.addAttribute("kembali",kembalian);
        return "camilan";
    }
}