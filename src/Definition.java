import java.util.List;

public class Definition {
    private String dict;
    private String dictType;
    private int year;
    private List<String> text;

    public Definition(String dict, String dictType, int year, List<String> text) {
        this.dict = dict;
        this.dictType = dictType;
        this.year = year;
        this.text = text;
    }

    public String getDict() {
        return dict;
    }

    public String getDictType() {
        return dictType;
    }

    public int getYear() {
        return year;
    }

    public List<String> getText() {
        return text;
    }

    /*
     * Once this class was instantiated, there is no reason to change the name of the
     * dictionary or other attributes. The only thing that makes sense is eventually
     * to add more definitions, in case they weren't all added initially. So text is
     * the only attribute that can be changed after instantiation.
     */
    public void setText(List<String> text) {
        this.text = text;
    }
}
