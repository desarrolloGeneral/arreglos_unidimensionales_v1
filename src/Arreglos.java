import java.util.Scanner;

class Datos
{
    private String nombres[];
    private String materias[];
    private int p1M1[],p2M1[],p3M1[];
    private int p1M2[],p2M2[],p3M2[];
    private int p1M3[],p2M3[],p3M3[];
    private double [] promM1,promM2,promM3;
    private Scanner teclado;        
    
    //constructor de la clase
    public Datos()
    {
      nombres =new String[]{"Marco Antonio","Panfilo","Verónica","Vicente","Gloria"};
      materias=new String[]{"Estructura de Datos","Ingles","IoT"};
    
      p1M1 = new int[5];
      p2M1 = new int[5];
      p3M1 = new int[5];
      
      p1M2 = new int[5];
      p2M2 = new int[5];
      p3M2 = new int[5];
      
      p1M3 = new int[5];
      p2M3 = new int[5];
      p3M3 = new int[5];

//        p1M1 = new int[]{6,7,8,9,8};
//        p2M1 = new int[]{6,7,8,6,9};
//        p3M1 = new int[]{6,7,7,9,8};
//        
//        p1M2 = new int[]{8,8,8,9,8};
//        p2M2 = new int[]{9,8,8,6,9};
//        p3M2 = new int[]{6,7,8,8,9};
//        
//        p1M3 = new int[]{9,8,9,9,8};
//        p2M3 = new int[]{6,8,9,6,8};
//        p3M3 = new int[]{7,7,7,8,8};
        
      promM1 = new double[5];
      promM2 = new double[5];
      promM3 = new double[5];   
      
      teclado = new Scanner(System.in);
    }        
    
    public void calificaciones(String materia,int parcial[],int numParcial)
    {
        System.out.println("CALIFICACIONES de "+materia + ", Parcial"+numParcial);
        for(int i=0; i<5; i++) //Recorre alumnos y asigna calificación parcial
        {
            System.out.print(nombres[i] + ":");
            parcial[i] = teclado.nextInt();   
        }
        System.out.println("");    
    } 

    public void promediar()
    {
        for(int i=0; i<5; i++)
            promM1[i]=(p1M1[i]+p2M1[i]+p3M1[i])/3.0;
    
        for(int i=0; i<5; i++)
            promM2[i]=(p1M2[i]+p2M2[i]+p3M2[i])/3.0;
            
        for(int i=0; i<5; i++)
            promM3[i]=(p1M3[i]+p2M3[i]+p3M3[i])/3.0;    
    }        
    
    public void mostrar()
    {
        System.out.format("%-23s %-24s %-24s %-24s\n", 
                "********************",materias[0],materias[1],materias[2]);
        System.out.format("%20s %5s %5s %5s %6s %5s %5s %5s %6s %5s %5s %5s %6s\n", 
                "NOMBRE DEL ALUMNO","P1","P2","P3","PROM",
                "P1","P2","P3","PROM",
                "P1","P2","P3","PROM");
        for(int i=0; i<5; i++)
        {
            System.out.format("%-20s %5d %5d %5d %6.1f %5d %5d %5d %6.1f %5d %5d %5d %6.1f\n",
                                nombres[i],
                                p1M1[i],p2M1[i],p3M1[i],promM1[i],
                                p1M2[i],p2M2[i],p3M2[i],promM2[i],
                                p1M3[i],p2M3[i],p3M3[i],promM3[i]);
        }    
    }        
    
            
    public String[] getNombres() {
        return nombres;
    }

    public String[] getMaterias() {
        return materias;
    }

    public int[] getP1M1() {
        return p1M1;
    }

    public int[] getP2M1() {
        return p2M1;
    }

    public int[] getP3M1() {
        return p3M1;
    }

    public int[] getP1M2() {
        return p1M2;
    }

    public int[] getP2M2() {
        return p2M2;
    }

    public int[] getP3M2() {
        return p3M2;
    }

    public int[] getP1M3() {
        return p1M3;
    }

    public int[] getP2M3() {
        return p2M3;
    }

    public int[] getP3M3() {
        return p3M3;
    }
}        

public class Arreglos 
{
    public static void main(String args[])
    {
        Datos d = new Datos();
//        d.calificaciones(d.getMaterias()[0],d.getP1M1(),1);
//        d.calificaciones(d.getMaterias()[0],d.getP2M1(),2);
//        d.calificaciones(d.getMaterias()[0],d.getP3M1(),3);
//        
//        d.calificaciones(d.getMaterias()[1],d.getP1M2(),1);
//        d.calificaciones(d.getMaterias()[1],d.getP2M2(),2);
//        d.calificaciones(d.getMaterias()[1],d.getP3M2(),3);
//        
//        d.calificaciones(d.getMaterias()[2],d.getP1M3(),1);
//        d.calificaciones(d.getMaterias()[2],d.getP2M3(),2);
//        d.calificaciones(d.getMaterias()[2],d.getP3M3(),3);
        d.promediar();   
        
        d.mostrar();
    }        
}
