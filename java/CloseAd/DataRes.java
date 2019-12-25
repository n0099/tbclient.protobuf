package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VipCloseAd;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final VipCloseAd vip_close_ad;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.vip_close_ad = builder.vip_close_ad;
        } else {
            this.vip_close_ad = builder.vip_close_ad;
        }
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public VipCloseAd vip_close_ad;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.vip_close_ad = dataRes.vip_close_ad;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
