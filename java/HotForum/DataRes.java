package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumInfo> forum_info;
    @ProtoField(tag = 2)
    public final HotSearch hot_search;
    @ProtoField(tag = 3)
    public final HotTopic hot_topic;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumInfo> forum_info;
        public HotSearch hot_search;
        public HotTopic hot_topic;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_info = Message.copyOf(dataRes.forum_info);
            this.hot_search = dataRes.hot_search;
            this.hot_topic = dataRes.hot_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ForumInfo> list = builder.forum_info;
            if (list == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = Message.immutableCopyOf(list);
            }
            this.hot_search = builder.hot_search;
            this.hot_topic = builder.hot_topic;
            return;
        }
        this.forum_info = Message.immutableCopyOf(builder.forum_info);
        this.hot_search = builder.hot_search;
        this.hot_topic = builder.hot_topic;
    }
}
