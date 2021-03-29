package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Discount extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer rebate;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer recharge;
    public static final Integer DEFAULT_RECHARGE = 0;
    public static final Integer DEFAULT_REBATE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Discount> {
        public Integer rebate;
        public Integer recharge;

        public Builder() {
        }

        public Builder(Discount discount) {
            super(discount);
            if (discount == null) {
                return;
            }
            this.recharge = discount.recharge;
            this.rebate = discount.rebate;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Discount build(boolean z) {
            return new Discount(this, z);
        }
    }

    public Discount(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.recharge;
            if (num == null) {
                this.recharge = DEFAULT_RECHARGE;
            } else {
                this.recharge = num;
            }
            Integer num2 = builder.rebate;
            if (num2 == null) {
                this.rebate = DEFAULT_REBATE;
                return;
            } else {
                this.rebate = num2;
                return;
            }
        }
        this.recharge = builder.recharge;
        this.rebate = builder.rebate;
    }
}
