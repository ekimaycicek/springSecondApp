package springSecondApp.src.main.java.springSecondApp._workshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  // aşağıdaki değişkenlere kapsülleme yapıyor. kod kalabalığını önlüyor.Getterları yazıldı.
@Setter
@AllArgsConstructor //tüm argümanları olan ctor
@NoArgsConstructor // 0 argümanlı ctor
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;

}