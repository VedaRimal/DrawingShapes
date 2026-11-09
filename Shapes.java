public class Shapes {
    public static void main(String[] args) {
        // Task 1: Draw a regular shape
        Turtle burtle = new Turtle();
        for(int i = 1; i <= 5; i++) {
            burtle.forward(100);
            burtle.right(72);
        }

        // Task 2: Draw a regular shape many times
        for(int i = 1; i <= 10; i++) {
            burtle.forward(5);
            for (int sides = 1; sides <= 5; sides++) {
               burtle.forward(100);
               burtle.right(72);
            }
            burtle.forward(5);
        }


        // Task 3: How many times does Turtle turn!
        int count = 0;
        
        for(int i = 1; i <= 10; i++) {
            burtle.forward(400);
            for (int sides = 1; sides <= 5; sides++) {
               burtle.forward(100);
               burtle.right(72);
               count++;
            }
            burtle.forward(5);
            
        }
        
        System.out.print("Burtle has turned " + count + " times");


        // Extension 1:


        // Extension 2:

    }
}
