/**
 * 
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 * @author liizb
 *
 */
public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 16.30;
		monedaDolar = (double) Math.round(monedaDolar  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares" );
		
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 18.71;
		monedaEuro = (double) Math.round(monedaEuro  * 100)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros" );
		
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 21.84;
		monedaLibra = (double) Math.round(monedaLibra  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras" );
		
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 0.12;
		monedaYen = (double) Math.round(monedaYen  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes" );
		
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 75.95;
		monedaWon = (double) Math.round(monedaWon  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones" );
		
	}
	
	public void ConvertirDolarAPeso(double valor) {
		double monedaDolarAPeso = valor * 16.30;
		monedaDolarAPeso = (double) Math.round(monedaDolarAPeso  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolarAPeso + " Pesos" );
		
	}
	
	public void ConvertirEuroAPeso(double valor) {
		double monedaEuroAPeso = valor * 18.71;
		monedaEuroAPeso = (double) Math.round(monedaEuroAPeso  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuroAPeso + " Pesos" );
		
	}

	public void ConvertirLibraAPeso(double valor) {
		double monedaLibraAPeso = valor * 18.71;
		monedaLibraAPeso = (double) Math.round(monedaLibraAPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraAPeso + " Pesos" );
		
	}
	public void ConvertirYenAPeso(double valor) {
		double monedaYenAPeso = valor * 0.12;
		monedaYenAPeso = (double) Math.round(monedaYenAPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenAPeso + " Pesos" );
		
	}
	public void ConvertirWonAPeso(double valor) {
		double monedaWonAPeso = valor * 75.95;
		monedaWonAPeso = (double) Math.round(monedaWonAPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonAPeso + " Pesos" );
		
	}
}
