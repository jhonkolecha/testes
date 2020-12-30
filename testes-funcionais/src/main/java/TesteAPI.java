import org.junit.Assert;
import org.junit.Test;
import java.net.HttpURLConnection;
import java.net.URL;


public class TesteAPI {

	String CPFcomRestricao = "97093236014";
	String CPFsemRestricao = "09208279936";
	String CPFinvalido = "11111111111";
	String CPFnaoNumerico = "abcdefghijk";
	String URLrestricoes = "http://localhost:8080/api/v1/restricoes/";
	int codigoComRestricao = 200;
	int codigoSemRestricao = 204; 

	@Test
	public void ConsultaCPFcomRestricao() {
		String urlParaChamada = URLrestricoes + CPFcomRestricao;
		
        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            Assert.assertEquals(codigoComRestricao, conexao.getResponseCode());
        } 
        catch (Exception e) {
        }
	}

	@Test
	public void ConsultaCPFsemRestricao() {
		String urlParaChamada = URLrestricoes + CPFsemRestricao;
		
        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            Assert.assertEquals(codigoSemRestricao, conexao.getResponseCode());
        } 
        catch (Exception e) {
        }
	}

	@Test
	public void ConsultaCPFinvalido() {
		String urlParaChamada = URLrestricoes + CPFinvalido;
		
        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            Assert.assertEquals(codigoSemRestricao, conexao.getResponseCode());
        } 
        catch (Exception e) {
        }
	}

	@Test
	public void ConsultaCPFnaoNumerico() {
		String urlParaChamada = URLrestricoes + CPFnaoNumerico;
		
        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            Assert.assertEquals(codigoSemRestricao, conexao.getResponseCode());
        } 
        catch (Exception e) {
        }
	}
	
//	TO DO LIST:

//	@Test
//	public void SimulacaoCorreta() {
//
//	}
//
//	@Test
//	public void SimulacaoCorretaCPFexistente() {
//
//	}
//	
//	@Test
//	public void SimulacaoCPFinvalido() {
//
//	}
//
//	@Test
//	public void SimulacaoValorMenor() {
//
//	}
//
//	@Test
//	public void SimulacaoValorMaior() {
//
//	}
//
//
//	@Test
//	public void SimulacaoValorCorreto() {
//
//	}
//	
//	@Test
//	public void SimulacaoParcelaMenor() {
//
//	}
//
//	@Test
//	public void SimulacaoParcelaMaior() {
//
//	}
//
//
//	@Test
//	public void SimulacaoParcelaCorreta() {
//
//	}
}