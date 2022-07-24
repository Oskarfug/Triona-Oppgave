package com.example.TrionaOppg.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class UserInput {
    @Id
    @GeneratedValue
    private long id;

    private String navn;
    private String adresse;
    private String telefonNummer;
    private String fodselsdato;
    private String revNavn;
    private String tverrsumTlf;
    private String skuddar;
    
// Hvordan jeg ville skrevet en getter og setter uten lombok, en pr. linje (Tenk navn, adresse, telefonNummer osv.)
// Getter
//  public String getnavn() {
//    return navn;
//  }
//
//  // Setter
//  public void setNavn(String newNavn) {
//    this.navn = newNavn;
//  }
}
