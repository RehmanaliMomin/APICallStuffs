package response;

public class SynonymResponse
{
    private String relationshipType;

    private String[] words;

    public String getRelationshipType ()
    {
        return relationshipType;
    }

    public void setRelationshipType (String relationshipType)
    {
        this.relationshipType = relationshipType;
    }

    public String[] getWords ()
    {
        return words;
    }

    public void setWords (String[] words)
    {
        this.words = words;
    }

    @Override
    public String toString()
    {
        return "SynonymResponse [relationshipType = "+relationshipType+", words = "+words+"]";
    }
}