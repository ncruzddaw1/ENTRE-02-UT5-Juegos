/**
 * Punto de entrada a la aplicación
 * 
 * @Nicolas Cruz Diaz
 */
public class AppRevistaJuegosOnLine 
{
    public static void main(String[] args)
    {       
        if(args.length == 0)
         {
             System.out.println("Error de sistaxis, java AppRevistaJuegosOnLine <nom> <n1>" + 
                                "------------------------------------");
         }
         else
         {
            String nom = args[0];
            int n1 = Integer.parseInt(args[1]);
            RevistaOnLineJuegos revista = new RevistaOnLineJuegos(nom, n1);
            revista.leerDeFichero();
         }        
    }
}
