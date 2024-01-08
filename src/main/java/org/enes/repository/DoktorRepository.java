package org.enes.repository;

import org.enes.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long>{

    public DoktorRepository() {
        super(new Doktor());
    }
}
