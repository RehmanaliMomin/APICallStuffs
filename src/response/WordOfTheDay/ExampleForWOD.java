package response.WordOfTheDay;

public class ExampleForWOD {


        private String id;

        private String text;

        private String title;

        private String url;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getText ()
        {
            return text;
        }

        public void setText (String text)
        {
            this.text = text;
        }

        public String getTitle ()
        {
            return title;
        }

        public void setTitle (String title)
        {
            this.title = title;
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
            return "ExampleForWOD [id = "+id+", text = "+text+", title = "+title+", url = "+url+"]";
        }


}