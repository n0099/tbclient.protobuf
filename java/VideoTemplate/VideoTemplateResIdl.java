package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class VideoTemplateResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoTemplateResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(VideoTemplateResIdl videoTemplateResIdl) {
            super(videoTemplateResIdl);
            if (videoTemplateResIdl == null) {
                return;
            }
            this.error = videoTemplateResIdl.error;
            this.data = videoTemplateResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTemplateResIdl build(boolean z) {
            return new VideoTemplateResIdl(this, z);
        }
    }

    public VideoTemplateResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
