public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    // Las ponderaciones
    int [] worthBuenos={1,2,3,3,4,10}; 
    int [] worthMalos={1,2,2,2,3,5,10};
    
    // Convertimos la entrada en un arraya de int
    String [] buenos=goodAmounts.split(" "); 
    String [] malos=evilAmounts.split(" ");
    int [] conjuntoBuenos= new int[buenos.length];
    int [] conjuntoMalos= new int[malos.length];
    for(int i=0;i<buenos.length;i++)
      conjuntoBuenos[i]=Integer.parseInt(buenos[i]);
    for(int i=0;i<malos.length;i++)
      conjuntoMalos[i]=Integer.parseInt(malos[i]);
    
    // Hacemos la suma ponderada
    int totalBien=0;
    int totalMal=0;
    for(int i=0;i<conjuntoBuenos.length;i++)
      totalBien+=conjuntoBuenos[i]* worthBuenos[i];
    for(int i=0;i<conjuntoMalos.length;i++)
      totalMal+=conjuntoMalos[i]* worthMalos[i];
    
    // Comprobamos el ganador
    return totalMal<totalBien?"Battle Result: Good triumphs over Evil":
    totalMal>totalBien?"Battle Result: Evil eradicates all trace of Good":
    "Battle Result: No victor on this battle field";
  } 
}
