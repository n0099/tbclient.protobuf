package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_PUSH_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer push_type;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.push_type == null) {
                this.push_type = DEFAULT_PUSH_TYPE;
                return;
            } else {
                this.push_type = builder.push_type;
                return;
            }
        }
        this.push_type = builder.push_type;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer push_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.push_type = dataRes.push_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
