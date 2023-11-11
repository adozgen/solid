# İSP

### İSP, temel olarak, çok geniş arayüzler yerine daha özelleşmiş, dar arayüzler kullanılmalıdır. 
### Yani, interfaceleri implemente eden sınıf bu arayüze ait tüm sözleşmeleri sağlamak zorundadır. Arayüz geniş tanımlanırsa bu sınıfın ihtiyacı olmayan şeylerle başbaşa bırakırız.


# Örnek 1:

* İlk halinde(bad) DocumentProcessor arayüzümüz 3 method barındırmaktadır. Bunu implement eden sınıfımız bu 3 methodu da gerçeklemek zorundadır.
* Örnekte de gözüktüğü üzere translateDocument methoduna ihtiyacı yoktur. Dolayısıyla İSP prensibini bozmuş olduk.
* Çözüm olarak her methodu ayrı interface olarak tanımladık ve sınıfımız neye ihtiyacı varsa onu implemente edip kullanabilir.
# Örnek 2:

* İkinci örneğimizin ilk hali(bad) SmartDevice interface yi fazla method barındırmaktadır. 
* SmartLigth sınıfımızı ihtiyacı olmayan methodları gerçeklemek zorunda bırakıyoruz.
* İnterfaceleri olabildiğince minimal tutarak ihtiyaç duyulan methodlar ilgili interface ler üzerinden gerçekleyebiliriz.