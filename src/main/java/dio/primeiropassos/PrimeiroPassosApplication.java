package dio.primeiropassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroPassosApplication.class, args);

		/**Não é possivel fazer o uso do new
		pois é implememntado na classe myapp o metodo run
		para que toda vez que a aplicação iniciar ele estara como dependicia e rodara
		**/
		//Calculadora calculadora = new Calculadora();

	}

}
