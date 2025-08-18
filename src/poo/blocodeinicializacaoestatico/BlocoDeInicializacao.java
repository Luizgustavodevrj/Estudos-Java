package poo.blocodeinicializacaoestatico;

// Aula 63 - Poo - Parte 1 - Bloco de inicializacao estaticos

import poo.blocodeinicializacaoestatico.funcionalidades.Anime;

/*
📌 O que é um bloco de inicialização estático?
É um bloco de código que é executado uma única vez quando a classe é carregada na memória
 — antes de qualquer objeto ser criado ou mesmo antes de métodos static serem chamados.
 */

public class BlocoDeInicializacao {
    public static void main(String[] args) {

        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();


    }
}
/*
✅ Para que serve?
Você usa um bloco de inicialização estático quando:
precisa inicializar variáveis estáticas complexas;
quer executar algum código uma vez só, no momento em que a classe for usada pela primeira vez.
*/

/*
🆚 Diferença de um construtor?
Construtor	                                Bloco Estático
Executado toda vez que o objeto é criado	Executado uma única vez
Pode acessar membros da instância	        Só pode acessar membros static
*/