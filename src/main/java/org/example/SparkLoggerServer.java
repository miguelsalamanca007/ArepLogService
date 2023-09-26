package org.example;

import static spark.Spark.port;
import static spark.Spark.*;

public class SparkLoggerServer {

    public static void main(String... args) {
        port(getPort());
        get("logString", (req, res) -> {
            String value = req.queryParams("value");
            System.out.println("Request Has Been Received");
            return "value";
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }
}
