package ar.edu.unlam.tallerweb1.servicios;

import com.google.maps.errors.ApiException;

import java.io.IOException;

public interface MapaService {

    String ProbandoApi() throws InterruptedException, ApiException, IOException;
}
