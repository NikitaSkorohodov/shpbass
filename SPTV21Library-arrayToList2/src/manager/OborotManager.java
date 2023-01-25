/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

/**
 *
 * @author NikitaSkr
 */


import entity.Author;
import entity.Product;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

    
  public class OborotManager {
    public Author oborotCashEveryTime(int summaProduct){
        Author oborot = new Author();
        oborot.setSumma(summaProduct);
        return oborot;
    }

    public Author createOborotList(List<Author> oborots) {
        int summaProduct = HistoryManager.totalSumma;
        return oborotCashEveryTime(summaProduct);
        
    }

   public void printOborotList(List<Author> oborots) {
        int sum = 0;
        for (Author oborot : oborots) {
            sum = sum + oborot.getSumma();
        }
        System.out.print("Общая прибыль магазина: " + sum);

        System.out.println();
  } 

    

   
}
