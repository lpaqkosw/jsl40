package app.b;

public class Member {
    String id;
    String name;
    String age;

    public Member(String[] in) {
        this.id = in[0];
        this.name = in[1];
        this.age = in[2];
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age;
    }

    public boolean equals(String id) {
            return this.id.equals(id);
        }
    }

