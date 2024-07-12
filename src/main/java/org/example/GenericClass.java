package org.example;

public class GenericClass<T> {
    private T value ;

    public GenericClass(T value){
    this.value = value;
    }

    public void PrintValue(){
        System.out.println(value);
    }

    public static void main(String[] args){
        GenericClass<Integer> integerInstance = new GenericClass<>(123456);
        GenericClass<String> stringInstance = new GenericClass<>("Bu bir deneme testidir.");

        integerInstance.PrintValue();
        stringInstance.PrintValue();

    }
}
