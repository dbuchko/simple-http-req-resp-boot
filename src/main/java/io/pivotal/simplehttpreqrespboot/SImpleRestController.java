package io.pivotal.simplehttpreqrespboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SImpleRestController {

    @GetMapping("/")
    public ResponseEntity<String> defaultEndpoint(@RequestHeader(value = "vcap_request_id", required = false) String req_id) {

        long t1 = System.nanoTime();

        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }

        long t2 = System.nanoTime();
        long latency = t2 - t1;
        System.out.println("App processing time for vcap_req_id=" + req_id + " is " + String.valueOf(latency) + " nanoseconds");
        return new ResponseEntity<String>(String.format("{\"latency_in_ns\": \"%d\"}", latency), HttpStatus.OK);
    }

}
