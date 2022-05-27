package com.example.lesson04;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;

import static java.util.stream.Collectors.*;


public class MainActivity extends AppCompatActivity {

    void funcOneOne(){
        int maxNumber=999;
        int minNumber=100;
        int number=minNumber+(int)(Math.random()*((maxNumber-minNumber)+1));
        int maxDigit=number%10;

        while (number>0){
            int curDigit=number%10;
            if(curDigit>maxDigit){
                maxDigit=curDigit;
            }
            number/=10;
        }

        System.out.println("Max digit in number "+maxDigit);
    }

    void funcOneTwo(){
        int maxNumber=999;
        int minNumber=100;
        int[] numbers = new int[3];

        int firstDigit;
        int sum=0;

        for(int i=0;i<3;i++){
            int number=minNumber+(int)(Math.random()*((maxNumber-minNumber)+1));
            numbers[i]=number;
            System.out.println(number);

            firstDigit=(int)Math.floor(number/Math.pow(10,Math.floor(Math.log10(number))));
            sum+=firstDigit;
        }
        System.out.println(sum);
    }

    void funcOneThree(){
        int maxNumber=999;
        int minNumber=100;
        int number=minNumber+(int)(Math.random()*((maxNumber-minNumber)+1));

        int sum=0;

        while (number>0){
            int curDigit=number%10;
            sum+=curDigit;
            number/=10;
        }

        System.out.println(sum);
    }

    void funcTwoOne(){
       String[] listWords= generateRandomWords(10);
       int num=5;
       for(int i=0;i<listWords.length;i++){
           if((i+1)%num==0){
               System.out.println(listWords[i]);
           }
       }
    }

    public static String[] generateRandomWords(int numberOfWords){
        String[] randomString =new String[numberOfWords];

        Random random =new Random();
        for(int i=0;i<numberOfWords;i++){
            char[] word =new char[random.nextInt(8)+3];
            for(int j=0;j<word.length;j++){
                word[j]=(char)('a'+random.nextInt(26));
            }
            randomString[i]=new String(word);
            System.out.println(randomString[i]);
        }
        System.out.println("---");

        return randomString;
    }

    void funcTwoTwo(){
        String[] listWords= generateRandomWords(10);
        String longLineWords="";

        for(int i=0;i<listWords.length;i++){
            String word=listWords[i].substring(0,1).toUpperCase(Locale.ROOT)+listWords[i].substring(1,listWords[i].length());
            longLineWords+=word;
        }
        System.out.println(longLineWords);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    void funcTwoThree(){
        String[] listWords= generateRandomWords(10);

        String[] listTwo=new String[15];
        for(int i=0;i<10;i++){
            listTwo[i]=listWords[i];
        }
        listTwo[10]="abcd";
        listTwo[11]="abcde";
        listTwo[12]="abcde";
        listTwo[13]="abcd";
        listTwo[14]="abcd";

        //System.out.println(Arrays.stream(listTwo).collect(groupingBy(Function.identity(),counting())));
        Map<String,Long> repeatMap=Arrays.stream(listTwo).collect(groupingBy(Function.identity(),counting()));

        repeatMap.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEach(System.out::println);

    }

    List<Person> funcCreateListPerson(){
        List<Person> personList= new ArrayList<>();

        FullName fullName=new FullName("Vika","Bel","Ant");
        Person personOne=new Person(fullName,27,1000);

        personList.add(personOne);
        personList.add(new Person(new FullName("Anna","Nip","Iva"),28,2100));
        personList.add(new Person(new FullName("Andrey","Kol","Kik"),30,2300));
        personList.add(new Person(new FullName("Maxim","Sus","Iva"),20,1200));
        personList.add(new Person(new FullName("Denis","Wek","Koa"),30,1700));
        personList.add(new Person(new FullName("Diana","Kea","Asp"),23,1500));
        personList.add(new Person(new FullName("Nikita","Pac","Pan"),20,1100));

        return personList;
    }

    List<Employee> funcCreateListEmployee(){
        List<Employee> employeeList= new ArrayList<Employee>();

        Department department=new Department("Director",1);
        //Role role =new Role("Director",1);

        employeeList.add(new Employee(department,"Nina","Pac","Pan",27,1100));
        employeeList.add(new Employee(new Department("Bux",2),"Ekaterina","Dse","Wqw",20,1100));
        employeeList.add(new Employee(new Department("Bux",2),"Alex","Dgf","Jsd",22,1300));
        employeeList.add(new Employee(new Department("Yprav",3),"Gena","Hwe","Osd",32,1300));
        employeeList.add(new Employee(new Department("YpravRaz",3),"Denis","Lda","Pem",25,1300));


        for(Employee e:employeeList){
            System.out.println(e.department.nameDepartment+" "+e.fullName.name);
        }
        return employeeList;
    }

    void funcThreeTwoThree(){
        List<Person> personList= funcCreateListPerson();

        int min=personList.get(0).age;
        int max=personList.get(1).age;

        for(Person p :personList){
            if(p.age<min){
                min = p.age;
            }
            if(p.age>max){
                max = p.age;
            }
        }

        for(Person p:personList){
            if(p.age==min){
                System.out.println(p.fullName.name+" "+p.age);
            }
            if(p.age==max){
                System.out.println(p.fullName.name+" "+p.age);
            }
        }
    }

    void funcThreeFour(){
        List<Person> personList= funcCreateListPerson();
        int allWage=0;

        for(Person p:personList){
            allWage+=p.wage;
        }
        System.out.println(allWage);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //funcOneOne();
        //funcOneTwo();
        //funcOneThree();
        //funcTwoOne();
        //funcTwoTwo();
        //funcTwoThree();
        //funcThreeTwoThree();
        //funcThreeFour();
        funcCreateListEmployee();
    }
}