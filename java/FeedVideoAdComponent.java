package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FeedVideoAdComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";
    @ProtoField(tag = 4)
    public final DownloadBar download_bar;
    @ProtoField(tag = 3)
    public final FeedMaskLayer mask_layer;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 1)
    public final VideoField video_info;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FeedVideoAdComponent> {
        public DownloadBar download_bar;
        public FeedMaskLayer mask_layer;
        public String schema;
        public VideoField video_info;

        public Builder() {
        }

        public Builder(FeedVideoAdComponent feedVideoAdComponent) {
            super(feedVideoAdComponent);
            if (feedVideoAdComponent == null) {
                return;
            }
            this.video_info = feedVideoAdComponent.video_info;
            this.schema = feedVideoAdComponent.schema;
            this.mask_layer = feedVideoAdComponent.mask_layer;
            this.download_bar = feedVideoAdComponent.download_bar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FeedVideoAdComponent build(boolean z) {
            return new FeedVideoAdComponent(this, z);
        }
    }

    public FeedVideoAdComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.video_info = builder.video_info;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.mask_layer = builder.mask_layer;
            this.download_bar = builder.download_bar;
            return;
        }
        this.video_info = builder.video_info;
        this.schema = builder.schema;
        this.mask_layer = builder.mask_layer;
        this.download_bar = builder.download_bar;
    }
}
