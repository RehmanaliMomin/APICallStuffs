package response;

public class AntonymResponse {

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
        return "AntonymResponse [relationshipType = "+relationshipType+", words = "+words+"]";
    }
}
