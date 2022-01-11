package fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datas {

	public static void main(String[] args) throws ParseException {
		
		//criando objetos para especificar o formato da data (tipo de dado: string).
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//a operação parse recebe um dado em formato de string, respeitando o formato do objeto
		//e converte para data.
		Date y1 = sdf1.parse("06/01/2021");
		Date y2 = sdf2.parse("06/01/2021 16:24:23");
		
		//mostrando meu objeto com o formato definido.
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		//para mostrar uma data atual faz-se:
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		
		
		//MANIPULANDO DATAS
		//primeiro vamos instanciar o calendar (comando de manipulação de datas)
		//depois iremos usar o comando setTime na variavel criada para o Calendar
		//e usaremos de paramentro (entre os parenteses) a data a ser manipulada
		//então usa-se o .add para adicionar horas, minutos, dias, meses ou anos a 
		//uma data e depois é só igualar a data a variavel do objeto com o comando
		// .getTime();
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		cal.add(Calendar.HOUR_OF_DAY, 4); //adicionando 4 horas
		cal.add(Calendar.MINUTE, 56); //adicionado 56 minutos
		cal.add(Calendar.DAY_OF_MONTH, 5); //adicionando 5 dias a data
		x1 = cal.getTime();
		
		//OBTENDO UMA UNIDADE DE TEMPO
		//com este comando eu consigo oter o mês, dia, horas, minutod, anos, segundos etc
		//de uma data especifica
		Calendar call = Calendar.getInstance();
		call.setTime(x1);
		int minutos = call.get(Calendar.MINUTE);
		//é necessário colocar esse 1 aomando pois o java entende que janeiro é o mês 0, então para
		//corrigir isto, soma-se 1;
		int mes = 1 + call.get(Calendar.MONTH);
		
	}

}
