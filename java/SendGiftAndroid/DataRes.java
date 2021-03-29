package tbclient.SendGiftAndroid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_MONEY = 0;
    public static final String DEFAULT_PUBLIC_KEY = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String public_key;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer money;
        public String public_key;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.money = dataRes.money;
            this.public_key = dataRes.public_key;
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
            Integer num = builder.money;
            if (num == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = num;
            }
            String str = builder.public_key;
            if (str == null) {
                this.public_key = "";
                return;
            } else {
                this.public_key = str;
                return;
            }
        }
        this.money = builder.money;
        this.public_key = builder.public_key;
    }
}
