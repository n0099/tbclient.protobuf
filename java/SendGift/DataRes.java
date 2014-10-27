package tbclient.SendGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_MONEY = 0;
    public static final String DEFAULT_PUBLIC_KEY = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String public_key;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.money == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = builder.money;
            }
            if (builder.public_key == null) {
                this.public_key = "";
                return;
            } else {
                this.public_key = builder.public_key;
                return;
            }
        }
        this.money = builder.money;
        this.public_key = builder.public_key;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public Integer money;
        public String public_key;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.money = dataRes.money;
                this.public_key = dataRes.public_key;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
