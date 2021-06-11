package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_STATUS = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer status;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.status = dataRes.status;
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
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
                return;
            } else {
                this.status = num;
                return;
            }
        }
        this.status = builder.status;
    }
}
