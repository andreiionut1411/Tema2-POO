import java.util.List;

public class Word {
    private String word;
    private String word_en;
    private String type;
    private List<String> singular;
    private List<String> plural;
    private List<Definition> definitions;

    public Word(String word, String word_en, String type, List<String> singular, List<String> plural,
                List<Definition> definitions) {
        this.word = word;
        this.word_en = word_en;
        this.type = type;
        this.singular = singular;
        this.plural = plural;
        this.definitions = definitions;
    }

    public String getWord() {
        return word;
    }

    public String getWord_en() {
        return word_en;
    }

    public String getType() {
        return type;
    }

    public List<String> getSingular() {
        return singular;
    }

    public List<String> getPlural() {
        return plural;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }

    /*
     * Once we instantiated the word, its name and most of the attributes are not supposed to change,
     * and the only one that we will make so that it can be changed externally is going to be the
     * definitions list, in case that we want to add more definitions to a word.
     */
    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }
}
