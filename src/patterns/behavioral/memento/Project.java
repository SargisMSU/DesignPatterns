package patterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public Memento save(){
        return new Memento(version);
    }

    public void load(Memento memento){
        this.date = memento.getDate();
        this.version = memento.getVersion();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
