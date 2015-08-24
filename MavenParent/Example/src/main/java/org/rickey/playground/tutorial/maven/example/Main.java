package org.rickey.playground.tutorial.maven.example;

import org.rickey.playground.tutorial.maven.datamodel.Patient;
/**
 * Created by mhchowd1 on 8/23/2015.
 */
public class Main {

    public static void main(String[] args){

   Patient patient = new Patient();

   patient.setName("Rickey");
   patient.setAge(28);
   patient.setId(1206566500);

    System.out.println(patient.getName() + " " + patient.getId() + " " + patient.getAge());
    }
}
