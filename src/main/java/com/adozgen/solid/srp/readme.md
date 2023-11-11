# SRP

### Bir sınıfın veya methodun sadece bir nedenle değişikliğe uğraması gerektiğini belirtir. Basitçe, bir sınıfın veya methodun sadece bir işi yapması gerektiğini söyler. Şimdi Java Spring Boot ile ilgili örneklerle bu ilkeyi ele alalım.

# Örnek 1:

* OrderService hem sipariş oluşturma, hem ödeme işlemleri, hem de stok yönetimi işlevlerinden sorumludur.
* Bu işlevleri farklı sınıflara bölerek SRP prensibini uyguladık ve sorunu çözdük.


# Örnek 2:

* ReportService farklı türlerde rapor oluşturma işlevlerinden sorumludur. Rapor türleri eklendikçe bu sınıf genişler ve karmaşıklaşır.


### SRP uygulamaya başka bir örnek daha vermek gerekirse istemciden gelen form verilerinin validasyon işlemlerini controller içinde değilde harici bir sınıfta yaparız.
### Böylelikle ilerde validasyonla ilgili bir sıkıntı yaşarsak ya da ekleme-çıkarma yapacağımız zaman sadece burasıyla ilgileniriz.

