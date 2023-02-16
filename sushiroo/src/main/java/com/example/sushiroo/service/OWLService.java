package com.example.sushiroo.service;

import com.example.sushiroo.model.OWLEntity;
import org.semanticweb.HermiT.ReasonerFactory;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.*;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.*;

@Service
public class OWLService {
    private OWLOntologyManager man = OWLManager.createOWLOntologyManager();
    private OWLOntology o;

    private List<String> currentFilterList;

    public OWLService() throws OWLOntologyCreationException {
        //IRI pizzaontology = IRI.create("http://protege.stanford.edu/ontologies/pizza/pizza.owl");

    }



}
