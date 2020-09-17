package replit;

public class PlayListEntry {
        String title="";
        String artist="";

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getArtist() {
                return artist;
        }

        public void setArtist(String artist) {
                this.artist = artist;
        }

        public int getPlayCount() {
                return playCount;
        }

        public void setPlayCount(int playCount) {
                this.playCount = playCount;
        }

        int playCount=0;

}
