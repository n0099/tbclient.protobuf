package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NewsInfo extends Message {
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_NEWS_ICON = "";
    public static final String DEFAULT_NEWS_LINK = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_SUMMARY = "";
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String news_icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String news_link;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer news_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer position;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String summary;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Integer DEFAULT_NEWS_TYPE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NewsInfo> {
        public String button_text;
        public String news_icon;
        public String news_link;
        public Integer news_type;
        public Integer position;
        public String subtitle;
        public String summary;

        public Builder() {
        }

        public Builder(NewsInfo newsInfo) {
            super(newsInfo);
            if (newsInfo == null) {
                return;
            }
            this.news_link = newsInfo.news_link;
            this.summary = newsInfo.summary;
            this.position = newsInfo.position;
            this.news_type = newsInfo.news_type;
            this.news_icon = newsInfo.news_icon;
            this.subtitle = newsInfo.subtitle;
            this.button_text = newsInfo.button_text;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewsInfo build(boolean z) {
            return new NewsInfo(this, z);
        }
    }

    public NewsInfo(Builder builder, boolean z) {
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
            } else {
                this.summary = str2;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            Integer num2 = builder.news_type;
            if (num2 == null) {
                this.news_type = DEFAULT_NEWS_TYPE;
            } else {
                this.news_type = num2;
            }
            String str3 = builder.news_icon;
            if (str3 == null) {
                this.news_icon = "";
            } else {
                this.news_icon = str3;
            }
            String str4 = builder.subtitle;
            if (str4 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str4;
            }
            String str5 = builder.button_text;
            if (str5 == null) {
                this.button_text = "";
                return;
            } else {
                this.button_text = str5;
                return;
            }
        }
        this.news_link = builder.news_link;
        this.summary = builder.summary;
        this.position = builder.position;
        this.news_type = builder.news_type;
        this.news_icon = builder.news_icon;
        this.subtitle = builder.subtitle;
        this.button_text = builder.button_text;
    }
}
