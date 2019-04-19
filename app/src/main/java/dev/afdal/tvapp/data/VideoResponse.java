package dev.afdal.tvapp.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideoResponse {

    /**
     * id : 1416
     * results : [{"id":"5cb05c88c3a3683c22ac005b","iso_639_1":"en","iso_3166_1":"US","key":"q1pcpgREQ5c","name":"Grey's Anatomy Trailer","site":"YouTube","size":1080,"type":"Trailer"}]
     */

    @SerializedName("id")
    private int id;
    @SerializedName("results")
    private List<ResultsVideo> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ResultsVideo> getResults() {
        return results;
    }

    public void setResults(List<ResultsVideo> results) {
        this.results = results;
    }

    public static class ResultsVideo {
        /**
         * id : 5cb05c88c3a3683c22ac005b
         * iso_639_1 : en
         * iso_3166_1 : US
         * key : q1pcpgREQ5c
         * name : Grey's Anatomy Trailer
         * site : YouTube
         * size : 1080
         * type : Trailer
         */

        @SerializedName("id")
        private String id;
        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("key")
        private String key;
        @SerializedName("name")
        private String name;
        @SerializedName("site")
        private String site;
        @SerializedName("size")
        private int size;
        @SerializedName("type")
        private String type;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIso6391() {
            return iso6391;
        }

        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }

        public String getIso31661() {
            return iso31661;
        }

        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
