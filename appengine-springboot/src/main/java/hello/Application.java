package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  // Define the log object for this class

  private final Logger log = LoggerFactory.getLogger(this.getClass());

  @RequestMapping("/")
  public String home() {
    // Log a simple message
    log.debug("debug level log");
    log.info("info level log");
    log.error("error level log");

    // Log a formatted string with parameters
    log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);
    return "Hello SpringBoot on App Engine";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
