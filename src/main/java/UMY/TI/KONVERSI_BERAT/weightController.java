/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMY.TI.KONVERSI_BERAT;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author AISYAH SUHERMAN
 */
@Controller
public class weightController {
    @RequestMapping("/input1")
    @ResponseBody
    public String getInput1(HttpServletRequest dt, Model temp)
    {
        int proses = Integer.parseInt(dt.getParameter("berat"));
        int proses2 = Integer.parseInt(dt.getParameter("data"));
        
        double kg = hitung.kilogramToGram(proses);
        double gk = hitung.gramTokilogram(proses2);
        
        return "Kilogram = " + proses + " kg" + "<p>" +
                "ke Gram = " + kg + " g" + "<p>" + "<hr>" +
                "Gram = " + proses2 + " g" + "<p>" +
                "ke Kilogram = " + gk + " kg";
    }
    
    @RequestMapping("/input2")
    @ResponseBody
    public String getInput2 (HttpServletRequest dt, Model temp)
    {
        
        int proses = Integer.parseInt(dt.getParameter("berat"));
        int proses2 = Integer.parseInt(dt.getParameter("data"));
        
        double kd = hitung.kilogramToKuintal(proses);
        double dk = hitung.KuintalTokilogram(proses2);
        
        return "Kilogram = " + proses + " kg" + "<p>" + "ke Kuintal = " + kd + " kuintal" +
               "<hr><p>" + "Kuintal = " + proses2 + " kuintal" + "<p>" +
                "ke Kilogram = " + dk + " kg";
    }
    
    @RequestMapping("/input2a")
    @ResponseBody
    public String getInput2a (HttpServletRequest dt, Model temp)
    {
        
        int proses = Integer.parseInt(dt.getParameter("berat"));
        int proses2 = Integer.parseInt(dt.getParameter("data"));
        
        double kp = hitung.kilogramToPon(proses);
        double pk = hitung.PonTokilogram(proses2);
        
        return "Kilogram = " + proses + " kg" + "<p>" + "ke Pon = " + kp + " pon" +
               "<hr><p>" + "Pon = " + proses2 + " pon" + "<p>" +
                "ke Kilogram = " + pk + " kg";
    }
    @RequestMapping("/input3")
    @ResponseBody
    public String getInput3 (HttpServletRequest dt, Model temp)
    {
        
        int proses = Integer.parseInt(dt.getParameter("berat"));
        int proses2 = Integer.parseInt(dt.getParameter("data"));
        
        double gh = hitung.gramToOns(proses);
        double hg = hitung.OnsTogram(proses2);
        
        return "Gram = " + proses + " g" + "<p>" +
                "ke Ons = " + gh + " ons" + "<hr><p>" +
                "Ons = " + proses2 + " ons" + "<p>" +
                "ke Gram = " + hg + " g";
    }
}
    