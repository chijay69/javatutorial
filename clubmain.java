public class clubmain {
    public static void main(String[] args) {
        club member1 = new club("Megan", "Fox");
        club member2 = new club("Natalie", "Portman");
        club member3 = new club("Taylor", "Swift");

        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMembers());
        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
        System.out.println();
        System.out.println(member3.getFirst());
        System.out.println(member3.getLast());
        System.out.println(member3.getMembers());
        System.out.println(club.getMembers());
    }
}
