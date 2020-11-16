package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class CPayType extends Message {
    public static final Integer DEFAULT_PAY_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pay_type;

    private CPayType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pay_type == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
                return;
            } else {
                this.pay_type = builder.pay_type;
                return;
            }
        }
        this.pay_type = builder.pay_type;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<CPayType> {
        public Integer pay_type;

        public Builder() {
        }

        public Builder(CPayType cPayType) {
            super(cPayType);
            if (cPayType != null) {
                this.pay_type = cPayType.pay_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CPayType build(boolean z) {
            return new CPayType(this, z);
        }
    }
}
