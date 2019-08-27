public class Practica1 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        float a,b,res=0;
        System.out.println("Elige una opcion");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        int op=en.nextInt();
        System.out.println("Ingresa el primer numero");
        a=en.nextFloat();
        System.out.println("Ingresa el segundo numero");
        b=en.nextFloat();
        switch(op){
            case 1:
                res=a+b;
            break;    
            case 2:
                res=a-b;
            break;    
            case 3:
                res=a*b;
            break;    
            case 4:
                res=a/b;
            break;    
            
                    
        }
        System.out.println("El resultado de la operacion es:" +res);
    }
    
}
