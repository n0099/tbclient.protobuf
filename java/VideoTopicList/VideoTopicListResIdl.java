package tbclient.VideoTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes21.dex */
public final class VideoTopicListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private VideoTopicListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<VideoTopicListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(VideoTopicListResIdl videoTopicListResIdl) {
            super(videoTopicListResIdl);
            if (videoTopicListResIdl != null) {
                this.error = videoTopicListResIdl.error;
                this.data = videoTopicListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoTopicListResIdl build(boolean z) {
            return new VideoTopicListResIdl(this, z);
        }
    }
}
