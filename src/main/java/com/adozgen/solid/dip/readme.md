# DİP

### DİP, yüksek seviyeli sınıfların düşük seviyeli sınıflara doğrudan bağımlı olmamasını, her ikisinin de soyutlamalara bağlı olması gerektiğini söyler.
### Yüksek seviyeli sınıf iş mantığını veya sistem davranışını kapsar. Düşük seviyeli sınıf ise daha spesifik, ayrıntılı ve somut görevlerle ilgilenir.


# Örnek 1:

* İlk halinde(bad) ElectricPowerSwitch sınıfı LightBulb sınıfına sıkı sıkıya bağlıdır. İş yapması için ona ihtiyaç duyar ve onun üzerinden yapar.
* Çözüm olarak bu sınıfa somut bir sınıf geçmek yerine interface geçerek bağımlılığını soyut hale getirdik.
* ElectricPowerSwitch rtık bu interface implement eden her sınıfı kullanabilir. 
# Örnek 2:

* İkinci örneğimizin ilk hali(bad) OderrService yüksek seviyeli sınıfımız MysqlDatabase sıkı sıkıya bağımlıdır. Görevini sadece mysql ile gerçekleştirebilir. 
* Yarın postgresql e ihtiyaç duyup bu işi onunla yapmak istesek yapamayız. Amacımız bu somut ilişkiyi sonlandırmak.
* Çözüm olarak OrderService sınıfını bu bağımlılıktan kurtararak her sınıfla çalışabilecek hale getiriyoruz.