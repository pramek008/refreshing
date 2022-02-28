/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refreshing.ti.umy;


import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
    @RequestMapping("/welcome")
    public String getInputdata(Model model, HttpServletRequest param){
        String input = param.getParameter("sendData");
        double jari = Double.parseDouble(input);
        double phi = 3.1415926535898;
        double luasPermukaan, volume;
        
        luasPermukaan = 4*phi*jari*jari;
        volume =(phi*(jari*jari*jari)*4)/3;
        
        DecimalFormat df = new DecimalFormat("#.##");
              
        
        model.addAttribute("jari", input);
        model.addAttribute("luas", df.format(luasPermukaan));
        model.addAttribute("volume",df.format(volume));
        
               
        return "index";
    } 
}
