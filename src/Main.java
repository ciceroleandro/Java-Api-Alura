import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;





public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Pegar os dados da api atraves de uma conexão http
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);



        //Extrair os dados que interessam (titulo, poster, classificação - parciar os dados)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        //List<String[]> Lista = new ArrayList<String[]>();

        //Exibir e manipular os dados da forma como desejar




    }
}