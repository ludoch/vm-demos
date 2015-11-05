import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res) -> "Hello Spark running on Google App Engine.");
        get("/", (req, res) -> "Hello Spark running on Google App Engine.");
    }
}
