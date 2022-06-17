package EstudoJava;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PercentualEstado {

	public static void main(String[] args) {
		double fat_sp = 67836.43;
		double fat_rj = 36678.66;
		double fat_mg = 29229.88;
		double fat_es = 27165.48;
		double fat_other = 19849.53;
		double fat_total = fat_sp + fat_rj + fat_mg + fat_es + fat_other; 
		DecimalFormat df = new DecimalFormat("00.00"); 
		df.setRoundingMode(RoundingMode.UP);
		
		System.out.println("Percentuais de representação (por estado):" +
				"\n  - SP - " + df.format(fat_sp/fat_total * 100) + "%" +
				"\n  - RJ - " + df.format(fat_rj/fat_total * 100) + "%" +
				"\n  - MG - " + df.format(fat_mg/fat_total * 100) + "%" +
				"\n  - ES - " + df.format(fat_es/fat_total * 100) + "%" +
				"\n  - Outros - " + df.format(fat_other/fat_total * 100) + "%");
	}

}
