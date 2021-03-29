package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final GiftInfo gift_info;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public GiftInfo gift_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.gift_info = dataRes.gift_info;
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
            this.gift_info = builder.gift_info;
        } else {
            this.gift_info = builder.gift_info;
        }
    }
}