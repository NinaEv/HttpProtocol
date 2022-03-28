import com.fasterxml.jackson.annotation.JsonProperty;

public class Facts {

    private final String id;
    private final String text;
    private final String type;
    private final String userName;
    private final Integer upvotes;

    @Override
    public String toString() {
        return "Fact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", userName='" + userName + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }

    public Facts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String userName,
            @JsonProperty("upvotes") Integer upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.userName = userName;
        this.upvotes = upvotes;
    }

    public Integer getUpvotes() {
        return upvotes;
    }
}
