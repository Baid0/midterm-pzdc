import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class Main {

    public static int averageArithmetical(int[] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 150) {
                sum += arr[i];
                count++;
            }
        }

        return sum / count;
    }


    public static double averageGeometrical(double[] arr){
        double  multiplied = 1;
        double  count = 0;
        for (int i = 0;i < arr.length; i++){
            if(arr[i] % 2 != 0){
                multiplied *= arr[i];
                count++;

            }
        }
        return Math.pow(multiplied, 1 / count);
    }



    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        int[] myMassive = {100,200,300,501,150,181,187,140};
        int average = averageArithmetical(myMassive);
        System.out.println("Average: " + average);

        double[] myMassive1 = {123,123,1,23,123};
        double mean = averageGeometrical(myMassive1);
        System.out.println("Mean: "+ mean);



        Department department1 = new Department("Marketing", 10, "John Smith");
        Department department2 = new Department("Marketing", 10, "John Smith");
        Department department3 = new Department("Finance", 5, "Jane Doe");

        System.out.println(department1); // Output: Department{name='Marketing', numOfEmployees=10, supervisorName='John Smith'}
        System.out.println(department1.equals(department2)); // Output: true
        System.out.println(department1.equals(department3)); // Output: false

        XML.generateXML();
    }


}