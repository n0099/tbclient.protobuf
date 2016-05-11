package tbclient.GetFrsTabFollowPostNum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_THREAD_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer thread_num;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_num == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
                return;
            } else {
                this.thread_num = builder.thread_num;
                return;
            }
        }
        this.thread_num = builder.thread_num;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer thread_num;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_num = dataRes.thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
