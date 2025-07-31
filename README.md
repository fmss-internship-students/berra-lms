# Kütüphane Otomasyon Sistemi
- Bu proje, temel Java bilgilerini kullanarak basit bir kütüphane otomasyon sistemi geliştirmeyi amaçlamaktadır.
- Proje, kullanıcıdan kitap bilgilerini alacak, bunları saklayacak ve belirli sorgulara göre listeleyecektir.

## Özellikler
- **Kitap Ekleme:** Kullanıcıdan kitap adı, yazar ve sayfa sayısı bilgilerini alarak sisteme yeni kitaplar ekleyin.
  
- **Kitapları Listeleme:** Sisteme eklenmiş tüm kitapları listeleyin.
  
- **Belirli Bir Yazara Ait Kitapları Listeleme:** Kullanıcının girdiği bir yazara ait tüm kitapları listeleyin.

- **Toplam Kitap Sayısı:** Sistemde kayıtlı toplam kitap sayısını gösterin.

## Kullanılan Konular
- Değişkenler
- Scanner Sınıfı
- Koşullu İfadeler (if/else)
- Döngüler (for veya while)
- Tek Boyutlu Diziler (Kitap bilgilerini saklamak için)

## Örnek Girdi ve Çıktı
- Senaryo 1: Kitap Ekleme ve Listeleme
### Girdi:
```
1 (Kitap Ekle)
Kitap Adı: Sefiller
Yazar: Victor Hugo
Sayfa Sayısı: 1200
1 (Kitap Ekle)
Kitap Adı: Suç ve Ceza
Yazar: Fyodor Dostoyevski
Sayfa Sayısı: 650
2 (Kitapları Listele)
5 (Çıkış)
``` 

### Beklenen Çıktı:
```
--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 1
Kitap Adı: Sefiller
Yazar: Victor Hugo
Sayfa Sayısı: 1200
Kitap başarıyla eklendi!

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 1
Kitap Adı: Suç ve Ceza
Yazar: Fyodor Dostoyevski
Sayfa Sayısı: 650
Kitap başarıyla eklendi!

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 2
--- Kitap Listesi ---
1. Kitap Adı: Sefiller, Yazar: Victor Hugo, Sayfa: 1200
2. Kitap Adı: Suç ve Ceza, Yazar: Fyodor Dostoyevski, Sayfa: 650

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 5
Programdan çıkılıyor...
```

- Senaryo 2: Yazara Göre Listeleme ve Toplam Sayı
### Girdi:
```
1 (Kitap Ekle)
Kitap Adı: Sefiller
Yazar: Victor Hugo
Sayfa Sayısı: 1200
1 (Kitap Ekle)
Kitap Adı: Notre Dame'ın Kamburu
Yazar: Victor Hugo
Sayfa Sayısı: 400
1 (Kitap Ekle)
Kitap Adı: Ana
Yazar: Maksim Gorki
Sayfa Sayısı: 300
3 (Yazara Göre Kitapları Listele)
Yazar Adı: Victor Hugo
4 (Toplam Kitap Sayısı)
5 (Çıkış)
```

### Beklenen Çıktı:
```
--- Kütüphane Otomasyon Sistemi ---
... (Kitap ekleme çıktıları) ...

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 3
Yazar Adı: Victor Hugo
--- Victor Hugo'ya Ait Kitaplar ---
1. Kitap Adı: Sefiller, Sayfa: 1200
2. Kitap Adı: Notre Dame'ın Kamburu, Sayfa: 400

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 4
Toplam Kitap Sayısı: 3

--- Kütüphane Otomasyon Sistemi ---
1. Kitap Ekle
2. Kitapları Listele
3. Yazara Göre Kitapları Listele
4. Toplam Kitap Sayısı
5. Çıkış
Seçiminiz: 5
Programdan çıkılıyor...
```
