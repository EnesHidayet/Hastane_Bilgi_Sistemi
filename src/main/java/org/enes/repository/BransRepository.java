package org.enes.repository;

import org.enes.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long>{
    public BransRepository() {
        super(new Brans());
    }
}
