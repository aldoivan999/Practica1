public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String palabra,palabra2;
        String palabrainvertida="";
        System.out.println("Ingresa una palabra:\n");
        palabra=s.nextLine();
        System.out.println("Ingrese la palabra al reves");
        palabra2=s.nextLine();
        for (int i = palabra.length()-1; i>=0; i--){
            palabrainvertida += palabra.charAt(i);
        }
        if(palabrainvertida.equalsIgnoreCase(palabra2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    
    }
