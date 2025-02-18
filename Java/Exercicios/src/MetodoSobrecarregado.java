public class MetodoSobrecarregado {
    public static void main (String[]args){
// Overload methods são methods that share the same name mas have diferentes parameters
//por exemplo, posso criar infinitos metodos com o mesmo nome, mas preciso usar valores diferentes
//ex:

    int x = add(5, 2);
        System.out.println(x);
    }

    static int add (int a, int b){
        System.out.println("This is method #1");
        return a * b;
    }

    static int add (int a, int b, int c){
        System.out.println("This is method #2");
        return (a * b) + c;
    }
}