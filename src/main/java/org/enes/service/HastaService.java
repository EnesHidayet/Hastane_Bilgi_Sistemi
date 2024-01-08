package org.enes.service;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Expression;
import jakarta.persistence.criteria.Root;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * hasta Randevu Sistemi
 * -> 10+ branş
 * -> 20+ hasta
 * -> 5+ doktor
 * -> 100+ randevu
 *
 * hastaservice
 * adı verilen hastanın randevuları
 * hangi branşlarda kaç randevu almış
 * belli bir tarih aralığındaki randevuları
 *
 * doktorservice
 * adı verilen doktor kaç hasta bakmış
 * belli bir branşta görev yapan doktorlar kimlerdir.
 */
public class HastaService {
    private EntityManagerFactory emf;
    private EntityManager em;

    public HastaService() {
        emf= Persistence.createEntityManagerFactory("CRM");
        em=emf.createEntityManager();
    }

    public Optional<Hasta> adindanHastaIdBul(String ad){

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Hasta> criteriaQuery = criteriaBuilder.createQuery(Hasta.class);
        Root<Hasta> root = criteriaQuery.from(Hasta.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get("ad"),ad));
        try {
            Hasta hasta = em.createQuery(criteriaQuery).getSingleResult();
            return Optional.of(hasta);
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return Optional.empty();
        }

    }

    public List<Randevu> adaGoreRandevuListesi(String ad){

        Optional<Hasta> hasta=adindanHastaIdBul(ad);

        CriteriaBuilder builder=em.getCriteriaBuilder();
        CriteriaQuery<Randevu> criteriaQuery = builder.createQuery(Randevu.class);

        Root<Randevu> root=criteriaQuery.from(Randevu.class);
        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("hastaId"),hasta.get().getId()));
        List<Randevu> list = new ArrayList<>();
        try {
            list = em.createQuery(criteriaQuery).getResultList();
            return list;
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return list;
        }
    }

    public List<Object[]> hastaHangiBranslardanKacRandevuAlmisGoster(Long id){

       return null;
    }

    public List<Randevu> tarihAraligindakiRandevular(Long baslangic,Long bitis){
        CriteriaBuilder builder=em.getCriteriaBuilder();
        CriteriaQuery<Randevu> criteriaQuery = builder.createQuery(Randevu.class);

        Root<Randevu> root=criteriaQuery.from(Randevu.class);
        criteriaQuery.select(root).where(builder.between(root.get("tarih"), baslangic, bitis));
        List<Randevu> list = new ArrayList<>();
        try {
            list = em.createQuery(criteriaQuery).getResultList();
            return list;
        }catch (NoResultException e){
            System.out.println(e.getMessage());
            return list;
        }
    }


}
