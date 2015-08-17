package tbclient.Unlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer type;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.type = builder.type;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long thread_id;
        public Integer type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_id = dataRes.thread_id;
                this.type = dataRes.type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
