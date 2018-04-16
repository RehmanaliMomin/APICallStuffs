package response.WordOfTheDay;

public class DefForWOD {


        private String text;

        private String source;

        private String note;

        private String partOfSpeech;

        public String getText ()
        {
            return text;
        }

        public void setText (String text)
        {
            this.text = text;
        }

        public String getSource ()
        {
            return source;
        }

        public void setSource (String source)
        {
            this.source = source;
        }

        public String getNote ()
        {
            return note;
        }

        public void setNote (String note)
        {
            this.note = note;
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
            return "ClassPojo [text = "+text+", source = "+source+", note = "+note+", partOfSpeech = "+partOfSpeech+"]";
        }


}