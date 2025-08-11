package exercicioAPI;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um livro para busca: ");

        var titulo = input.nextLine();

        var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=AIzaSyADmaAU3hG1dRJUticuG3bnqb3rcfFWZps";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
