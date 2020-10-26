
public class Word {
    private String id ; 
    private String eng;
    private String tr;

    public Word(String id, String eng, String tr) {
        this.id = id;
        this.eng = eng;
        this.tr = tr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }
    
}
