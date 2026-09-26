# VP_Week2

repo ini isinya tugas visual programming week 2. aplikasinya punya dua tampilan (soal 1 sama soal 2). karena dua soal ini pake mainactivity yang terpisah di foldernya masing-masing, untuk melakukan run ke tiap soalnya, harus buka androidmanifest.xml dulu untuk milih soal mana yang mau di-run di emulator atau hp.

## cara ngerun soal 1 atau soal 2

1. buka file `app/src/main/androidmanifest.xml` 
2. cari tag `<application>`. di dalemnya ada dua blok `<activity>`, satu buat `.soal1.mainactivity` dan satunya lagi buat `.soal2.mainactivity`
3. pake sintaks comment xml `<!--` (buat buka) sama `-->` (buat nutup) di blok soal yang tidak ingin di-run
4. hapus tanda comment `<!--` dan `-->` di blok soal yang ingin di-run

**contoh if mau ngerun soal 2:**
```xml
<!-- blok soal 1 dimatiin (di-comment) -->
<!--
<activity android:name=".soal1.mainactivity" ...>
    ...
</activity>
-->

<!-- blok soal 2 dinyalain (di-uncomment) -->
<activity android:name=".soal2.mainactivity" ...>
    ...
</activity>
