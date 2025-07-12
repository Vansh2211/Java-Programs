import java.util.*;

class GraphCities {

    private List<String> cities;
    private int[][] matrix;
    Scanner s = new Scanner(System.in);

    public GraphCities() {
        this.cities = new LinkedList<String>();
    }

    public void addCity(String name) {
        if (!cities.contains(name)) {
            cities.add(name);
        } else {
            System.out.println("City " + name + " is already added.");
        }
    }

    public void makeGraph() {
        System.out
                .println("Distance between cities, if they aren't connected insert -1");
        matrix = new int[cities.size()][cities.size()];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    System.out.println("Distance from "
                            + cities.get(i) + " to " + cities.get(j));
                    int distance = s.nextInt();
                    matrix[i][j] = distance;
                    matrix[j][i] = distance;

                }
            }
        }
    }

    public void show() {
        String show = "\t";
        for (int i = 0; i < cities.size(); i++) {
            show += cities.get(i) + "\t";
        }
        show += "\n";
        for (int i = 0; i < matrix.length; i++) {
            show += cities.get(i) + "\t";
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != -1) {
                    show += matrix[i][j] + "\t";
                } else {
                    show += "-\t";
                }
            }
            show += "\n";
        }
        System.out.println(show);
    }
}
public class Main{

    public static void main(String[] args) {
        GraphCities c = new GraphCities();
        c.addCity("A");
        c.addCity("B");
        c.addCity("C");
        c.addCity("D");
        c.addCity("E");
        c.addCity("F");
        c.addCity("G");
        c.addCity("H");
        c.addCity("I");
        c.addCity("J");
        c.makeGraph();
        System.out.println();
        c.show();
    }
}