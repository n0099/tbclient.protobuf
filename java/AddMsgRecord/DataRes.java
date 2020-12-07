package tbclient.AddMsgRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_STATUS = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.status == null) {
                this.status = DEFAULT_STATUS;
                return;
            } else {
                this.status = builder.status;
                return;
            }
        }
        this.status = builder.status;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer status;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.status = dataRes.status;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
