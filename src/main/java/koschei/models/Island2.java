package koschei.models;

public class Island2 {
    private Wood3 wood;

    public Island2(Wood3 wood) {
//        System.out.println("Island2 -> bean is created");
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
