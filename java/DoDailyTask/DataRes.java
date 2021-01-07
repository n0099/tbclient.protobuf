package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final RetDataList ret_data;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.ret_data = builder.ret_data;
        } else {
            this.ret_data = builder.ret_data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public RetDataList ret_data;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.ret_data = dataRes.ret_data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
