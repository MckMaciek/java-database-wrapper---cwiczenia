package p.database.Models;



public class Group {
    private String name;
    private String id;

    public String getterId() {
        return id;
    }
    public String getterName() {
        return name;
    }

    public Group(){
    }

    public void setterId(String id) {
        this.id = id;
    }

    public void setterName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static class GroupBuilder{
        private String name;
        private String id;

        public GroupBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GroupBuilder setId(String id) {
            this.id = id;
            return this;
        }


        public Group build(){
            Group group = new Group();
            group.name = this.name;
            group.id = this.id;

            return group;
        }
    }

    public static GroupBuilder getInstanceOfGroupBuilder(){
        return new GroupBuilder();
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
