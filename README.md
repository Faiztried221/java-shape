# 📐 Shape Hierarchy - OOP Inheritance & Polymorphism (Java)

Program Java sederhana yang mengimplementasikan konsep dasar **Object-Oriented Programming (OOP)**, khususnya **Inheritance (Pewarisan)** dan **Polymorphism (Method Overriding)**, untuk menghitung luas dan volume berbagai bentuk geometri dua dimensi dan tiga dimensi.

---

## 📌 Konsep OOP yang Diterapkan

1. **Inheritance (Pewarisan)**:
   * `Bentuk` merupakan *Superclass* (Parent Class) utama yang menyimpan atribut umum seperti `warna`[cite: 4].
   * `BujurSangkar` dan `Lingkaran` mewarisi properti dari `Bentuk`[cite: 5, 6].
   * `Silinder` mewarisi properti dari `Lingkaran` (*Multi-level Inheritance*)[cite: 3].

2. **Polymorphism & Method Overriding**:
   * Method `print()` dari class `Bentuk` di-override oleh setiap subclass (`BujurSangkar`, `Lingkaran`, `Silinder`) untuk memberikan output cetak yang spesifik[cite: 3, 4, 5, 6].

3. **Encapsulation**:
   * Menggunakan akses modifier `private` dan `protected` untuk melindungi data/variabel internal serta menyediakan method *getter* dan *setter*[cite: 3, 4, 5, 6].

---

## 🛠️ Hierarki Class

```text
       [ Bentuk ]  (Superclass)
        /      \
       /        \
[ BujurSangkar ] [ Lingkaran ]
                      |
                 [ Silinder ]

## 💻 Output Program

Berikut adalah tampilan hasil saat program dijalankan:

<img width="1920" height="1200" alt="image" src="https://github.com/user-attachments/assets/5dfba6c1-eec5-4059-a5cb-db6265bd0894" />
