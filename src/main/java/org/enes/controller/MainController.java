package org.enes.controller;

import org.enes.repository.BransRepository;
import org.enes.service.DoktorService;
import org.enes.service.HastaService;

import java.util.Scanner;

public class MainController {

    public void app(){

        int secim;

        do {
            System.out.println("""
                *********** HASTANE BİLGİ SİSTEMİ ***********
                1- ADI VERİLEN HASTANIN RANDEVULARINI GÖSTER
                2- HASTA HANGİ BRANŞTAN KAÇ RANDEVU ALMIŞ GÖSTER
                3- BELLİ BİR TARİH ARALIĞINDAKİ RANDEVULARI GÖSTER
                4- ADI VERİLEN DOKTOR KAÇ HASTA BAKMIŞ GÖSTER
                5- ARANAN BRANŞTA GÖREV YAPAN DOKTORLARI GÖSTER
                0- ******************* ÇIKIŞ *******************
                """);
            System.out.println("Lütfen seçim yapınız.");
            secim=new Scanner(System.in).nextInt();

            switch (secim){
                case 1:
                    System.out.println("HASTANIN ADINI GİRİNİZ.");
                    String ad=new Scanner(System.in).nextLine();
                    new HastaService().adaGoreRandevuListesi(ad).forEach(System.out::println);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("TARİH ARALIĞI İÇİN BAŞLANGIÇ DEĞERİ GİRİNİZ.");
                    Long baslangic=new Scanner(System.in).nextLong();
                    System.out.println("TARİH ARALIĞI İÇİN BİTİŞ DEĞERİ GİRİNİZ.");
                    Long bitis=new Scanner(System.in).nextLong();
                    new HastaService().tarihAraligindakiRandevular(baslangic,bitis).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("DOKTORUN ADINI GİRİNİZ.");
                    String ad1=new Scanner(System.in).nextLine();
                    System.out.println(ad1+" isimli doktor "+new DoktorService().adaGoreDoktorKacHastayaBakmis(ad1).size()+" adet hastaya bakmış");
                    break;
                case 5:
                    new BransRepository().findAll().forEach(b->{
                        System.out.println(b.getId()+" - "+b);
                    });
                    System.out.println("BRANŞ SEÇİNİZ.");
                    long brans=new Scanner(System.in).nextLong();
                    new DoktorService().bransaGoreDoktorlariListele(brans).forEach(System.out::println);
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz seçim yaptınız.");
            }
            System.out.println();
        }while (secim!=0);




    }

}
