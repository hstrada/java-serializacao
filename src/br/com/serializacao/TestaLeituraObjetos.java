package br.com.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraObjetos {
	public static void main(String[] args) throws IOException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("medicamentos.txt"));
		List<Item> medicamentos = null;
		try {
			medicamentos = (List<Item>) ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		for (Item med : medicamentos) {
			System.out.println(med);
			System.out.println(med.getNome());
			System.out.println(med.getPreco());
			System.out.println("---------------------");
		}
	}
	
}
