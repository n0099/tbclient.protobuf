package tbclient.Feed;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<ThreadPersonalized> DEFAULT_THREAD_THREAD_PERSONALIZED = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadPersonalized> thread_thread_personalized;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> thread_list;
        public List<ThreadPersonalized> thread_thread_personalized;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.thread_thread_personalized = Message.copyOf(dataRes.thread_thread_personalized);
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
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            List<ThreadPersonalized> list2 = builder.thread_thread_personalized;
            if (list2 == null) {
                this.thread_thread_personalized = DEFAULT_THREAD_THREAD_PERSONALIZED;
                return;
            } else {
                this.thread_thread_personalized = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.thread_thread_personalized = Message.immutableCopyOf(builder.thread_thread_personalized);
    }
}
