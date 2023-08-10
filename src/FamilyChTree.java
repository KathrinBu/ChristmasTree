public class FamilyChTree extends TreeDecorator{
    public FamilyChTree(ITree iTree) {
        super(iTree);
    }

    @Override
    public String makeJob() {
        return super.makeJob().toUpperCase()+makePresents();
    }

    public String makePresents(){
        return "\n Doing handmade..";
    }

}
