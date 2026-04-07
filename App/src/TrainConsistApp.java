
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;
public class TrainConsistApp {
    public static void main(String[] args) {



                System.out.println("====================================");
                System.out.println("UC5 - Preserve Insertion Order of Bogies");
                System.out.println("====================================\n");

                Set<String> formation = new LinkedHashSet<>();

                formation.add("Engine");
                formation.add("Sleeper");
                formation.add("Cargo");
                formation.add("Guard");
                formation.add("Sleeper");

                System.out.println("Final Train Formation:");
                System.out.println(formation);
            }
        }