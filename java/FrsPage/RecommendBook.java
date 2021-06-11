package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
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
            if (recommendBook == null) {
                return;
            }
            this.type = recommendBook.type;
            this.book_id = recommendBook.book_id;
            this.title = recommendBook.title;
            this.image = recommendBook.image;
            this.desc = Message.copyOf(recommendBook.desc);
            this.link_url = recommendBook.link_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendBook build(boolean z) {
            return new RecommendBook(this, z);
        }
    }

    public RecommendBook(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.book_id;
            if (str == null) {
                this.book_id = "";
            } else {
                this.book_id = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            String str3 = builder.image;
            if (str3 == null) {
                this.image = "";
            } else {
                this.image = str3;
            }
            List<String> list = builder.desc;
            if (list == null) {
                this.desc = DEFAULT_DESC;
            } else {
                this.desc = Message.immutableCopyOf(list);
            }
            String str4 = builder.link_url;
            if (str4 == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = str4;
                return;
            }
        }
        this.type = builder.type;
        this.book_id = builder.book_id;
        this.title = builder.title;
        this.image = builder.image;
        this.desc = Message.immutableCopyOf(builder.desc);
        this.link_url = builder.link_url;
    }
}
