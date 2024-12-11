package Core.Topic_7_OOPS.practiceQuestions;



public class tollBothProblem {
    public static class TollBooth {
        int totalVehicle;
        double AmountCollected;

        public TollBooth() {
            totalVehicle = 0;
            AmountCollected = 0.0;
        }

        public void recordVehicle(double tollAmount) {
            totalVehicle++;
            AmountCollected = AmountCollected + tollAmount;
        }

        public void displayData() {
            System.out.println(totalVehicle);
            System.out.println(AmountCollected);
        }
    }
        public static void main(String[] args) {
            TollBooth booth = new TollBooth();
            booth.recordVehicle(30.7);
            booth.recordVehicle(9.3);
            booth.recordVehicle(65.8);
            booth.displayData();
        }
}
