package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2)
    public final CLocalDialog local_dialog;
    @ProtoField(tag = 1)
    public final CPayType payType;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.payType = builder.payType;
            this.local_dialog = builder.local_dialog;
            return;
        }
        this.payType = builder.payType;
        this.local_dialog = builder.local_dialog;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public CLocalDialog local_dialog;
        public CPayType payType;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.payType = dataRes.payType;
                this.local_dialog = dataRes.local_dialog;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
