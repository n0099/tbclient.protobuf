package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedPostExpose extends Message {
    public static final String DEFAULT_HEAD_TEXT = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_STAMP_URL = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<FeedKV> business_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedContentResource> floor;
    @ProtoField(tag = 7)
    public final Agree head_agree;
    @ProtoField(tag = 4)
    public final PostExposeHead head_img;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String head_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String stamp_url;
    public static final List<FeedContentResource> DEFAULT_FLOOR = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedPostExpose> {
        public List<FeedKV> business_info;
        public List<FeedContentResource> floor;
        public Agree head_agree;
        public PostExposeHead head_img;
        public String head_text;
        public String schema;
        public String stamp_url;

        public Builder() {
        }

        public Builder(FeedPostExpose feedPostExpose) {
            super(feedPostExpose);
            if (feedPostExpose == null) {
                return;
            }
            this.schema = feedPostExpose.schema;
            this.stamp_url = feedPostExpose.stamp_url;
            this.floor = Message.copyOf(feedPostExpose.floor);
            this.head_img = feedPostExpose.head_img;
            this.business_info = Message.copyOf(feedPostExpose.business_info);
            this.head_text = feedPostExpose.head_text;
            this.head_agree = feedPostExpose.head_agree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedPostExpose build(boolean z) {
            return new FeedPostExpose(this, z);
        }
    }

    public FeedPostExpose(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            String str2 = builder.stamp_url;
            if (str2 == null) {
                this.stamp_url = "";
            } else {
                this.stamp_url = str2;
            }
            List<FeedContentResource> list = builder.floor;
            if (list == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = Message.immutableCopyOf(list);
            }
            this.head_img = builder.head_img;
            List<FeedKV> list2 = builder.business_info;
            if (list2 == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list2);
            }
            String str3 = builder.head_text;
            if (str3 == null) {
                this.head_text = "";
            } else {
                this.head_text = str3;
            }
            this.head_agree = builder.head_agree;
            return;
        }
        this.schema = builder.schema;
        this.stamp_url = builder.stamp_url;
        this.floor = Message.immutableCopyOf(builder.floor);
        this.head_img = builder.head_img;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.head_text = builder.head_text;
        this.head_agree = builder.head_agree;
    }
}
