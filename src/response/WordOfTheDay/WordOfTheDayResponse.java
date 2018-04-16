package response.WordOfTheDay;

import response.Provider;

public class WordOfTheDayResponse {
    private String id;

    private String parentId;

    private String category;

    private String createdBy;

    private String createdAt;

    private Provider contentProvider;

    private String word;

    private String htmlExtra;

    private DefForWOD[] definitions;

    private ExampleForWOD[] examples;

    private String publishDate;

    private String note;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getParentId ()
    {
        return parentId;
    }

    public void setParentId (String parentId)
    {
        this.parentId = parentId;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getCreatedBy ()
    {
        return createdBy;
    }

    public void setCreatedBy (String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getCreatedAt ()
    {
        return createdAt;
    }

    public void setCreatedAt (String createdAt)
    {
        this.createdAt = createdAt;
    }

    public Provider getContentProvider ()
    {
        return contentProvider;
    }

    public void setContentProvider (Provider contentProvider)
    {
        this.contentProvider = contentProvider;
    }

    public String getWord ()
    {
        return word;
    }

    public void setWord (String word)
    {
        this.word = word;
    }

    public String getHtmlExtra ()
    {
        return htmlExtra;
    }

    public void setHtmlExtra (String htmlExtra)
    {
        this.htmlExtra = htmlExtra;
    }

    public DefForWOD[] getDefinitions ()
    {
        return definitions;
    }

    public void setDefinitions (DefForWOD[] definitions)
    {
        this.definitions = definitions;
    }

    public ExampleForWOD[] getExamples ()
    {
        return examples;
    }

    public void setExamples (ExampleForWOD[] examples)
    {
        this.examples = examples;
    }

    public String getPublishDate ()
    {
        return publishDate;
    }

    public void setPublishDate (String publishDate)
    {
        this.publishDate = publishDate;
    }

    public String getNote ()
    {
        return note;
    }

    public void setNote (String note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", parentId = "+parentId+", category = "+category+", createdBy = "+createdBy+", createdAt = "+createdAt+", contentProvider = "+contentProvider+", word = "+word+", htmlExtra = "+htmlExtra+", definitions = "+definitions+", examples = "+examples+", publishDate = "+publishDate+", note = "+note+"]";
    }
}

