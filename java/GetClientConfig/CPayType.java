package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class CPayType extends Message {
    public static final Integer DEFAULT_PAY_TYPE = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer pay_type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CPayType> {
        public Integer pay_type;

        public Builder() {
        }

        public Builder(CPayType cPayType) {
            super(cPayType);
            if (cPayType == null) {
                return;
            }
            this.pay_type = cPayType.pay_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CPayType build(boolean z) {
            return new CPayType(this, z);
        }
    }

    public CPayType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.pay_type;
            if (num == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
                return;
            } else {
                this.pay_type = num;
                return;
            }
        }
        this.pay_type = builder.pay_type;
    }
}
