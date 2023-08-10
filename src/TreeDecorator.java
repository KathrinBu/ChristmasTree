public class TreeDecorator implements ITree {
    ITree iTree;

    public TreeDecorator(ITree iTree) {
        this.iTree = iTree;
    }

    @Override
    public String makeJob() {
        return iTree.makeJob();
    }
}
