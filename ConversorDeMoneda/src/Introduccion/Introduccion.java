package Introduccion;

import javax.swing.JOptionPane;

public class Introduccion {
    public static void main(String[] args) {    	
        String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Menú",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Monedas", "Conversor de Zapatos"},
                "Selecciona");

        if (opcion != null) {
            switch (opcion) {
                case "Conversor de Monedas":
                    convertirMonedas();
                    break;

                case "Conversor de Zapatos":
                    convertirZapatos();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    public static void convertirMonedas() {
        ConvertirMonedas conversorMonedas = new ConvertirMonedas();

        String dinero = validarNumero("Ingresa la cantidad de dinero que deseas convertir:");
        if (dinero != null) {
            int cantidad = Integer.parseInt(dinero);
            String moneda = (String) JOptionPane.showInputDialog(null,
                    "Selecciona la moneda a la que deseas convertir tu dinero", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Pesos Mexicanos a Dólar", "Pesos Mexicanos a Euros",
                            "Pesos Mexicanos a Libras Esterlinas", "Pesos Mexicanos a Yen Japonés",
                            "Pesos Mexicanos a Won surcoreano", "Dólar a Pesos Mexicanos",
                            "Euros a Pesos Mexicanos", "Libras Esterlinas a Pesos Mexicanos",
                            "Yen Japonés a Pesos Mexicanos", "Won surcoreano a Pesos Mexicanos",
                            "Won a Pesos Mexicanos"},
                    "Selecciona");

            if (moneda != null) {
                switch (moneda) {
                    case "Pesos Mexicanos a Dólar":
                        conversorMonedas.ConvertirPesosADolares(cantidad);
                        break;
                    case "Pesos Mexicanos a Euros":
                        conversorMonedas.ConvertirPesosAEuros(cantidad);
                        break;
                    case "Pesos Mexicanos a Libras Esterlinas":
                        conversorMonedas.ConvertirPesosALibras(cantidad);
                        break;
                    case "Pesos Mexicanos a Yen Japonés":
                        conversorMonedas.ConvertirPesosAYen(cantidad);
                        break;
                    case "Pesos Mexicanos a Won surcoreano":
                        conversorMonedas.ConvertirPesosAWon(cantidad);
                        break;
                    case "Dólar a Pesos Mexicanos":
                        conversorMonedas.ConvertirDolarAPeso(cantidad);
                        break;
                    case "Euros a Pesos Mexicanos":
                        conversorMonedas.ConvertirEuroAPeso(cantidad);
                        break;
                    case "Libras Esterlinas a Pesos Mexicanos":
                        conversorMonedas.ConvertirLibraAPeso(cantidad);
                        break;
                    case "Yen Japonés a Pesos Mexicanos":
                        conversorMonedas.ConvertirYenAPeso(cantidad);
                        break;
                    case "Won surcoreano a Pesos Mexicanos":
                        conversorMonedas.ConvertirWonAPeso(cantidad);
                        break;
                    case "Won a Pesos Mexicanos":
                        conversorMonedas.ConvertirWonAPeso(cantidad);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } else {
            	return;
            }
         // Después de realizar la conversión de monedas, mostrar el cuadro de diálogo de confirmación
            Object[] opciones = {"Sí","Cancelar","No"};
            int confirmOption = JOptionPane.showOptionDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (confirmOption == JOptionPane.YES_OPTION) {
                // Si el usuario elige "Sí", reiniciar el proceso y volver al menú principal
                main(null);
            } else {
                // Si el usuario elige "No", mostrar un mensaje de "Programa Finalizado"
                JOptionPane.showMessageDialog(null, "Programa Finalizado", "Fin", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public static void convertirZapatos() {
        ConvertirTallas conversorTallas = new ConvertirTallas();

        String talla = validarNumero("Ingresa la talla de zapatos que deseas convertir:");
        if (talla != null) {
            int tallaZapatos = Integer.parseInt(talla);
            String tipodeZapato = (String) JOptionPane.showInputDialog(null,
                    "Selecciona el tipo de unidad de medida ", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"MEX a USA", "USA a MEX"},
                    "Selecciona");

            if (tipodeZapato != null) {
                switch (tipodeZapato) {
                    case "MEX a USA":
                        conversorTallas.ConversorVeintitres(tallaZapatos);
                        conversorTallas.ConversorVeintiCuatro(tallaZapatos);
                        conversorTallas.ConversorVeintiCinco(tallaZapatos);
                        conversorTallas.ConversorVeintiSeis(tallaZapatos);
                        conversorTallas.ConversorVeintiSiete(tallaZapatos);
                        conversorTallas.ConversorVeintiOcho(tallaZapatos);
                        break;
                    case "USA a MEX":
                        conversorTallas.ConversorCinco(tallaZapatos);
                        conversorTallas.ConversorSeis(tallaZapatos);
                        conversorTallas.ConversorSiete(tallaZapatos);
                        conversorTallas.ConversorOcho(tallaZapatos);
                        conversorTallas.ConversorNueve(tallaZapatos);
                        conversorTallas.ConversorDiez(tallaZapatos);
                        conversorTallas.ConversorOnce(tallaZapatos);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } else {
            	return;}}
            }
   
    

    public static String validarNumero(String mensaje) {
        while (true) {
            String valor = JOptionPane.showInputDialog(null, mensaje);
            if (valor != null) {
                try {
                    Integer.parseInt(valor);
                    return valor;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                return null;
            }
        }
    }
}
