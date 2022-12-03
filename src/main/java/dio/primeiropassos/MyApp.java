package dio.primeiropassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{
    /**quando o conteneir for inicializado ele percebe
    o componente tipo calculadora e 
    que o MyApp precisou atraves do auto weired 
    precisou realizar a injeção de dependencia**/
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception { 
    
        System.out.println(calculadora.somar(19, 7));

    
    }
    
}
