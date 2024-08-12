Feature: US1009 kullanici yanlis bilgilerle giris yapamaz
  Scenario Outline: TC17 kullanici liste olarak verilen gecersiz email ve password'ler ile
    giris yapilamadigini test eder

    Given kullanici toUrl adresine gider
    Then account butonuna basar
    When email olarak direkt verilen "<verilenEmail>" girer
    And password olarak direk verilen "<verilenPassword>" girer
    And signIn butonuna basar
    Then sisteme giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
    |verilenEmail|verilenPassword|
    |mustafa@gmail.com|123456    |
    |levent@hotmail.com|345678   |
    |ismail@mymail.com |3353464  |
    |damla@rmail.com   |12133    |