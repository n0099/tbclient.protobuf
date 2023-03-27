package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FeedLiveComponent extends Message {
    public static final String DEFAULT_AUDIENCE_LABEL = "";
    public static final String DEFAULT_BOTTOM_LABEL = "";
    public static final String DEFAULT_COVER_URL = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TOP_LABEL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String audience_label;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bottom_label;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cover_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String top_label;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedLiveComponent> {
        public String audience_label;
        public String bottom_label;
        public String cover_url;
        public String schema;
        public String top_label;

        public Builder() {
        }

        public Builder(FeedLiveComponent feedLiveComponent) {
            super(feedLiveComponent);
            if (feedLiveComponent == null) {
                return;
            }
            this.top_label = feedLiveComponent.top_label;
            this.bottom_label = feedLiveComponent.bottom_label;
            this.audience_label = feedLiveComponent.audience_label;
            this.cover_url = feedLiveComponent.cover_url;
            this.schema = feedLiveComponent.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedLiveComponent build(boolean z) {
            return new FeedLiveComponent(this, z);
        }
    }

    public FeedLiveComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.top_label;
            if (str == null) {
                this.top_label = "";
            } else {
                this.top_label = str;
            }
            String str2 = builder.bottom_label;
            if (str2 == null) {
                this.bottom_label = "";
            } else {
                this.bottom_label = str2;
            }
            String str3 = builder.audience_label;
            if (str3 == null) {
                this.audience_label = "";
            } else {
                this.audience_label = str3;
            }
            String str4 = builder.cover_url;
            if (str4 == null) {
                this.cover_url = "";
            } else {
                this.cover_url = str4;
            }
            String str5 = builder.schema;
            if (str5 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str5;
                return;
            }
        }
        this.top_label = builder.top_label;
        this.bottom_label = builder.bottom_label;
        this.audience_label = builder.audience_label;
        this.cover_url = builder.cover_url;
        this.schema = builder.schema;
    }
}
