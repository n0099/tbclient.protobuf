package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeedContentResource extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<FeedKV> business_info;
    @ProtoField(tag = 10)
    public final FeedContentEmoji emoji_info;
    @ProtoField(tag = 9)
    public final FeedContentIcon icon_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<FeedKV> log_info;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 8)
    public final FeedContentText text_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_INFO = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedContentResource> {
        public List<FeedKV> business_info;
        public FeedContentEmoji emoji_info;
        public FeedContentIcon icon_info;
        public List<FeedKV> log_info;
        public String schema;
        public FeedContentText text_info;
        public Integer type;

        public Builder() {
        }

        public Builder(FeedContentResource feedContentResource) {
            super(feedContentResource);
            if (feedContentResource == null) {
                return;
            }
            this.type = feedContentResource.type;
            this.schema = feedContentResource.schema;
            this.text_info = feedContentResource.text_info;
            this.icon_info = feedContentResource.icon_info;
            this.emoji_info = feedContentResource.emoji_info;
            this.business_info = Message.copyOf(feedContentResource.business_info);
            this.log_info = Message.copyOf(feedContentResource.log_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedContentResource build(boolean z) {
            return new FeedContentResource(this, z);
        }
    }

    public FeedContentResource(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.text_info = builder.text_info;
            this.icon_info = builder.icon_info;
            this.emoji_info = builder.emoji_info;
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_info;
            if (list2 == null) {
                this.log_info = DEFAULT_LOG_INFO;
                return;
            } else {
                this.log_info = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.type = builder.type;
        this.schema = builder.schema;
        this.text_info = builder.text_info;
        this.icon_info = builder.icon_info;
        this.emoji_info = builder.emoji_info;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.log_info = Message.immutableCopyOf(builder.log_info);
    }
}
