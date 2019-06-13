package Testes;

import javax.swing.JOptionPane;

public class Baskara2 {
	
	public double delta(double A, double B, double C) {
		return ((Math.pow(B, 2)-4*A*C));
	}
	public double X1(double A, double B, double C) {
		return(-B+(Math.sqrt(((B*B)-4*A*C))))/2*A;
	}
	public double X2 (double A, double B, double C) {
		return(-B-(Math.sqrt(((B*B)-4*A*C))))/2*A;
	}
	
	
	public static void main(String[] args) {

		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de A em sua equação do 2ºGrau;"));
		double B =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de B em sua equação do 2ºGrau;"));
		double C =Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor de C em sua equação do 2ºGrau;"));
		
		Baskara2 ex= new Baskara2();
		
		JOptionPane.showMessageDialog(null, "Esse é o valor de seu Delta");
		JOptionPane.showMessageDialog(null, ex.delta(A, B, C));
		if (ex.delta(A, B, C)>=0) {
			JOptionPane.showMessageDialog(null, "Esse é o valor de seu X1");
			JOptionPane.showMessageDialog(null, ex.X1(A, B, C));
			JOptionPane.showMessageDialog(null, "Esse é o valor de seu X2");
			JOptionPane.showMessageDialog(null, ex.X2(A, B, C));
	}else {
		JOptionPane.showMessageDialog(null, "Seu delta é menor que 0, ou seja, imnpossivel achar as raízes das funções.");
	}

}
}