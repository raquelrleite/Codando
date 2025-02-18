package headFirstJava.chapterOne;

public class gameRandomWords {  // Random Game of Words
    public static void main(String[] args) {

      // Three sets of words
      String[] wordListOne = {"dynamic", "datail-oriented", "focused"};
      String[] wordListTwo = {"space", "clustered", "outside-the-box"};
      String[] wordListThree = {"solution", "mission", "vision"};

      //Find out how many words are in each list
      int oneLenght = wordListOne.length;
      int twoLenght = wordListTwo.length;
      int threeLenght = wordListThree.length;
      System.out.println(oneLenght);
      System.out.println(twoLenght);
      System.out.println(threeLenght);
      System.out.println();

      //Genetare three random numbers
      int rand1 = (int) (Math.random() * oneLenght);
      int rand2 = (int) (Math.random() * twoLenght);
      int rand3 = (int) (Math.random() * threeLenght);
      String phrase = wordListOne [rand1] + ", " + wordListTwo [rand2] + ", " + wordListThree [rand3] + ".";
      System.out.println("What we need is a " + phrase);

    }
}

