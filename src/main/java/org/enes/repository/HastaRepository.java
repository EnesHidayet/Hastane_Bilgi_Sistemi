package org.enes.repository;

import org.enes.entity.Hasta;

public class HastaRepository extends RepositoryManager<Hasta,Long>{
    public HastaRepository() {
        super(new Hasta());
    }
}
