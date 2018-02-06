package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class VideoList extends Message {
    public static final List<ChannelVideoInfo> DEFAULT_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ChannelVideoInfo> list;
    @ProtoField(tag = 2)
    public final ChannelPage page;

    private VideoList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = immutableCopyOf(builder.list);
            }
            this.page = builder.page;
            return;
        }
        this.list = immutableCopyOf(builder.list);
        this.page = builder.page;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<VideoList> {
        public List<ChannelVideoInfo> list;
        public ChannelPage page;

        public Builder() {
        }

        public Builder(VideoList videoList) {
            super(videoList);
            if (videoList != null) {
                this.list = VideoList.copyOf(videoList.list);
                this.page = videoList.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoList build(boolean z) {
            return new VideoList(this, z);
        }
    }
}
