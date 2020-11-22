package Exercise;

class Num {
    Num(int i) {  this.i = i;    }
    public String toString() { return i + ""; }
    int i;
}

public class ForEach {

    public static void main(String[] args) {
        Num[] values = {new Num(1), new Num(2)};
        for (Num value : values) {
            value.i++;
            System.out.print(value + "\t");
        }
        for (Num value : values) {
            System.out.print(value + "\t");
        }
    }
}
