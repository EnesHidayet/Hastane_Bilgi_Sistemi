package org.enes.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.enes.entity.Doktor;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;
import org.enes.repository.BransRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * doktorservice
 * adı verilen doktor kaç hasta bakmış
 * belli bir branşta görev yapan doktorlar kimlerdir.
 */
public class DoktorService {

    private EntityManagerFactory emf;
    private EntityManager em;

    public DoktorService() {
        emf= Persistence.createEntityManagerFactory("CRM");
        em=emf.createEntityManager();
    }

    public Optional<Doktor> adindanDoktorIdBul(String ad){

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Doktor> criteriaQuery = criteriaBuilder.createQuery(Doktor.class);
        Root<Doktor> root = criteriaQuery.from(Doktor.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get("ad"),ad));
        try {
            Doktor doktor= em.createQuery(criteriaQuery).getSingleResult();
            return Optional.of(doktor);
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    public List<Randevu> adaGoreDoktorKacHastayaBakmis(String ad){

        Optional<Doktor> doktor=adindanDoktorIdBul(ad);

        CriteriaBuilder builder=em.getCriteriaBuilder();
        CriteriaQuery<Randevu> criteriaQuery = builder.createQuery(Randevu.class);

        Root<Randevu> root=criteriaQuery.from(Randevu.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("doktorId"),doktor.get().getId()));
        List<Randevu> list = new ArrayList<>();
        try {
            list = em.createQuery(criteriaQuery).getResultList();
            return list;
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return list;
        }
    }

    public List<Doktor> bransaGoreDoktorlariListele(Long bransId){
        CriteriaBuilder builder=em.getCriteriaBuilder();
        CriteriaQuery<Doktor> criteriaQuery = builder.createQuery(Doktor.class);

        Root<Doktor> root=criteriaQuery.from(Doktor.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("bransId"),bransId));
        List<Doktor> list = new ArrayList<>();
        try {
            list = em.createQuery(criteriaQuery).getResultList();
            return list;
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return list;
        }
    }

}
