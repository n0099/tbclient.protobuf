package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ThreadIdListInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_partial_visible;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long tid;
    public static final Long DEFAULT_TID = 0L;
    public static final Integer DEFAULT_IS_PARTIAL_VISIBLE = 0;

    /* synthetic */ ThreadIdListInfo(Builder builder, boolean z, ThreadIdListInfo threadIdListInfo) {
        this(builder, z);
    }

    private ThreadIdListInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.is_partial_visible == null) {
                this.is_partial_visible = DEFAULT_IS_PARTIAL_VISIBLE;
                return;
            } else {
                this.is_partial_visible = builder.is_partial_visible;
                return;
            }
        }
        this.tid = builder.tid;
        this.is_partial_visible = builder.is_partial_visible;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThreadIdListInfo> {
        public Integer is_partial_visible;
        public Long tid;

        public Builder() {
        }

        public Builder(ThreadIdListInfo threadIdListInfo) {
            super(threadIdListInfo);
            if (threadIdListInfo != null) {
                this.tid = threadIdListInfo.tid;
                this.is_partial_visible = threadIdListInfo.is_partial_visible;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadIdListInfo build(boolean z) {
            return new ThreadIdListInfo(this, z, null);
        }
    }
}
