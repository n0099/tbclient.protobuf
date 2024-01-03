package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 2)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Page page;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.page = dataRes.page;
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
            this.page = builder.page;
            return;
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.page = builder.page;
    }
}
