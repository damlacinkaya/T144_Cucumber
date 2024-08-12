Feature: US1011 istenen durumlarda screenshot alınabilmeli
@E2E
  Scenario: TC19 Tum sayfa veya web element screenshot
    #eger test failed olursa, failed olan asamada screenshot alip rapora ekleyin

    Given kullanici "toUrl" anasayfaya gider
    When belirlenmis aranacak kelimeyi aratir
    Then arama sonucunda urun bulunabildigini test eder
    And tum sayfanin screenshotunu alir ve "aramaTesti" ismiyle kaydeder
    Then bulunan urunlerden ilkini tiklar
    And acilan sayfadaki urun isiminde case sensitive olmadan belirlenmis aranacak kelime bulundugunu test eder
    And acilan ilk urun sayfasindaki urun isminin screenshot'ini alir
