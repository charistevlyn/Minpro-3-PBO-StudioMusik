# Graziella’s Music Studio 
### Charist Evlyn Myscha Rerung_2509116102

## Deskripsi Program
Sistem Manajemen Studio Musik merupakan program berbasis bahasa pemrograman Java yang digunakan untuk mengelola data studio musik secara sederhana. Program ini dibuat untuk membantu pengguna dalam mengelola data studio, pelanggan, dan booking studio. Program ini menerapkan operasi CRUD untuk menambah, menampilkan, mengubah, dan menghapus data yang tersimpan.
Program yang dibuat merupakan Sistem Manajemen Studio Musik yang digunakan untuk mengelola data studio, pelanggan, dan booking studio. Program ini dibuat untuk membantu proses pencatatan data studio yang tersedia, data pelanggan, serta jadwal booking yang dilakukan oleh pelanggan.
## Struktur Package
Pada program ini, menggunakan struktur package yang terdiri dari model, view, controller dan studiomusik. Pembagian package ini digunakan agar setiap bagian program memiliki tugasnya masing masing dan kode menjadi lebih teratur.
#### 1. Package model
package model ini digunakan untuk menyimpan class yang berhubungan dengan data dan objek dalam program.
Class yang terdapat pada package ini yaitu:
- Studio.java
- Pelanggan.java
- PelangganUmum.java
- PelangganMember.java
- Booking.java
- CRUD.java\
Class pelanggan disini diggunakan sebagai abstract claas yang menjadi induk dari class PelangganUmum dan PelangganMember.
#### 2. Package view
package ini digunakan untuk mengatur bagian tampilan dan input dari pengguna. Di dalam package ini terdapat MenuView.java.\
Class ini digunakan untuk menampilkan menu utama dan menerima input dari pengguna. Selain itu, class ini juga memiliki beberapa method untuk menerima input berupa teks, angka, dan angka desimal.\
Jadi, bagian view lebih berfokus pada interaksi antara program dengan pengguna, sedangkan proses pengolahan datanya dilakukan oleh bagian controller.
#### 3. Package controller
Package controller digunakan untuk mengatur jalannya program dan proses pengolahan data.
Di dalamnya terdapat StudioController.java. Class ini mengatur proses seperti menambah data, menampilkan data, mengubah data, menghapus data, menambah pelanggan, dan membuat booking. StudioController juga mengatur ArrayList yang digunakan untuk menyimpan data studio, pelanggan, dan booking.\
Controller juga menghubungkan bagian model dengan view. Input yang diberikan melalui MenuView akan diproses oleh StudioController, kemudian hasilnya ditampilkan kembali kepada pengguna.
#### 4. Package studiomusik
Package studiomusik digunakan sebagai tempat class utama program.
Di dalam package ini terdapat Main.java. Class tersebut berisi method main() yang digunakan untuk menjalankan program. Main membuat objek dari StudioController, kemudian memanggil method jalankanProgram() untuk memulai program.
## Alur Program
1. Tampilan Menu Utama
   
   <img width="364" height="260" alt="image" src="https://github.com/user-attachments/assets/2f8ab8bb-5b26-47e3-9428-986d9528fd68" />
   
   Pada bagian ini ditampilkan tampilan awal program atau menu utama. Menu utama berisi beberapa pilihan yang dapat digunakan untuk mengelola data studio musik, yaitu menambah, melihat, mengubah, dan menghapus data studio, menambah dan melihat data pelanggan, menambah dan melihat data booking, serta menu untuk keluar dari program.

2. Tambah Data Studio

   <img width="329" height="176" alt="image" src="https://github.com/user-attachments/assets/84587ca4-2c5d-4f9a-911a-d1e471205b90" />

   Setelah memilih menu tambah data studio, pengguna akan diminta untuk memasukkan data studio berupa ID studio, nama studio, jenis studio, dan harga sewa per jam. Data yang telah dimasukkan kemudian disimpan ke dalam ArrayList dan dapat ditampilkan kembali melalui menu lihat data studio.

3. Lihat Data Studio

   <img width="333" height="257" alt="image" src="https://github.com/user-attachments/assets/720b4d41-bf03-423e-81da-831ee21594d6" />

      Pada menu lihat data studio, program akan menampilkan seluruh data studio yang sebelumnya telah ditambahkan. Data ditampilkan menggunakan perulangan sehingga setiap data studio yang tersimpan di dalam ArrayList dapat ditampilkan.

4. Ubah Data Studio

   <img width="318" height="176" alt="image" src="https://github.com/user-attachments/assets/2a6673ec-e477-4f03-ae16-eff6513d2cd5" />

   Pada menu ubah data studio, pengguna memasukkan ID studio yang ingin diubah. Jika ID studio ditemukan, pengguna dapat memasukkan data baru berupa nama studio, jenis studio, dan harga sewa per jam. Setelah itu, data studio akan diperbarui sesuai dengan input yang diberikan.

5. Hapus Data Studio

   <img width="269" height="100" alt="image" src="https://github.com/user-attachments/assets/5681be88-c6d0-4e88-8479-1162bb979840" />

   Pada menu hapus data studio, pengguna memasukkan ID studio yang ingin dihapus. Program akan mencari data berdasarkan ID tersebut. Jika data ditemukan, data studio akan dihapus dari ArrayList dan program akan menampilkan pemberitahuan bahwa data berhasil dihapus.

6. Tambah Data Pelanggan

   <img width="348" height="260" alt="image" src="https://github.com/user-attachments/assets/a4f1d670-dca6-425c-b74e-0c02e654cded" />

   Pada gambar tersebut, saya menambahkan data pelanggan baru dengan memilih Pelanggan Umum. Setelah ID, nama, nomor telepon, dan alamat dimasukkan, program menampilkan pilihan jenis pelanggan dan data berhasil ditambahkan setelah memilih opsi 1.

7. Lihat Data Pelanggan

   <img width="395" height="407" alt="image" src="https://github.com/user-attachments/assets/381ac826-b9fa-4197-93a0-af7fed2716ac" />

   Pada gambar tersebut, menu Lihat Data Pelanggan menampilkan seluruh data pelanggan yang tersimpan, yaitu pelanggan umum dan pelanggan member. Bagian Jenis menunjukkan hasil polymorphism dari method getInfo(), di mana pelanggan umum dan pelanggan member menampilkan informasi yang berbeda sesuai dengan jenis pelanggannya.

8. Tambah Booking

   <img width="258" height="150" alt="image" src="https://github.com/user-attachments/assets/66b5ec8a-3367-415f-b18a-fae43aeb2eaa" />

   Pada gambar tersebut, saya mencoba menambahkan data booking dengan memasukkan ID booking, ID pelanggan, dan ID studio. Namun, program menampilkan pesan “Studio tidak ditemukan!” karena ID studio 001 yang dimasukkan tidak sesuai dengan ID studio yang tersedia di dalam data.

9. Lihat Booking

    <img width="243" height="208" alt="image" src="https://github.com/user-attachments/assets/18214f01-20d3-40e5-b434-9cbc9666503d" />

    Pada gambar tersebut, menu Lihat Data Booking menampilkan data booking yang sudah tersimpan, mulai dari ID booking, ID pelanggan, ID studio, tanggal, jam, hingga durasi booking. Data tersebut menunjukkan bahwa booking BK001 dilakukan oleh pelanggan PL001 untuk studio ST001 selama 2 jam.

10. Keluar

    <img width="400" height="98" alt="image" src="https://github.com/user-attachments/assets/e3f9ffa3-66ef-4d0d-8626-0e17d485e583" />

    Menu ini digunakan untuk menghentikan program. Jika pengguna memilih menu 9, program akan menampilkan pesan bahwa program selesai dan perulangan menu akan dihentikan.
## Encapsulation
Encapsulation merupakan konsep OOP yang digunakan untuk membatasi akses langsung terhadap data di dalam class. Pada program saya, encapsulation digunakan agar atribut tidak dapat diakses langsung dari luar class. Atribut dibuat private, kemudian untuk mengambil atau mengubah nilainya digunakan getter dan setter.\
<img width="226" height="150" alt="image" src="https://github.com/user-attachments/assets/df7472dc-49c7-45fb-935b-d108f2297b45" />\
Pada gambar tersebut, saya membuat atribut idStudio, namaStudio, jenisStudio, dan hargaPerJam dengan access modifier private. Hal ini digunakan untuk membatasi akses langsung terhadap data yang ada pada class Studio.\
<img width="226" height="170" alt="image" src="https://github.com/user-attachments/assets/ec7956d8-ed7c-4446-b504-df08426fd757" />\
bisa dilihat pada gambar ini, saya menggunakan getIdStudio() sebagai getter untuk mengambil nilai idStudio, sedangkan setIdStudio() digunakan sebagai setter untuk mengubah nilai idStudio. Getter dan setter ini menjadi perantara untuk mengakses atribut yang sebelumnya dibuat private.
## Inheritance
Penerapan inheritance pada program dilakukan dengan menggunakan extends pada class PelangganUmum dan PelangganMember. Kedua class tersebut mewarisi atribut dan method yang terdapat pada class Pelanggan. Pada PelangganMember juga terdapat atribut tambahan berupa jenisMember karena pelanggan member memiliki informasi tambahan yang tidak dimiliki pelanggan umum. Dengan inheritance ini, saya tidak perlu membuat ulang atribut dasar pelanggan pada setiap class karena sudah dapat diwariskan dari class Pelanggan.

1. Pelanggan umum
   
  <img width="1010" height="89" alt="image" src="https://github.com/user-attachments/assets/8cda92a5-6a23-4189-b06a-d3c75ee0d5c4" />

   Pada kode tersebut, PelangganUmum merupakan subclass dari Pelanggan yang menggunakan extends untuk mewarisi atribut dan method dari class Pelanggan. Kemudian super() digunakan untuk memanggil constructor dari class induk dan mengisi data pelanggan seperti ID, nama, nomor telepon, dan alamat.

2. Pelanggan Member
   
   <img width="500" height="150" alt="image" src="https://github.com/user-attachments/assets/45ec2fb5-099a-4e39-87b3-c543218aaf7e" />
   
Pada kode tersebut, PelangganMember merupakan subclass dari Pelanggan yang mewarisi data dari class induknya. Class ini memiliki atribut tambahan jenisMember untuk menyimpan jenis member pelanggan. super() digunakan untuk memanggil constructor Pelanggan, sedangkan getJenisMember() dan setJenisMember() digunakan untuk mengambil dan mengubah nilai jenisMember
## Polymorphism
Polymorphism merupakan konsep OOP yang memungkinkan satu method memiliki bentuk atau hasil yang berbeda tergantung dari class yang menggunakannya. Pada program saya, polymorphism diterapkan dalam dua bentuk, yaitu overriding dan overloading.
#### 1. Overriding
adalah ketika method dari class induk dibuat kembali di class turunan dengan nama dan parameter yang sama, tetapi isi atau hasilnya dapat berbeda.
Pada program saya, overriding terdapat pada class PelangganUmum dan PelangganMember melalui method getInfo().\
<img width="217" height="130" alt="image" src="https://github.com/user-attachments/assets/716dcccc-6722-4179-9e82-1df6e1e80158" />\
Pada gambar ini, saya menerapkan overriding pada method getInfo(). Method tersebut dibuat kembali pada class PelangganUmum dengan menggunakan @Override. Isi method disesuaikan untuk menampilkan informasi pelanggan umum.
#### 2. Overloading
Overloading adalah ketika terdapat beberapa method dengan nama yang sama, tetapi memiliki parameter yang berbeda. Pada program saya, overloading diterapkan pada method getInfo(), yaitu getInfo() tanpa parameter dan getInfo(String tambahan) dengan satu parameter.\
<img width="298" height="100" alt="image" src="https://github.com/user-attachments/assets/d78a13f7-0e58-4fd2-93e2-491f918cc08b" />\
Pada gambar ini, saya menerapkan overloading pada method getInfo(). Terdapat dua method dengan nama yang sama, tetapi memiliki parameter yang berbeda. Method pertama tidak memiliki parameter, sedangkan method kedua memiliki parameter String tambahan.
## Abstraction
Abstraction merupakan konsep OOP yang digunakan untuk membuat class dan method sebagai dasar bagi class turunannya. Pada program saya, abstraction diterapkan pada class Pelanggan yang dibuat sebagai abstract class dan method getInfo() yang dibuat sebagai abstract method. Method tersebut kemudian diterapkan kembali pada class PelangganUmum dan PelangganMember.\
<img width="413" height="62" alt="image" src="https://github.com/user-attachments/assets/6f0274c5-1466-440d-92eb-8308b4b94dc0" />\
<img width="399" height="27" alt="image" src="https://github.com/user-attachments/assets/35b8c760-3fa3-4952-80a6-4f45b7436aa0" />\
ini saya telah menerapkan abstraction dengan membuat class Pelanggan sebagai abstract class. Selain itu, method getInfo() dibuat sebagai abstract method yang nantinya harus diimplementasikan oleh class turunannya, yaitu PelangganUmum dan PelangganMember.
## Interface
Nilai tambah yang saya terapkan pada program ini adalah penggunaan interface. Interface digunakan untuk menentukan method yang berkaitan dengan proses CRUD, yaitu tambah, lihat, ubah, dan hapus data.
Pada program saya, interface tersebut dibuat dalam class CRUD.java dan kemudian diterapkan pada StudioController menggunakan implements. Dengan adanya interface ini, method CRUD yang digunakan dalam pengelolaan data studio sudah ditentukan dan kemudian dijalankan oleh StudioController.\
<img width="226" height="138" alt="image" src="https://github.com/user-attachments/assets/20d52e32-aaff-4506-b9c0-d4d3c2805811" />\
disini terlihat saya menerapkan interface dengan membuat CRUD sebagai interface. Di dalamnya terdapat method tambah(), lihat(), ubah(), dan hapus() yang digunakan sebagai aturan untuk proses CRUD pada program. Interface ini kemudian diterapkan pada StudioController untuk menjalankan method tersebut.










   
