package dev.afdal.tvapp.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReviewResponse {

    /**
     * id : 46952
     * page : 1
     * results : [{"author":"Nelson","content":"Really great action series I've been watching for some time now...","id":"5ca542330e0a261b9ab4cd46","url":"https://www.themoviedb.org/review/5ca542330e0a261b9ab4cd46"}]
     * total_pages : 1
     * total_results : 1
     */

    @SerializedName("id")
    private int id;
    @SerializedName("page")
    private int page;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("results")
    private List<ResultsReview> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<ResultsReview> getResults() {
        return results;
    }

    public void setResults(List<ResultsReview> results) {
        this.results = results;
    }

    public static class ResultsReview {
        /**
         * author : Nelson
         * content : Really great action series I've been watching for some time now...
         * id : 5ca542330e0a261b9ab4cd46
         * url : https://www.themoviedb.org/review/5ca542330e0a261b9ab4cd46
         */

        @SerializedName("author")
        private String author;
        @SerializedName("content")
        private String content;
        @SerializedName("id")
        private String id;
        @SerializedName("url")
        private String url;

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
