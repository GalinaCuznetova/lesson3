public class Main {
    public static void main(String[] args){
        var dog =8.0;
        var cat =3.6;
        var paper =763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog +4;
        cat = cat +4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog =3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        var  boxerOne = 78.2;
        var boxerTwo = 82.7;
        var totalWeight = boxerTwo + boxerOne;
        var differenceWeight = boxerOne -boxerTwo;
        System.out.println("общий вес" + totalWeight + "kg!");
        System.out.println("разница в весе" + differenceWeight + "kg!");
        var differenceWeightDel =  (boxerTwo - boxerOne) % totalWeight;
        System.out.println("разница в весе" + differenceWeightDel +"kg!");
        var totalHours = 640;
        var workTime = 8;
        var employeesNumber = totalHours / workTime;
        System.out.println("Всего работников в компании " + employeesNumber + " человек!");
        var increaseEmployees = employeesNumber + 94;
        var workingHoursNew = totalHours / increaseEmployees;
         System.out.println("Если в компании работает " + increaseEmployees + " человека,то всего по " + workingHoursNew + " часа работы приходится на каждого  сотрудника!");

    }
}
