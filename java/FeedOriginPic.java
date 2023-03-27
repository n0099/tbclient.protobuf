package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class FeedOriginPic extends Message {
    public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PicInfo> pics;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FeedOriginPic> {
        public List<PicInfo> pics;
        public String schema;

        public Builder() {
        }

        public Builder(FeedOriginPic feedOriginPic) {
            super(feedOriginPic);
            if (feedOriginPic == null) {
                return;
            }
            this.pics = Message.copyOf(feedOriginPic.pics);
            this.schema = feedOriginPic.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedOriginPic build(boolean z) {
            return new FeedOriginPic(this, z);
        }
    }

    public FeedOriginPic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<PicInfo> list = builder.pics;
            if (list == null) {
                this.pics = DEFAULT_PICS;
            } else {
                this.pics = Message.immutableCopyOf(list);
            }
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.pics = Message.immutableCopyOf(builder.pics);
        this.schema = builder.schema;
    }
}
