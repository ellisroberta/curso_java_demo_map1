package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {

        // Cria um TreeMap para armazenar cookies, que são pares chave-valor
        Map<String, String> cookies = new TreeMap<>();

        // Adiciona alguns cookies ao map
        cookies.put("username", "maria"); // Nome de usuário
        cookies.put("email", "maria@gmail.com"); // E-mail de usuário
        cookies.put("phone", "99771122"); // Número de telefone

        // Remove o cookie com a chave "email"
        cookies.remove("email");

        // Atualiza o número de telefone com uma nova informação - Não aceita repetição de chaves
        cookies.put("phone", "99771133");

        // Verifica se a chave "phone" está presente no map e imprime o resultado
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        // Obtém e imprime o valor associado à chave "phone"
        System.out.println("Phone number: " + cookies.get("phone"));
        // Tenta obter e imprimir o valor associado à chave "email" (que foi removido)
        System.out.println("Email: " + cookies.get("email"));
        // Imprime o tamanho do map, ou seja, o número de cookies armazenados
        System.out.println("Size: " + cookies.size());
        System.out.println("ALL COOKIES:");

        // Itera sobre as chaves do map e imprime cada cookie
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}