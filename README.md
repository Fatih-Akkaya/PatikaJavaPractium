<p dir="auto">Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır. Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus, maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.</p>
<p dir="auto">  Sınıfın Nitelikleri
  <ul>  
    <li>name : Çalışanın adı ve soyadı</li>
    <li>salary : Çalışanın maaşı</li>
    <li>workHours : Haftalık çalışma saati</li>
    <li>hireYear : İşe başlangıç yılı</li>
   </ul>
 </p>
 <p dir="auto"> Sınıfın Metotları
  <ul>
    <li>Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.</li>
    <li>tax() : Maaşa uygulanan vergiyi hesaplayacaktır.<br />
          Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.<br />
          Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.</li>
    <li>bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.</li>
    <li>raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.<br />
          Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.<br />
          Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.<br />
          Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.</li>
    <li>toString() : Çalışana ait bilgileri ekrana bastıracaktır.</li>
   </ul>
    Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız.
</p>
