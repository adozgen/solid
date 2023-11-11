# LSP

### LSP, temel olarak, türetilmiş sınıfların, temel sınıfların yerine geçebilmesi gerektiğini söyler. 
### Yani, bir sınıfın türevleri, temel sınıfın sözleşmelerini bozmadan kullanılabilmelidir.

# Örnek 1:

* İlk halinde(bad) Payment sınıfını CreditCard ve Paypal miras alarak bu sınıfın sözleşmelerine uyacağını taahhüt etmiş oldu.
CreditCard sınıfı tüm sözleşmeleri sağladı ancak Paypal performPayment methoduna ihtiyacı olmadığı için hata fırlattı. Payment sınıfının sözleşmesini sağlamadı.

* Bu durumda Payment servisi ana sınıfı parametre olarak alıyor ve bu sınıfta olan performPayment methodunuda kullanıyor.
* Bu sınıfı CreditCard ile kullandığımızda sorun yok ancak Paypalı parametre olarak geçersek hata alırız. 

* Sonuç olarak; Türetilmiş sınıf olan PaypalPayment, temel sınıf olan Payment sınıfının yerine geçemedi bu durumda LSP prensibini sağlamamış oldu.

* Paypalı bozan performPayment methodunu interface olarak tanımlayıp, CreditCard ve Paypal sınıflarını ana sınıf Payment sınıfının tümz sözleşmelerini sağlayacak şekilde düzenliyoruz.


# Örnek 2:

* İkinci örneğimizin ilk hali(bad) Report sınıfının sözleşmelerini Employee ve Financial sınıflarının sağlamasını istiyoruz.
Burada da Employee sınıfı displayReport methodunu gerçeklerken hata fırlatıyor. Yine aynı şekilde Report istenen yerde Employee sınıfını veremeyeceğimiz için kod patlayacaktır. 
* Dolayısıyla LSP prensibine uymamaktadır.
* Bu sefer çözüm olarak farklı bir yöntem uygulandı. Sonuç olarak Employee ve Financial sınıfları ara bir sınıf üzerinden farklı olan methodları gerçekleyerek sözleşmeleri sağlamaktadırlar.