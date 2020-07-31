package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomTopicList;
import tbclient.ThreadInfo;
/* loaded from: classes16.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecomTopicList> topic_list;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.topic_list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = immutableCopyOf(builder.topic_list);
            }
            if (builder.thread_info == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
                return;
            } else {
                this.thread_info = immutableCopyOf(builder.thread_info);
                return;
            }
        }
        this.topic_list = immutableCopyOf(builder.topic_list);
        this.thread_info = immutableCopyOf(builder.thread_info);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> thread_info;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.topic_list = DataRes.copyOf(dataRes.topic_list);
                this.thread_info = DataRes.copyOf(dataRes.thread_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
