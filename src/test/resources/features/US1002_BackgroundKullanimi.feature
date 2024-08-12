Feature: US1002 Kullanici ortak baslangic adimlarini Background olarak yazabilir



    Background:
      Given kullanici toUrl adresine gider

  Scenario: TC01 Kullanici testotomasyonu.com'da phone aratip urun bulabilmeli
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

  Scenario: TC02 Kullanici testotomasyonu.com'da dress aratip urun bulunabilmeli
    Then arama kutusuna dress yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC03 Kullanici testotomasyonu.com da nutella arattiginda urun bulamamali
    Then arama kutusuna nutella yazip aratir
    And arama sonucunda urun bulunamadigini test eder
    And sayfayi kapatir