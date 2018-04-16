package response;

public class DefinationResponse
{
    private String text;

    private String sourceDictionary;

    private String attributionText;

    private String[] citations;

    private String[] relatedWords;

    private String sequence;

    private String[] labels;

    private String score;

    private String word;

    private String[] exampleUses;

    private String[] textProns;

    private String partOfSpeech;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getSourceDictionary ()
    {
        return sourceDictionary;
    }

    public void setSourceDictionary (String sourceDictionary)
    {
        this.sourceDictionary = sourceDictionary;
    }

    public String getAttributionText ()
    {
        return attributionText;
    }

    public void setAttributionText (String attributionText)
    {
        this.attributionText = attributionText;
    }

    public String[] getCitations ()
    {
        return citations;
    }

    public void setCitations (String[] citations)
    {
        this.citations = citations;
    }

    public String[] getRelatedWords ()
    {
        return relatedWords;
    }

    public void setRelatedWords (String[] relatedWords)
    {
        this.relatedWords = relatedWords;
    }

    public String getSequence ()
    {
        return sequence;
    }

    public void setSequence (String sequence)
    {
        this.sequence = sequence;
    }

    public String[] getLabels ()
    {
        return labels;
    }

    public void setLabels (String[] labels)
    {
        this.labels = labels;
    }

    public String getScore ()
    {
        return score;
    }

    public void setScore (String score)
    {
        this.score = score;
    }

    public String getWord ()
    {
        return word;
    }

    public void setWord (String word)
    {
        this.word = word;
    }

    public String[] getExampleUses ()
    {
        return exampleUses;
    }

    public void setExampleUses (String[] exampleUses)
    {
        this.exampleUses = exampleUses;
    }

    public String[] getTextProns ()
    {
        return textProns;
    }

    public void setTextProns (String[] textProns)
    {
        this.textProns = textProns;
    }

    public String getPartOfSpeech ()
    {
        return partOfSpeech;
    }

    public void setPartOfSpeech (String partOfSpeech)
    {
        this.partOfSpeech = partOfSpeech;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", sourceDictionary = "+sourceDictionary+", attributionText = "+attributionText+", citations = "+citations+", relatedWords = "+relatedWords+", sequence = "+sequence+", labels = "+labels+", score = "+score+", word = "+word+", exampleUses = "+exampleUses+", textProns = "+textProns+", partOfSpeech = "+partOfSpeech+"]";
    }
}

