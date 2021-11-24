
class Main {
	public static void main(String[] args) {
		String texto = "88fdd.*AD*dsl.sdh%gljk89p#0/PIU/Y/-0Y97@p897?8df9df87h9f7h*/546*/3456*456**hfgjhf*j*58*y*kh*k8sjh6876f7j6fg7jkf87h8fghkjf*f*gh*f*jf*j*46*7*stweokgqopqwg0824u5899gsjh093875u09jhkjabasjkhro235g9y07854675(*)(UOPIJHO(T7856*967()*09j()y76& J9u7yirghopdfhgjdbjodjohjojhjdfojpouth0d-08-08_)(*_)*_)8u-035tp4k5tpodkṕkhbpodjkgbjdopgjbdgpojbipodsfnidnfhlsjglxdkxfjlehjgodijgopewj697gh6ewrg4*/-e*r/g-e*-d9 8fg-*h/-ecr8+rg8+df9g8dh5h56h5IUghbkjnYIGIONkjNUhuioygOUHHiouh9OTYfytVYVYjklPokmlLjP,,ççLLlkpkiojiy0980089-";
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != '1' || texto.charAt(i) != '2' || texto.charAt(i) != '3' || texto.charAt(i) != '4'
					|| texto.charAt(i) != '5' || texto.charAt(i) != '6' || texto.charAt(i) != '7'
					|| texto.charAt(i) != '8' || texto.charAt(i) != '9' || texto.charAt(i) != '0'
					|| texto.charAt(i) != 'P' || texto.charAt(i) != 'I' || texto.charAt(i) != 'Y'
					|| texto.charAt(i) != 'U' || texto.charAt(i) != 'O' || texto.charAt(i) != 'b'
					|| texto.charAt(i) != 'c' || texto.charAt(i) != 'd' || texto.charAt(i) != 'e'
					|| texto.charAt(i) != 'f' || texto.charAt(i) != 'g' || texto.charAt(i) != 'h'
					|| texto.charAt(i) != 'i' || texto.charAt(i) != 'j' || texto.charAt(i) != 'k'
					|| texto.charAt(i) != 'l' || texto.charAt(i) != 'm' || texto.charAt(i) != 'n'
					|| texto.charAt(i) != 'o' || texto.charAt(i) != 'p' || texto.charAt(i) != 'q'
					|| texto.charAt(i) != 'r' || texto.charAt(i) != 's' || texto.charAt(i) != 't'
					|| texto.charAt(i) != 'u' || texto.charAt(i) != 'v' || texto.charAt(i) != 'w'
					|| texto.charAt(i) != 'x' || texto.charAt(i) != 'y' || texto.charAt(i) != 'z'
					|| texto.charAt(i) != 'A' || texto.charAt(i) != 'D') {
				contador++;
			}
		}
		System.out.println(contador);
	}

}