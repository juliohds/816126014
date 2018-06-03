package Exercicio1_2_Abstract_Factory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class ExecutarPizzaria {
	
	public static void main(String[] args) throws ParseException {
		FabricaPizzaria fp = new FabricaPizzaria();

		String dia;

		dia = JOptionPane.showInputDialog(null, "Digite a data com esse formato *** dd/MM/yyyy ***");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date ontem = sdf.parse(dia);
		GregorianCalendar gc = new GregorianCalendar();

		gc.setTime(ontem);
			int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
		System.out.println(diaDaSemana);

			if (diaDaSemana == 2 || diaDaSemana == 4 || diaDaSemana == 6) {
			JOptionPane.showMessageDialog(null, fp.funcionarioP());
			}	else if (diaDaSemana == 3 || diaDaSemana == 5 || diaDaSemana == 7) {
					JOptionPane.showMessageDialog(null, fp.funcionarioS());
				}
				else if (diaDaSemana == 1) {
					JOptionPane.showMessageDialog(null, "Desculpe estamos fechados");
				} else {
					JOptionPane.showMessageDialog(null, "Desculpa data incorreta\nObs: *** dd/MM/yyyy ***");
				}
		
			System.exit(0);

	}

}