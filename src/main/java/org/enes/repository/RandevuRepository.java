package org.enes.repository;

import org.enes.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long>{
    public RandevuRepository() {
        super(new Randevu());
    }
}
