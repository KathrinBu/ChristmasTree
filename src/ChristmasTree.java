public class ChristmasTree extends TreeDecorator{
    public ChristmasTree(ITree iTree) {
        super(iTree);
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeBeautiful()+" Add some toys ^_^";
    }

    public String makeBeautiful() {
        return "\n You Made beauty!";
    }
}
