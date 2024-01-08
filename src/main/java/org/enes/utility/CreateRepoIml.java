package org.enes.utility;

import org.enes.entity.Brans;
import org.enes.entity.Doktor;
import org.enes.entity.Hasta;
import org.enes.entity.Randevu;
import org.enes.repository.BransRepository;
import org.enes.repository.DoktorRepository;
import org.enes.repository.HastaRepository;
import org.enes.repository.RandevuRepository;
import org.enes.utility.enums.ECinsiyet;

import java.util.Random;

public class CreateRepoIml {
    DoktorRepository dr;
    HastaRepository hr;
    RandevuRepository rr;
    BransRepository br;

    public CreateRepoIml() {
        dr=new DoktorRepository();
        hr=new HastaRepository();
        rr=new RandevuRepository();
        br=new BransRepository();
    }

    public void createDoktor(){
        Doktor doktor=Doktor.builder().ad("Ahmet").bransId(4L).unvan("Doçent").build();
        dr.save(doktor);

        Doktor doktor1=Doktor.builder().ad("Yeliz").bransId(1L).unvan("Profesör").build();
        dr.save(doktor1);

        Doktor doktor2=Doktor.builder().ad("Mehmet").bransId(2L).unvan("Doçent").build();
        dr.save(doktor2);

        Doktor doktor3=Doktor.builder().ad("Ayşe").bransId(3L).unvan("Profesör").build();
        dr.save(doktor3);

        Doktor doktor4=Doktor.builder().ad("Berk").bransId(5L).unvan("Doçent").build();
        dr.save(doktor4);

        Doktor doktor5=Doktor.builder().ad("Cansu").bransId(6L).unvan("Profesör").build();
        dr.save(doktor5);

        Doktor doktor6=Doktor.builder().ad("Cemile").bransId(7L).unvan("Doçent").build();
        dr.save(doktor6);

        Doktor doktor7=Doktor.builder().ad("Hidayet").bransId(8L).unvan("Profesör").build();
        dr.save(doktor7);

        Doktor doktor8=Doktor.builder().ad("Enes").bransId(9L).unvan("Doçent").build();
        dr.save(doktor8);

        Doktor doktor9=Doktor.builder().ad("Turabi").bransId(10L).unvan("Doçent").build();
        dr.save(doktor9);

    }

    public void createBrans(){

        Brans brans = Brans.builder().ad("Diş").build();
        br.save(brans);
        Brans brans1 = Brans.builder().ad("Genel Cerrahi").build();
        br.save(brans1);
        Brans brans2 = Brans.builder().ad("İç Hastalıkları").build();
        br.save(brans2);
        Brans brans3 = Brans.builder().ad("Nöroloji").build();
        br.save(brans3);
        Brans brans4 = Brans.builder().ad("Ortopedi").build();
        br.save(brans4);
        Brans brans5 = Brans.builder().ad("Travmoloji").build();
        br.save(brans5);
        Brans brans6 = Brans.builder().ad("Psikiyatri").build();
        br.save(brans6);
        Brans brans7 = Brans.builder().ad("Göz").build();
        br.save(brans7);
        Brans brans8 = Brans.builder().ad("Kulak Burun Boğaz").build();
        br.save(brans8);
        Brans brans9 = Brans.builder().ad("Dermatoloji").build();
        br.save(brans9);

    }

    public void createHasta(){

        Hasta hasta = Hasta.builder().ad("Enes").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta);

        Hasta hasta1 = Hasta.builder().ad("Ahmet").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta1);

        Hasta hasta2 = Hasta.builder().ad("Mehmet").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta2);

        Hasta hasta3 = Hasta.builder().ad("Hüseyin").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta3);

        Hasta hasta4 = Hasta.builder().ad("Hasan").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta4);

        Hasta hasta5 = Hasta.builder().ad("Can").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta5);

        Hasta hasta6 = Hasta.builder().ad("Berk").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta6);

        Hasta hasta7 = Hasta.builder().ad("Hasbi").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta7);

        Hasta hasta8 = Hasta.builder().ad("Muhammet").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta8);

        Hasta hasta9 = Hasta.builder().ad("Ekrem").yas(26).cinsiyet(ECinsiyet.ERKEK).build();
        hr.save(hasta9);

        Hasta hasta10 = Hasta.builder().ad("Ayşe").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta10);

        Hasta hasta11 = Hasta.builder().ad("Fatma").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta11);

        Hasta hasta12 = Hasta.builder().ad("Aysel").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta12);

        Hasta hasta13 = Hasta.builder().ad("Ayfer").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta13);

        Hasta hasta14 = Hasta.builder().ad("Reyyan").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta14);

        Hasta hasta15 = Hasta.builder().ad("Tuğba").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta15);

        Hasta hasta16 = Hasta.builder().ad("Emine").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta16);

        Hasta hasta17 = Hasta.builder().ad("Gül").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta17);

        Hasta hasta18 = Hasta.builder().ad("Gonca").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta18);

        Hasta hasta19 = Hasta.builder().ad("Açelya").yas(26).cinsiyet(ECinsiyet.KADIN).build();
        hr.save(hasta19);
    }

    public void createRandevu(){

        Random random=new Random();
        for (int i=0; i<100;i++){
            rr.save(Randevu.builder().doktorId(random.nextLong(1,11)).
                    hastaId(random.nextLong(1,21)).
                    tarih(random.nextLong(1,366)).
                    zaman(random.nextLong(8,18)).build());
        }


    }

}
