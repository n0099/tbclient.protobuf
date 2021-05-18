package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final RedNotify notify_data;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public RedNotify notify_data;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.notify_data = dataRes.notify_data;
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
            this.notify_data = builder.notify_data;
        } else {
            this.notify_data = builder.notify_data;
        }
    }
}
