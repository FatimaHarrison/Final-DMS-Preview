//Package location
package DBHelper;

import java.util.ArrayList;

/**
 * The {@code DBTest} class provides a simple test harness for verifying
 * connectivity to the embedded SQLite database and retrieving data from
 * the {@code Reservation} table.
 * <p>
 * This class is intended for quick validation of:
 * <ul>
 *   <li>Successful database connection via {@link DBHelper}</li>
 *   <li>Execution of a basic {@code SELECT * FROM Reservation} query</li>
 *   <li>Printing of retrieved rows to the console</li>
 *   <li>Error handling when the connection or query fails</li>
 * </ul>
 * It is primarily used during development to confirm that the database
 * resource is correctly embedded and accessible.
 */
//Primary class
public class DBTest {

    /**
     * Entry point for running the database connectivity test.
     * <p>
     * This method:
     * <ol>
     *   <li>Instantiates a {@link Reservation} object</li>
     *   <li>Executes a {@code select} query to retrieve all rows</li>
     *   <li>Prints the results to the console</li>
     *   <li>Reports whether the table is empty</li>
     *   <li>Catches and prints any exceptions encountered</li>
     * </ol>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            Reservation reservation = new Reservation();
            ArrayList<ArrayList<Object>> results = reservation.select(null, null, null, null, null);
           //Notify user od connect was successful or not
            System.out.println("Connected to embedded DB.");
            System.out.println("Reservation table contents:");
            //Prints out each row in the array list
            for (ArrayList<Object> row : results) {
                System.out.println(row);
            }
            //Notify user when the table is empty nothing is found.
            if (results.isEmpty()) {
                System.out.println("No data found in Reservation table.");
            }
//Notify user that nothing was found.
        } catch (Exception e) {
            System.out.println("DB connection or query failed:");
            e.printStackTrace();
        }
    }
}
