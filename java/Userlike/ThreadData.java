package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes16.dex */
public final class ThreadData extends Message {
    public static final String DEFAULT_POST_DATA = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String post_data;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer post_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_POST_TYPE = 0;

    private ThreadData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.post_data == null) {
                this.post_data = "";
            } else {
                this.post_data = builder.post_data;
            }
            if (builder.post_type == null) {
                this.post_type = DEFAULT_POST_TYPE;
                return;
            } else {
                this.post_type = builder.post_type;
                return;
            }
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.post_data = builder.post_data;
        this.post_type = builder.post_type;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ThreadData> {
        public String post_data;
        public Integer post_type;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(ThreadData threadData) {
            super(threadData);
            if (threadData != null) {
                this.thread_list = ThreadData.copyOf(threadData.thread_list);
                this.post_data = threadData.post_data;
                this.post_type = threadData.post_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadData build(boolean z) {
            return new ThreadData(this, z);
        }
    }
}
