package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TopNews extends Message {
    public static final String DEFAULT_NEWS_LINK = "";
    public static final String DEFAULT_SUMMARY = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String news_link;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String summary;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TopNews> {
        public String news_link;
        public String summary;

        public Builder() {
        }

        public Builder(TopNews topNews) {
            super(topNews);
            if (topNews == null) {
                return;
            }
            this.news_link = topNews.news_link;
            this.summary = topNews.summary;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopNews build(boolean z) {
            return new TopNews(this, z);
        }
    }

    public TopNews(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.news_link;
            if (str == null) {
                this.news_link = "";
            } else {
                this.news_link = str;
            }
            String str2 = builder.summary;
            if (str2 == null) {
                this.summary = "";
                return;
            } else {
                this.summary = str2;
                return;
            }
        }
        this.news_link = builder.news_link;
        this.summary = builder.summary;
    }
}
