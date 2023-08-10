public class Task {
    public static void main(String[] args) {

        ITree iTree=new FamilyChTree(new ChristmasTree(new Tree()));
        System.out.println(iTree.makeJob());
    }
}
