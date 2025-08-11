package listSetMap.contaBancaria;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Conta> contas = new HashMap<>();

        // Criando contas
        contas.put("origem", new Conta("origem", "Raquel Leite"));
        contas.put("destino", new Conta("destino", "Ricardo Polovini"));

        // Depositando saldo inicial nas contas
        contas.get("origem").depositar(1000);
        contas.get("destino").depositar(500);

        // Transferindo 300 da conta origem para destino
        boolean sucesso = contas.get("origem").transferir(contas.get("destino"), 300);

        if (sucesso) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Falha na transferência.");
        }

        // Mostrar saldo atual das contas
        System.out.println("Saldo da conta origem: " + contas.get("origem").getSaldo());
        System.out.println("Saldo da conta destino: " + contas.get("destino").getSaldo());
    }
}
