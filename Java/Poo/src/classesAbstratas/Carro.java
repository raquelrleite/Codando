package classesAbstratas;

public abstract class Carro {

    /*
    Carro é algo genérico, abstrato, não é concreto.
    Essa classe carro pode ser qualquer tipo de carro. TODO carro corre, acelera. Todo carro tem caracteristicas e comportamentos diferentes, então, não é uma boa prática permitir que outro programador ou o usuário consiga criar um objeto carro. Por isso,colocamos ABSTRACT antes de class.

    Depois de colocar abstract, voce proibe que qualquer outra pessoa crie um objeto atraves de carro.

    Em java, não é possivel criar objetos atraves de uma classe abstrata. */

    public abstract void correr();

    /*
    Toda vez que voce cria um método abstrato, a classe precisa ser abstrata obrigatóriamente.

    Um método abstrato não pode ter corpo, mas qual o sentido de um método que não pode ter corpo?

    Simples, voce obriga toda classe por herança a ter os métodos de carro.

    Você também consegue criar um método normal, com alguma implementação.
     */
}

