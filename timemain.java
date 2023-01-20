public class timemain {
    public static void main(String[] args) {
        time objecTime = new time();
        System.out.println(objecTime.toMilitary());
        System.out.println(objecTime.toString());
        objecTime.setTime(13, 27, 6);
        System.out.println(objecTime.toMilitary());
        System.out.println(objecTime.toString());
        System.out.println("New object");
        constructor constObj = new constructor();
        constructor constObj1 = new constructor(5);
        constructor constObj2 = new constructor(5, 13);
        constructor constObj3 = new constructor(15, 23, 43);
        System.out.printf("%s\n", constObj.toMilitary());
        System.out.printf("%s\n", constObj1.toMilitary());
        System.out.printf("%s\n", constObj2.toMilitary());
        System.out.printf("%s\n", constObj3.toMilitary());
    }
}
