package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class RecommendBook extends Message {
    public static final String DEFAULT_BOOK_COVER = "";
    public static final String DEFAULT_BOOK_ID = "";
    public static final String DEFAULT_BOOK_TITLE = "";
    public static final String DEFAULT_BOTTON_TEXT = "";
    public static final String DEFAULT_RECOMMEND_TEXT = "";
    public static final String DEFAULT_SUBSCRIPT_ICON = "";
    public static final String DEFAULT_SUGGEST_TEXT = "";
    public static final String DEFAULT_SUGGEST_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String book_cover;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String book_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> book_tips;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String book_title;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer book_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String botton_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String recommend_text;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String subscript_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String suggest_text;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String suggest_url;
    public static final Integer DEFAULT_BOOK_TYPE = 0;
    public static final List<String> DEFAULT_BOOK_TIPS = Collections.emptyList();

    private RecommendBook(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recommend_text == null) {
                this.recommend_text = "";
            } else {
                this.recommend_text = builder.recommend_text;
            }
            if (builder.suggest_text == null) {
                this.suggest_text = "";
            } else {
                this.suggest_text = builder.suggest_text;
            }
            if (builder.suggest_url == null) {
                this.suggest_url = "";
            } else {
                this.suggest_url = builder.suggest_url;
            }
            if (builder.book_id == null) {
                this.book_id = "";
            } else {
                this.book_id = builder.book_id;
            }
            if (builder.book_type == null) {
                this.book_type = DEFAULT_BOOK_TYPE;
            } else {
                this.book_type = builder.book_type;
            }
            if (builder.book_cover == null) {
                this.book_cover = "";
            } else {
                this.book_cover = builder.book_cover;
            }
            if (builder.book_title == null) {
                this.book_title = "";
            } else {
                this.book_title = builder.book_title;
            }
            if (builder.book_tips == null) {
                this.book_tips = DEFAULT_BOOK_TIPS;
            } else {
                this.book_tips = immutableCopyOf(builder.book_tips);
            }
            if (builder.botton_text == null) {
                this.botton_text = "";
            } else {
                this.botton_text = builder.botton_text;
            }
            if (builder.subscript_icon == null) {
                this.subscript_icon = "";
                return;
            } else {
                this.subscript_icon = builder.subscript_icon;
                return;
            }
        }
        this.recommend_text = builder.recommend_text;
        this.suggest_text = builder.suggest_text;
        this.suggest_url = builder.suggest_url;
        this.book_id = builder.book_id;
        this.book_type = builder.book_type;
        this.book_cover = builder.book_cover;
        this.book_title = builder.book_title;
        this.book_tips = immutableCopyOf(builder.book_tips);
        this.botton_text = builder.botton_text;
        this.subscript_icon = builder.subscript_icon;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<RecommendBook> {
        public String book_cover;
        public String book_id;
        public List<String> book_tips;
        public String book_title;
        public Integer book_type;
        public String botton_text;
        public String recommend_text;
        public String subscript_icon;
        public String suggest_text;
        public String suggest_url;

        public Builder() {
        }

        public Builder(RecommendBook recommendBook) {
            super(recommendBook);
            if (recommendBook != null) {
                this.recommend_text = recommendBook.recommend_text;
                this.suggest_text = recommendBook.suggest_text;
                this.suggest_url = recommendBook.suggest_url;
                this.book_id = recommendBook.book_id;
                this.book_type = recommendBook.book_type;
                this.book_cover = recommendBook.book_cover;
                this.book_title = recommendBook.book_title;
                this.book_tips = RecommendBook.copyOf(recommendBook.book_tips);
                this.botton_text = recommendBook.botton_text;
                this.subscript_icon = recommendBook.subscript_icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendBook build(boolean z) {
            return new RecommendBook(this, z);
        }
    }
}
