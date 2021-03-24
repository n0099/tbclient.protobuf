package tbclient.VideoTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class VideoTopicListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<VideoTopicListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(VideoTopicListReqIdl videoTopicListReqIdl) {
            super(videoTopicListReqIdl);
            if (videoTopicListReqIdl == null) {
                return;
            }
            this.data = videoTopicListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTopicListReqIdl build(boolean z) {
            return new VideoTopicListReqIdl(this, z);
        }
    }

    public VideoTopicListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
