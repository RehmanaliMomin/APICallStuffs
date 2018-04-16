package response.Example;

import response.Provider;

public class MyExample
{
    private String exampleId;

    private String title;

    private String text;

    private String word;

    private String year;

    private Provider provider;

    private String rating;

    private String documentId;

    private String url;

    public String getExampleId ()
    {
        return exampleId;
    }

    public void setExampleId (String exampleId)
    {
        this.exampleId = exampleId;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getWord ()
    {
        return word;
    }

    public void setWord (String word)
    {
        this.word = word;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    public Provider getProvider ()
    {
        return provider;
    }

    public void setProvider (Provider provider)
    {
        this.provider = provider;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getDocumentId ()
    {
        return documentId;
    }

    public void setDocumentId (String documentId)
    {
        this.documentId = documentId;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "MyExample [exampleId = "+exampleId+", title = "+title+", text = "+text+", word = "+word+", year = "+year+", provider = "+provider+", rating = "+rating+", documentId = "+documentId+", url = "+url+"]";
    }
}

