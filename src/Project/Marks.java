/* We have to calculate the average of marks obtained in three subjects by student A and by student B.
 * Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
 * Provide implementation of abstract method in classes 'A' and 'B'.
 * The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as
 * its parameters for student B.
 * Test your code
 */

package Project;

public abstract class Marks {
    double chemistry;
    double eng;
    double math;
    Marks(double chemistry, double eng, double math) {
        this.chemistry = chemistry;
        this.eng = eng;
        this.math = math;
    }
    abstract double getPercentage();
}

class A extends Marks {
    A (double chemistry, double eng, double math) {
        super(chemistry, eng, math);
    }
    @Override
    double getPercentage() {
        return (chemistry + eng + math) / 3;
    }
}

class B extends Marks {
    double biology;

    B (double chemistry, double eng, double math, double biology) {
        super(chemistry, eng, math);
        this.biology = biology;
    }

    @Override
    double getPercentage() {
        return (chemistry + eng + math + biology) / 4;
    }
}

class testStudent {
    public static void main(String[] args) {

        Marks studentA = new A(4, 5, 4);
        System.out.println("Average Score for student A: "+studentA.getPercentage());

        Marks studentB = new B(90.0, 76.0, 100, 79.0);
        System.out.println("Average Score for student B: "+studentB.getPercentage());
    }
}