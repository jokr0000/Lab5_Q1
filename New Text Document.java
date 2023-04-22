package com.mycompany.lab5_pb1;
// 4. Class F can't extend final class E. Delete F.
public class Lab5_pb1 {
 public static void main(String[] args) {
 // 5. new A(), new D(), and new F() should be removed.
 A[] ps = new A[3];
 ps[0] = new B();
 ps[1] = new C();
 ps[2] = new E();
 for (int i = 0; i < ps.length; i++) {
 ps[i].f1();
 ps[i].f2();
 ps[i].f3();
 System.out.println("_________________");
 }
 }
}