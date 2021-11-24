// alternativa correta: 110
class Main {
	public static void main(String[] args) {
		String texto = "88fdd+*AD*dsl.sdh%gljk89p#O/PIU/YI-OY97@p89?8df8s@d7fh987h+9fd7h9fd7h97h98743*+/672978y3f2905n709s8175f908b67098)&9r79ib86evv576Tb897(N)&N()8kygitg*(7Y890&)jhoijo*&()&()hkjhoy()*)(jpokj()u)*(fghjklçkiuytrtyuhjikolpjhgfdserewqruiopuyterwuiklym(yrd$f8N&TG8(ym09*U(*U)&(y9tn6**R&%f98GB&9b6*Y()*790709&8TUIYTUIYGIOY&()(YuiJKH*O&(UITIUYT*(&&)(&)(&)(8yHHYIOOT*(&Uyoiyoiyoy(YUGYRFHJLRFYDFGHJK8678657890KJ&$&*()_(UIHJBKNM<KLI%R*((Y*YU**UY(UIjkKLJJHJrtyguhjikoojigy$&t*(u)iijhb";
		String letras = "abcdefghijlmnopqrstuvxzkwy";
		String numeros = "1234567890";
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (!pertence(texto.charAt(i), numeros)) {
				String s = Character.toString(texto.charAt(i)).toLowerCase();
				if (!pertence(s.charAt(0), letras)) {
					contador++;
				}
			}
		}
		System.out.println(contador);
	}

	public static boolean pertence(char o, String c) {
		boolean resultado = false;
		for (int n = 0; n < c.length(); n++) {
			if (o == c.charAt(n)) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
}