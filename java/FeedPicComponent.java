package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class FeedPicComponent extends Message {
    public static final List<PicInfo> DEFAULT_PICS = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<PicInfo> pics;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedPicComponent> {
        public List<PicInfo> pics;
        public String schema;

        public Builder() {
        }

        public Builder(FeedPicComponent feedPicComponent) {
            super(feedPicComponent);
            if (feedPicComponent == null) {
                return;
            }
            this.pics = Message.copyOf(feedPicComponent.pics);
            this.schema = feedPicComponent.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedPicComponent build(boolean z) {
            return new FeedPicComponent(this, z);
        }
    }

    public FeedPicComponent(Builder builder, boolean z) {
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
