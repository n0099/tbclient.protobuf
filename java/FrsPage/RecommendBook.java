package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class RecommendBook extends Message {
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_IMAGE = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String image;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<String> DEFAULT_DESC = Collections.emptyList();

    private RecommendBook(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.book_id == null) {
                this.book_id = "";
            } else {
                this.book_id = builder.book_id;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.image == null) {
                this.image = "";
            } else {
                this.image = builder.image;
            }
            if (builder.desc == null) {
                this.desc = DEFAULT_DESC;
            } else {
                this.desc = immutableCopyOf(builder.desc);
            }
            if (builder.link_url == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = builder.link_url;
                return;
            }
        }
        this.type = builder.type;
        this.book_id = builder.book_id;
        this.title = builder.title;
        this.image = builder.image;
        this.desc = immutableCopyOf(builder.desc);
        this.link_url = builder.link_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<RecommendBook> {
        public String book_id;
        public List<String> desc;
        public String image;
        public String link_url;
        public String title;
        public Integer type;

        public Builder() {
        }

        public Builder(RecommendBook recommendBook) {
            super(recommendBook);
            if (recommendBook != null) {
                this.type = recommendBook.type;
                this.book_id = recommendBook.book_id;
                this.title = recommendBook.title;
                this.image = recommendBook.image;
                this.desc = RecommendBook.copyOf(recommendBook.desc);
                this.link_url = recommendBook.link_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendBook build(boolean z) {
            return new RecommendBook(this, z);
        }
    }
}
