package com.company.serilize;

import java.io.*;

public class SerializableExm {
    public static void main(String[] args) throws Exception {

        OutputStream outputStream = new FileOutputStream("person.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(new Person("Jonson", 19));

        InputStream inputStream = new FileInputStream("person.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Person object = (Person) objectInputStream.readObject();
//        Person object2 = (Person) objectInputStream.readObject();
        System.out.println(object.clone());
//        System.out.println(object2);
    }
}
