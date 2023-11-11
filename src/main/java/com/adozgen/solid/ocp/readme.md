# OCP

### OCP, bir sınıfın değişikliklere kapalı, ancak yeni özelliklerin eklenmesine açık olması gerektiğini ifade eder. Yani, mevcut kodun değiştirilmeden yeni özelliklerin eklenmesi gerektiğini söyler.

# Örnek 1:

* İlk halinde(bad) indirim tipine göre ürünün fiyatında değişiklik yapılmaktadır. Daha sonra yeni 
indirim tipi geldiğinde DiscountService sınıfında değişiklik yapma zorunluluğu doğuyor, bu durumda OCP yi ihlal etmiş oluyoruz. 

* İkinci halinde(good) her tanımlanan yada tanımlanacak indirim tipi kendi içerisinde ürün fiyatını belirleyeceği hale getiriyoruz. 
* DiscountService sınıfımızı artık hangi tip gelirse gelsin çalışacak hale getirerek dinamikleştiriyoruz. 

* Yeni bir inidirim tipi gelirse bununda fiyat hesaplamasını bu tipe özgü yapacak şekilde sınıf oluşturmamız yeteerli olacaktır. Dolayısıyla mevcut yazılmış sınıflarda herhangi bir 
değişikliğe ihtiyaç duymuyoruz ek bu tip için geliştirme yaparak sorunu çözüyoruz. 


# Örnek 2:

* İkinci örneğimizin ilk hali(bad) PaymentService sınıfımız gelen ödeme tipine göre ödeme yapıyor. Bu koda sonra yeni ödeme yöntemleri geldiği durumda müdaheleden başka çaremiz kalmıyor.
Bu da OCP yi ihlal ediyor. (Örnek nakit ödeme tipi de istenirse PaymentService gidip yeni bi else if koşuluna ihtiyaç duyarız.)
* Bu durumu OCP ye uygun hale getirmek için her ödeme tipi kendi ödemesinden sorumlu olacak şekilde değiştiriyoruz. PaymentService sınıfı artık hangi tip ödeme yöntemi geldiğine bakmıyor.
Bu sınıf içerisine gelen kendi ödemesini yapıyor.
* Yarın nakit olarakta ödemeyi desteklemesini istersek; sınıfta değişiklik yapmadan CashPayment sınıfı tanımlayıp IPaymentMethod unu implemente ederek kendi ödemesini yaptırırız.