package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThreadListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ThreadListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThreadListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ThreadListReqIdl threadListReqIdl) {
            super(threadListReqIdl);
            if (threadListReqIdl != null) {
                this.data = threadListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadListReqIdl build(boolean z) {
            return new ThreadListReqIdl(this, z);
        }
    }
}
