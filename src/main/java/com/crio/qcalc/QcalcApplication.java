package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");


		StandardCalculator calc = new StandardCalculator();
		calc.add(2.5, 3.5);
		calc.printResult();

		// calc.add(1, 2);
		// System.out.println(calc.getResult());

		ScientificCalculator sci =new ScientificCalculator();
		sci.square(10);
		sci.printResult();


		
	}

}
