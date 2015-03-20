package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewsInfo extends Message {
    public static final String DEFAULT_NEWS_LINK = "";
    public static final Integer DEFAULT_POSITION = 0;
    public static final String DEFAULT_SUMMARY = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String news_link;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer position;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String summary;

    /* synthetic */ NewsInfo(Builder builder, boolean z, NewsInfo newsInfo) {
        this(builder, z);
    }

    private NewsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.news_link == null) {
                this.news_link = "";
            } else {
                this.news_link = builder.news_link;
            }
            if (builder.summary == null) {
                this.summary = "";
            } else {
                this.summary = builder.summary;
            }
            if (builder.position == null) {
                this.position = DEFAULT_POSITION;
                return;
            } else {
                this.position = builder.position;
                return;
            }
        }
        this.news_link = builder.news_link;
        this.summary = builder.summary;
        this.position = builder.position;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<NewsInfo> {
        public String news_link;
        public Integer position;
        public String summary;

        public Builder(NewsInfo newsInfo) {
            super(newsInfo);
            if (newsInfo != null) {
                this.news_link = newsInfo.news_link;
                this.summary = newsInfo.summary;
                this.position = newsInfo.position;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewsInfo build(boolean z) {
            return new NewsInfo(this, z, null);
        }
    }
}
