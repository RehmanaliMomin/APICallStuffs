package response;

public class PlayGameResponse {

        private String id;

        private String word;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getWord ()
        {
            return word;
        }

        public void setWord (String word)
        {
            this.word = word;
        }

        @Override
        public String toString()
        {
            return "Play Game [id = "+id+", word = "+word+"]";
        }
    }

