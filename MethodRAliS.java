/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodralis;

/**
 *
 * @author Ax1
 */
public class MethodRAliS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Word("Ali","Abasyt",2);
    }
    public static boolean Word(String a,String b,int x){
        boolean ft=true;
        if(x>a.length()||x>b.length()){
             ft=false;
        }
        else{
            String gh="";
            String ff="";
            
            for(int i=0;i<=x-1;i++){
                ff=ff+a.charAt(i);
                
                }
                 
           for(int j=x;j<b.length() ;j++){
                gh+=b.charAt(j);
                
                
             
            }
           
          
           System.out.print(ff+gh);
           System.out.println();
            
            ft=true;
            
        }
    return ft;
    }
}
