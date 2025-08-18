package zoopcursoemvideo.encapsulamento;

// Aula 6 - Encapsulamento

public class Teoria {
}

/*
Exemplo: pilha é uma capsula para proteger dos elementos químicos e uma proteção contra o humano
Ajuda criando padrão
ENCAPSULAR - ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior

Você pode conversar com a capsula
Interface é a comunicação
INTERFACE - lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito
            com um objeto dessa classe
Ex: Carro é uma capsula, você não precisa saber oque acontece dentro dele, mas você sabe que o volante gira a roda...
    O carro é uma capsula, os freios/volantes/botões são a interface(comunicação)


Vantagens do encapsulamento:
- tornar mudanças invisíveis
- Facilitar reutilização do código
- reduzir efeitos colaterais

Como encapsular?
- Interface não tem atributos, apenas métodos(metodos abstratos)
Ex: Controlador
    ligar()
    desligar()
    maisVolume()
    menosVolume()
    netflix()
    mutar()
- Todos os metodos são públicos
- Depois da interface definida, criar a classe
- Atributos privados
- ControleRemoto se torna um controlador, e vai ter os metodos
EX: ControleRemoto
    implementa Controlador
    Atributos:
    volume
    ligado
    tocando

    Métodos:
    ligar()
    desligar()
    maisVolume()
    menosVolume()
    netflix()
    mutar()

*/




/*
3 Pilares do OOP
1 - Encapsulamento
2 - Herança
3 - Polimorfismo
*/