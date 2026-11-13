/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodstralis;

/**
 *
 * @author Ax1
 */
public class MethodStrAliS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Practice Java ---");   
        String[] Df={"Ali","Iman","Ahmad","Reza"};
        NameD(Df);
        String jk="ALIOSD";
        System.out.println(jk.charAt(jk.length()-1));
        String[] fr1={"Ali","AHmad","Abas","Jamal","Ali"};
        NameE(fr1);
        NameF(fr1);
        NameH(fr1,"Ali");
        String[] L1={"Ali","Ahmady","Iman","Kazemi","jafar","jafari"};
        NameJ(L1);
    }
    public static void NameD(String[] nd){
       
        for(int i=0;i<=nd.length-1;i++){
            System.out.print(nd[i].charAt(0));
        }
        System.out.println();
    }
    public static void NameE(String[] fr){
       
        for(int i=0;i<=fr.length-1;i++){
             char fro=fr[i].charAt(fr[i].length()-1);
            System.out.print(fro);
        }
        System.out.println();
    }
    public static void NameF(String[] er){
        for(int i=0;i<=er.length-1;++i){
           System.out.print(" ");
            for(int j=er[i].length()-1;j>=0;j--){
               char fgh=er[i].charAt(j);
             System.out.print(fgh);
             
           }
            
        }
     System.out.println();
    }
    public static void NameH(String[] es,String et){
        int CountN=0;
        for(int i=0;i<=es.length-1;i++){
            if(es[i]==et){
                CountN++;
            }
        }
        System.out.println(CountN);
    }
    public static void NameJ(String[] ln){
        for(int i=0;i<=ln.length-1;i+=2){
            System.out.println(ln[i]);
            
        }
    }
}
