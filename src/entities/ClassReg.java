package entities;

public class ClassReg {
    private Integer cod;
    private String name;
    private Double workload;
    private String professor;
    private String preReq;
    private String weekDays;

    public ClassReg(Integer cod, String name, Double workload, String professor, String preReq, String weekDays) {
        this.cod = cod;
        this.name = name;
        this.workload = workload;
        this.professor = professor;
        this.preReq = preReq;
        this.weekDays = weekDays;
    }

    public ClassReg() {
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getPreReq() {
        return preReq;
    }

    public void setPreReq(String preReq) {
        this.preReq = preReq;
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    @Override
    public String toString() {
        return "ClassReg:" + cod + ", " + name + ", " + workload + ", " + professor + ", " + preReq + ", " + weekDays;
    } 
}