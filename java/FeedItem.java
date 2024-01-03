package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedItem extends Message {
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO;
    public static final String DEFAULT_BUTTON_LINK = "";
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final Double DEFAULT_ICON_RATIO;
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    public static final Double DEFAULT_SCORE;
    public static final List<String> DEFAULT_TAGS;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String button_link;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_name;
    @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
    public final Double icon_ratio;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
    public final Double score;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> tags;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedItem> {
        public List<FeedKV> business_info;
        public String button_link;
        public String button_name;
        public Double icon_ratio;
        public String icon_url;
        public String name;
        public Double score;
        public List<String> tags;

        public Builder() {
        }

        public Builder(FeedItem feedItem) {
            super(feedItem);
            if (feedItem == null) {
                return;
            }
            this.icon_url = feedItem.icon_url;
            this.icon_ratio = feedItem.icon_ratio;
            this.name = feedItem.name;
            this.score = feedItem.score;
            this.tags = Message.copyOf(feedItem.tags);
            this.button_name = feedItem.button_name;
            this.button_link = feedItem.button_link;
            this.business_info = Message.copyOf(feedItem.business_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedItem build(boolean z) {
            return new FeedItem(this, z);
        }
    }

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_ICON_RATIO = valueOf;
        DEFAULT_SCORE = valueOf;
        DEFAULT_TAGS = Collections.emptyList();
        DEFAULT_BUSINESS_INFO = Collections.emptyList();
    }

    public FeedItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            Double d = builder.icon_ratio;
            if (d == null) {
                this.icon_ratio = DEFAULT_ICON_RATIO;
            } else {
                this.icon_ratio = d;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            Double d2 = builder.score;
            if (d2 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = d2;
            }
            List<String> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            String str3 = builder.button_name;
            if (str3 == null) {
                this.button_name = "";
            } else {
                this.button_name = str3;
            }
            String str4 = builder.button_link;
            if (str4 == null) {
                this.button_link = "";
            } else {
                this.button_link = str4;
            }
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.icon_ratio = builder.icon_ratio;
        this.name = builder.name;
        this.score = builder.score;
        this.tags = Message.immutableCopyOf(builder.tags);
        this.button_name = builder.button_name;
        this.button_link = builder.button_link;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}
