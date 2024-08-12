
  Feature: US1005 kullanici gecersiz datalarla sisteme girirs yapamaz

    Scenario: TC11 gecersiz email ile sisteme giris yapilamaz

      Given kullanici toUrl adresine gider
      Then account butonuna basar
      And email olarak {toGecersizEmail} girer
      And password olarak {toGecerliPassword} girer
      When signIn butonuna basar
      Then sisteme giris yapilamadigini test eder
      And sayfayi kapatir


      Given kullanici toUrl adresine gider
      Then account butonuna basar
      And email olarak {toGecersizEmail} girer
      And password olarak {toGecerliPassword} girer
      When signIn butonuna basar
      Then sisteme giris yapilamadigini test eder
      And sayfayi kapatir
