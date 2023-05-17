package tbclient.VideoTemplate;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class VideoTemplateReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoTemplateReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(VideoTemplateReqIdl videoTemplateReqIdl) {
            super(videoTemplateReqIdl);
            if (videoTemplateReqIdl == null) {
                return;
            }
            this.data = videoTemplateReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTemplateReqIdl build(boolean z) {
            return new VideoTemplateReqIdl(this, z);
        }
    }

    public VideoTemplateReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
