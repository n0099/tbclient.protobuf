package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ThreadListResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private ThreadListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ThreadListResIdl threadListResIdl) {
            super(threadListResIdl);
            if (threadListResIdl != null) {
                this.error = threadListResIdl.error;
                this.data = threadListResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadListResIdl build(boolean z) {
            return new ThreadListResIdl(this, z);
        }
    }
}
