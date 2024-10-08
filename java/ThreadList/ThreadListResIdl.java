package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class ThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ThreadListResIdl threadListResIdl) {
            super(threadListResIdl);
            if (threadListResIdl == null) {
                return;
            }
            this.error = threadListResIdl.error;
            this.data = threadListResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadListResIdl build(boolean z) {
            return new ThreadListResIdl(this, z);
        }
    }

    public ThreadListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
