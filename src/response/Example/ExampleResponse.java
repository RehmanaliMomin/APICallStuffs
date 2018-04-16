package response.Example;

public class ExampleResponse {
    private MyExample[] examples;

    public MyExample[] getExamples ()
    {
        return examples;
    }

    public void setExamples (MyExample[] examples)
    {
        this.examples = examples;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [examples = "+examples+"]";
    }
}

