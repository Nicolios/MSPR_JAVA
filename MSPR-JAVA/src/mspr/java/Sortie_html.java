/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mspr.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author root
 */
public class Sortie_html {
    
    /**
     *
     * @param path
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void Sortie_html(String path) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String nom = "";
        String poste = "";
        String liste_arme = "";
        
        String line = br.readLine();
        nom += line+" ";
        line = br.readLine();
        nom += line;
        
        poste = br.readLine();
        
        line = br.readLine();
        
        System.out.println("<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "<title>Fiche agent</title>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "\n" +
                            "<h4>"+nom+"</h4>\n" +
                            "br\n" +
                            "<div style=\"text-align: right;\"><img src=\"CI.jpg\" alt=\"Carte d'identité\"></div>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<p>"+poste+"</p>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<ul>\n");
        
        while(br.readLine() != null) {
            liste_arme += "    <li>\n";
            liste_arme += "        " + br.readLine() + "\n";
            liste_arme += "    <li>\n";
        }
        System.out.println(liste_arme);
        
        System.out.println("</ul>\n" +
                            "\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<br>\n" +
                            "<a href=\"index.html\">Accueil</a>\n" +
                            "\n" +
                            "</body>\n" +
                            "</html>");        
    }
    
}
