public class random {
    private String name;
    private String job;
    private String email;

    public random(String n, String j, String e){
        this.name = n;
        this.job = j;
        this.email = e;
    }

    public String getRandom(){
        return "\nname: " + name + "\njob: " + job + "\nemail: " + email;
    }
}
