    
package g4s21p8dlf;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "El Amazonas","Un mamifero","En Rumania","4 años","El Pacifico"
    };
    
    String[] radioR = {
        "china,mexico,estados unidos,rusia",
        "china,guatemala,onduras,salvador",
        "123123millones, 12.12millones,123mil,8",
        "4 años,5 años,4 1/2 de años, 5 1/2 de años",
        "El Pacifico,El Atlantico,El Antartico,El Artico"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
