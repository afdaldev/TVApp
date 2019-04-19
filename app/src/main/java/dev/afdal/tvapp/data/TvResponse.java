package dev.afdal.tvapp.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvResponse {

    /**
     * page : 1
     * total_results : 122
     * total_pages : 7
     * results : [{"original_name":"Grey's Anatomy","genre_ids":[18],"name":"Grey's Anatomy","popularity":181.713,"origin_country":["US"],"vote_count":912,"first_air_date":"2005-03-27","backdrop_path":"/y6JABtgWMVYPx84Rvy7tROU5aNH.jpg","original_language":"en","id":1416,"vote_average":6.2,"overview":"Follows the personal and professional lives of a group of doctors at Seattle\u2019s Grey Sloan Memorial Hospital.","poster_path":"/eqgIOObafPJitt8JNh1LuO2fvqu.jpg"},{"original_name":"Supernatural","genre_ids":[18,9648,10765],"name":"Supernatural","popularity":149.393,"origin_country":["US"],"vote_count":1753,"first_air_date":"2005-09-13","backdrop_path":"/o9OKe3M06QMLOzTl3l6GStYtnE9.jpg","original_language":"en","id":1622,"vote_average":7.3,"overview":"When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way. ","poster_path":"/3iFm6Kz7iYoFaEcj4fLyZHAmTQA.jpg"},{"original_name":"Gotham","genre_ids":[80,18,14],"name":"Gotham","popularity":113.342,"origin_country":["US"],"vote_count":1063,"first_air_date":"2014-09-22","backdrop_path":"/mKBP1OCgCG0jw8DwVYlnYqVILtc.jpg","original_language":"en","id":60708,"vote_average":6.8,"overview":"Before there was Batman, there was GOTHAM. \n\nEveryone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them \u2013 the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker? ","poster_path":"/4XddcRDtnNjYmLRMYpbrhFxsbuq.jpg"},{"original_name":"The Orville","genre_ids":[35,18,10765],"name":"The Orville","popularity":93.122,"origin_country":["US"],"vote_count":335,"first_air_date":"2017-09-10","backdrop_path":"/2Qg2fViQzWenpUaMjhv0kNhCbE9.jpg","original_language":"en","id":71738,"vote_average":7.1,"overview":"Follows the crew of the not-so-functional exploratory ship in the Earth's interstellar fleet, 400 years in the future.","poster_path":"/1q2gRQ8uN8D2ythPMzd5NvsHkVf.jpg"},{"original_name":"Brooklyn Nine-Nine","genre_ids":[35,80],"name":"Brooklyn Nine-Nine","popularity":88.674,"origin_country":["US"],"vote_count":613,"first_air_date":"2013-09-17","backdrop_path":"/ncC9ZgZuKOdaVm7yXinUn26Qyok.jpg","original_language":"en","id":48891,"vote_average":7.5,"overview":"A single-camera ensemble comedy following the lives of an eclectic group of detectives in a New York precinct, including one slacker who is forced to shape up when he gets a new boss.","poster_path":"/A3SymGlOHefSKbz1bCOz56moupS.jpg"},{"original_name":"Star Trek: Discovery","genre_ids":[10765],"name":"Star Trek: Discovery","popularity":65.501,"origin_country":["US"],"vote_count":545,"first_air_date":"2017-09-24","backdrop_path":"/rhE2h8WYJOPuBlMl20MQRnJw3aq.jpg","original_language":"en","id":67198,"vote_average":6.8,"overview":"Follow the voyages of Starfleet on their missions to discover new worlds and new life forms, and one Starfleet officer who must learn that to truly understand all things alien, you must first understand yourself.","poster_path":"/aJTSeqG43514TewIuS9hiHvbero.jpg"},{"original_name":"The Big Bang Theory","genre_ids":[35],"name":"The Big Bang Theory","popularity":57.821,"origin_country":["US"],"vote_count":3617,"first_air_date":"2007-09-24","backdrop_path":"/nGsNruW3W27V6r4gkyc3iiEGsKR.jpg","original_language":"en","id":1418,"vote_average":6.8,"overview":"The Big Bang Theory is centered on five characters living in Pasadena, California: roommates Leonard Hofstadter and Sheldon Cooper; Penny, a waitress and aspiring actress who lives across the hall; and Leonard and Sheldon's equally geeky and socially awkward friends and co-workers, mechanical engineer Howard Wolowitz and astrophysicist Raj Koothrappali. The geekiness and intellect of the four guys is contrasted for comic effect with Penny's social skills and common sense.","poster_path":"/ooBGRQBdbGzBxAVfExiO8r7kloA.jpg"},{"original_name":"Bosch","genre_ids":[80,18,9648],"name":"Bosch","popularity":53.655,"origin_country":["US"],"vote_count":146,"first_air_date":"2014-02-06","backdrop_path":"/Aht3zzccPbEW1jAEQPK0h8cecRx.jpg","original_language":"en","id":60585,"vote_average":7.9,"overview":"Based on Michael Connelly's best-selling novels, these are the stories of relentless LAPD homicide Detective Harry Bosch who pursues justice at all costs. But behind his tireless momentum is a man who is haunted by his past and struggles to remain loyal to his personal code: \u201cEverybody counts or nobody counts.\u201d","poster_path":"/8lWIXhs8Ju2B5ddOb6sjSshxLov.jpg"},{"original_name":"S.W.A.T.","genre_ids":[80,18,10759],"name":"S.W.A.T.","popularity":52.323,"origin_country":["US"],"vote_count":118,"first_air_date":"2017-11-02","backdrop_path":"/AuY5Wuiwgc2CeuzM0I2poSe4E0x.jpg","original_language":"en","id":71790,"vote_average":6.7,"overview":"Follows a locally born and bred S.W.A.T. lieutenant who is torn between loyalty to the streets and duty to his fellow officers when he's tasked to run a highly-trained unit that's the last stop for solving crimes in Los Angeles.","poster_path":"/ttzrYMdsKWR8PTRLw7uo4noqaOJ.jpg"},{"original_name":"Station 19","genre_ids":[18],"name":"Station 19","popularity":50.963,"origin_country":["US"],"vote_count":29,"first_air_date":"2018-03-22","backdrop_path":"/7Cvv4KdtI00xNti4Dm4RVJDL9qU.jpg","original_language":"en","id":76773,"vote_average":7.6,"overview":"A group of heroic firefighters at Seattle Fire Station 19\u2014from captain to newest recruit\u2014risk their lives and hearts both in the line of duty and off the clock. These brave men and women are like family, literally and figuratively, and together they put their own lives in jeopardy as first responders to save the lives of others.","poster_path":"/apvr0s7sLvlPgNGtfuvM5EOJJMO.jpg"},{"original_name":"Life in Pieces","genre_ids":[35],"name":"Life in Pieces","popularity":45.277,"origin_country":["US"],"vote_count":54,"first_air_date":"2015-09-21","backdrop_path":"/310NwhjwgBRSlBY6UeqevqL7ynZ.jpg","original_language":"en","id":63398,"vote_average":7.4,"overview":"Comedy about one big happy family and their sometimes awkward, often hilarious and ultimately beautiful milestone moments as told by its various members.  Of the three siblings, middle child Matt may have just found his true love, his co-worker, Colleen; his coddled youngest brother, Greg, and his wife, Jen, are overwhelmed by the birth of their first child; and the eldest, Heather, and her husband, Tim, are dreading their impending empty nest so much, they're considering having another baby. Their parents are Joan the family's adoring matriarch who would do anything for her kids - as long as she agrees with it - and John, the gregarious patriarch who's searching for ways to soften the blow of turning 70. As the family's lives unfold in four short stories each week, they try to savor these little pieces of time that flash by but stay with you forever, because these moments add up to what life's all about.","poster_path":"/vac76nqALSJfy9AN0D9sSh1fQFE.jpg"},{"original_name":"Mom","genre_ids":[35,18],"name":"Mom","popularity":32.436,"origin_country":["US"],"vote_count":175,"first_air_date":"2013-09-23","backdrop_path":"/6e43H9xwc7PHWgxICwUa7JpCjpv.jpg","original_language":"en","id":49011,"vote_average":6.5,"overview":"Aan irreverent and outrageous take on true family love\u2010and dysfunction. Newly sober single mom Christy struggles to raise two children in a world full of temptations and pitfalls. Testing her sobriety is her formerly estranged mother, now back in Christy's life and eager to share passive-aggressive insights into her daughter's many mistakes.","poster_path":"/rM6ogBMv7FwHIbDT7sCeKmMyAmN.jpg"},{"original_name":"The Twilight Zone","genre_ids":[18,9648,10765],"name":"The Twilight Zone","popularity":30.789,"origin_country":["US"],"vote_count":10,"first_air_date":"2019-03-31","backdrop_path":"/vZfheYRzSg2djCa56AmMeeBYJiI.jpg","original_language":"en","id":83135,"vote_average":4.5,"overview":"Tales of science fiction, fantasy and the occult, exploring humanity's hopes, despairs, prides and prejudices in metaphoric ways. Next stop ahead The Twilight Zone.","poster_path":"/7gTd9tIEHlDeS07KIt4aYeN9svx.jpg"},{"original_name":"からくりサーカス","genre_ids":[16,80,9648,10759],"name":"Karakuri Circus","popularity":30.376,"origin_country":["JP"],"vote_count":6,"first_air_date":"2018-10-11","backdrop_path":"/HbGe2kVwsmVQuP5yWFfq3w6VZ5.jpg","original_language":"ja","id":83054,"vote_average":6.7,"overview":"","poster_path":"/pUhEiAZXI6OqlUnIbUjlANzY8V9.jpg"},{"original_name":"Marvel's Cloak & Dagger","genre_ids":[18,10759,10765],"name":"Marvel's Cloak & Dagger","popularity":24.377,"origin_country":["US"],"vote_count":99,"first_air_date":"2018-06-07","backdrop_path":"/iEXdA9n9R7Cne2ZY8PQfAjiGyFP.jpg","original_language":"en","id":66190,"vote_average":6.8,"overview":"Two teenagers from very different backgrounds awaken to newly acquired superpowers which mysteriously link them to one another.","poster_path":"/ryJHo3A6KuzqidoBFHxzSpAvjeu.jpg"},{"original_name":"The Good Fight","genre_ids":[18],"name":"The Good Fight","popularity":21.713,"origin_country":["US"],"vote_count":65,"first_air_date":"2017-02-19","backdrop_path":"/to9i5kqa01VNRD9ZZi6cddNQX7L.jpg","original_language":"en","id":69158,"vote_average":7.5,"overview":"Picking up one year after the events of the final broadcast episode of \"The Good Wife\", an enormous financial scam has destroyed the reputation of a young lawyer, Maia Rindell, while simultaneously wiping out her mentor and godmother Diane Lockhart's savings. Forced out of her law firm, now called \"Lockhart, Deckler, Gussman, Lee, Lyman, Gilbert, Lurie, Kagan, Tannebaum & Associates\", they join Lucca Quinn at one of Chicago's preeminent law firms.","poster_path":"/x7KjZQfmRMnPR57VslQbf5XPLLr.jpg"},{"original_name":"첫사랑은 처음이라서","genre_ids":[18],"name":"My First First Love","popularity":21.06,"origin_country":["KR"],"vote_count":0,"first_air_date":"2019-04-18","backdrop_path":"/9mnoY1KaKcZqCiU5ihlwr4ETX11.jpg","original_language":"ko","id":87527,"vote_average":0,"overview":"Due to various personal reasons, a group of Yun Tae-o\u2019s friends move into his house, where they experience love, friendship, and everything in between.","poster_path":"/oTE13yLKzpNfGxdUcyEV6Am4WP2.jpg"},{"original_name":"RuPaul's Drag Race","genre_ids":[10764],"name":"RuPaul's Drag Race","popularity":18.78,"origin_country":["US"],"vote_count":76,"first_air_date":"2009-02-02","backdrop_path":"/blr3W9B17KnLQqg4Ejvcd6tNuMO.jpg","original_language":"en","id":8514,"vote_average":7.7,"overview":"Join RuPaul, the world's most famous drag queen, as the host, mentor and judge for the ultimate in drag queen competitions. The top drag queens in the U.S. will vie for drag stardom as RuPaul, in full glamazon drag, will reign supreme in all judging and eliminations while helping guide the contestants as they prepare for each challenge.","poster_path":"/yPtxI8QAnO74pR4H7voo1hcksmC.jpg"},{"original_name":"Superstore","genre_ids":[35],"name":"Superstore","popularity":18.151,"origin_country":["US"],"vote_count":96,"first_air_date":"2015-11-30","backdrop_path":"/ueLR9bzdrjsWdv9E4kfnLxfbol8.jpg","original_language":"en","id":62649,"vote_average":6.6,"overview":"A hilarious workplace comedy about a unique family of employees at a super-sized mega store. From the bright-eyed newbies and the seen-it-all veterans to the clueless summer hires and the in-it-for-life managers, together they hilariously tackle the day-to-day grind of rabid bargain hunters, riot-causing sales and nap-worthy training sessions.","poster_path":"/aNqCjp1nlg5OPpYu7gX4GnIO7zU.jpg"},{"original_name":"The Late Show with Stephen Colbert","genre_ids":[35,10767],"name":"The Late Show with Stephen Colbert","popularity":17.966,"origin_country":["US"],"vote_count":68,"first_air_date":"2015-09-08","backdrop_path":"/tnibNl6pHeMhHpoRkOYekdEI7S5.jpg","original_language":"en","id":63770,"vote_average":6.7,"overview":"Improv actor and comic Stephen Colbert leaves his \"The Colbert Report\" character behind as he makes his long-awaited return to television. As the host of The Late Show franchise redux -- taped at the historic Ed Sullivan Theatre at New York -- Colbert talks to actors, athletes, politicians, comics, artists and musicians as himself for the first time. Loyal fans, however, will also be treated to consistency as Colbert remains backed by many members of his writing and digital team from his former venture. Julliard-trained Jon Batiste serves as the bandleader.","poster_path":"/dQAv70DH7VycuRS6jEX7xAZ9OmW.jpg"}]
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<ResultsTV> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ResultsTV> getResults() {
        return results;
    }

    public void setResults(List<ResultsTV> results) {
        this.results = results;
    }

    public static class ResultsTV implements Parcelable {
        /**
         * original_name : Grey's Anatomy
         * genre_ids : [18]
         * name : Grey's Anatomy
         * popularity : 181.713
         * origin_country : ["US"]
         * vote_count : 912
         * first_air_date : 2005-03-27
         * backdrop_path : /y6JABtgWMVYPx84Rvy7tROU5aNH.jpg
         * original_language : en
         * id : 1416
         * vote_average : 6.2
         * overview : Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.
         * poster_path : /eqgIOObafPJitt8JNh1LuO2fvqu.jpg
         */

        @SerializedName("original_name")
        private String originalName;
        @SerializedName("name")
        private String name;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("first_air_date")
        private String firstAirDate;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("id")
        private int id;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("overview")
        private String overview;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;
        @SerializedName("origin_country")
        private List<String> originCountry;

        protected ResultsTV(Parcel in) {
            originalName = in.readString();
            name = in.readString();
            popularity = in.readDouble();
            voteCount = in.readInt();
            firstAirDate = in.readString();
            backdropPath = in.readString();
            originalLanguage = in.readString();
            id = in.readInt();
            voteAverage = in.readDouble();
            overview = in.readString();
            posterPath = in.readString();
            originCountry = in.createStringArrayList();
        }

        public static final Creator<ResultsTV> CREATOR = new Creator<ResultsTV>() {
            @Override
            public ResultsTV createFromParcel(Parcel in) {
                return new ResultsTV(in);
            }

            @Override
            public ResultsTV[] newArray(int size) {
                return new ResultsTV[size];
            }
        };

        public String getOriginalName() {
            return originalName;
        }

        public void setOriginalName(String originalName) {
            this.originalName = originalName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public String getFirstAirDate() {
            return firstAirDate;
        }

        public void setFirstAirDate(String firstAirDate) {
            this.firstAirDate = firstAirDate;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }

        public List<String> getOriginCountry() {
            return originCountry;
        }

        public void setOriginCountry(List<String> originCountry) {
            this.originCountry = originCountry;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(originalName);
            dest.writeString(name);
            dest.writeDouble(popularity);
            dest.writeInt(voteCount);
            dest.writeString(firstAirDate);
            dest.writeString(backdropPath);
            dest.writeString(originalLanguage);
            dest.writeInt(id);
            dest.writeDouble(voteAverage);
            dest.writeString(overview);
            dest.writeString(posterPath);
            dest.writeStringList(originCountry);
        }
    }
}
