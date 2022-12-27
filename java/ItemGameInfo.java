package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ItemGameInfo extends Message {
    public static final List<ThreadInfo> DEFAULT_HOT_VIDEOS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> hot_videos;
    @ProtoField(tag = 2)
    public final RecentUpdate recent_update;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ItemGameInfo> {
        public List<ThreadInfo> hot_videos;
        public RecentUpdate recent_update;

        public Builder() {
        }

        public Builder(ItemGameInfo itemGameInfo) {
            super(itemGameInfo);
            if (itemGameInfo == null) {
                return;
            }
            this.hot_videos = Message.copyOf(itemGameInfo.hot_videos);
            this.recent_update = itemGameInfo.recent_update;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ItemGameInfo build(boolean z) {
            return new ItemGameInfo(this, z);
        }
    }

    public ItemGameInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.hot_videos;
            if (list == null) {
                this.hot_videos = DEFAULT_HOT_VIDEOS;
            } else {
                this.hot_videos = Message.immutableCopyOf(list);
            }
            this.recent_update = builder.recent_update;
            return;
        }
        this.hot_videos = Message.immutableCopyOf(builder.hot_videos);
        this.recent_update = builder.recent_update;
    }
}
