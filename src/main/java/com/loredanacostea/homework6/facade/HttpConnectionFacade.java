package com.loredanacostea.homework6.facade;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class HttpConnectionFacade {

    private HttpConnectionHandler httpConnectionHandler;

    public HttpConnectionFacade(String url) throws IOException {
        this.httpConnectionHandler = new HttpConnectionHandler(new URL(url));
    }

    public String doPost(String body) throws IOException {
        HttpURLConnection httpURLConnection = httpConnectionHandler.createConnection();
        Optional<String> response = httpConnectionHandler.sendBody(httpURLConnection, "POST", body);
        return response.orElseThrow();
    }
}
