public class random {
    private String name;
    private String job;
    private String email;

    public random(String name, String job, String email){
        this.name = name;
        this.job = job;
        this.email = email;
    }

    public String getRandom(){
        return "\nname: " + name + "\njob: " + job + "\nemail: " + email;
    }

    public String getName(){return "\nname: " + name;}

    public String getJob(){return "\njob: " + job;}

    public String getEmail(){return "\nemail: " + email;}
}
