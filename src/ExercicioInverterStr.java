
public class ExercicioInverterStr {

	public static void main(String[] args) {
		
		String str = "Hello, world!";
        String strInvertida = inverterString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
    
    public static String inverterString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        char[] chars = str.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;
        
        while (inicio < fim) {
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(chars);
	}

}
