public class BoolPattern {
    boolean A;
    boolean B;
    boolean C;
void message(){
System.out.println("Name: Sannidhi Deb");
System.out.println("Roll number: 2330044");}

    public BoolPattern() {
        this.A = false;
        this.B = false;
        this.C = false;
    }


    public void generate(int var) {
        if (var == 1) {
            System.out.println("Binary patterns for one variable:");
            System.out.println("0, 1");
        } else if (var == 2) {
            generate(2);
        } else if (var == 3) {
            generate(3);
        }
    }

 public void generate(int var, int patt) {
        if (var == 2) {
            System.out.println("Binary patterns for two variables:");
            for (int i = 0; i < patt; i++) {
                System.out.print(String.format("%2s", Integer.toBinaryString(i)).replace(' ', '0') + ", ");
                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
            }
           
        } else if (var == 3) {
            generate(3, 8);
        }
    }

   
    public void generate(int var, int patt, int totalpatt) {
        if (var == 3) {
            System.out.println("Binary patterns for three variables:");
            for (int i = 0; i < totalpatt; i++) {
                System.out.print(String.format("%3s", Integer.toBinaryString(i)).replace(' ', '0') + ", ");
if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
            }
           
        }
    }

    public static void main(String[] args) {

        BoolPattern boolPattern = new BoolPattern();
boolPattern.message();
        boolPattern.generate(1);
        boolPattern.generate(2, 4);
        boolPattern.generate(3, 4, 8);
    }
}
