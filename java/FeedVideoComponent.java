package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeedVideoComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1)
    public final VideoField video_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedVideoComponent> {
        public String schema;
        public VideoField video_info;

        public Builder() {
        }

        public Builder(FeedVideoComponent feedVideoComponent) {
            super(feedVideoComponent);
            if (feedVideoComponent == null) {
                return;
            }
            this.video_info = feedVideoComponent.video_info;
            this.schema = feedVideoComponent.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedVideoComponent build(boolean z) {
            return new FeedVideoComponent(this, z);
        }
    }

    public FeedVideoComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.video_info = builder.video_info;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.video_info = builder.video_info;
        this.schema = builder.schema;
    }
}
