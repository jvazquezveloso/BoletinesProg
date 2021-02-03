
package boletin4_1;

import java.util.Scanner;

public class Boletin4_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Libro boletin = new Libro();
        System.out.println("Titulo:");
        String tit = sc.nextLine();
        //boletin.setTitulo(tit);
        System.out.println("Autor:");
        String aut = sc.nextLine();
        //boletin.setAutor(aut);
        System.out.println("Ano:");
        int ano = sc.nextInt();
        //boletin.setAno(ano);
        System.out.println("Número de páxinas:");
        short pag = sc.nextShort();
        //boletin.setPaginas(pag);
        System.out.println("Valoración:");
        float val = sc.nextFloat();
        //boletin.setValoracion(val);
        Libro boletin2 = new Libro(tit,aut,ano,pag,val);
        //boletin.amosar();
        boletin2.amosar();
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
