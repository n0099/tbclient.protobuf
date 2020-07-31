package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class ThreadPublishReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ThreadPublishReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<ThreadPublishReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ThreadPublishReqIdl threadPublishReqIdl) {
            super(threadPublishReqIdl);
            if (threadPublishReqIdl != null) {
                this.data = threadPublishReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPublishReqIdl build(boolean z) {
            return new ThreadPublishReqIdl(this, z);
        }
    }
}
