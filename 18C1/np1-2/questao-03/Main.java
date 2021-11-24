import java.util.Arrays;
// alternativa correta: Nenhuma das alternativas
class Main {
	public static void main(String[] args) {
    String[] Caracteres = new String[2];
    String value = "88fddADdslsdhgljksdgh089p08909OPIUYIOY97p89s8df8s";

    Caracteres[0]="";
    Caracteres[1]="";

    for (int i = 0; i < value.length(); i++) {
        if (Character.isAlphabetic(value.charAt(i))) {
            if(Caracteres[0].indexOf(value.charAt(i)) < 0  ){
                Caracteres[0] += value.charAt(i);
            }                
        } else if (Character.isDigit(value.charAt(i))) {
            if(Caracteres[1].indexOf(value.charAt(i)) < 0){
                Caracteres[1] += value.charAt(i);
            }
        } 
    }

    char strArray[] = Caracteres[0].toCharArray();
    char strArray2[] = Caracteres[1].toCharArray();

    Arrays.sort(strArray);
    Arrays.sort(strArray2);

    System.out.println("" + new String(strArray) + ", " + new String(strArray2));
  }
}
