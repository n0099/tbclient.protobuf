package tbclient.GetIconList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Setting extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer amount_pay_limit;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer vip_extra_percent;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer vip_extra_switch;
    public static final Integer DEFAULT_VIP_EXTRA_SWITCH = 0;
    public static final Integer DEFAULT_VIP_EXTRA_PERCENT = 0;
    public static final Integer DEFAULT_AMOUNT_PAY_LIMIT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Setting> {
        public Integer amount_pay_limit;
        public Integer vip_extra_percent;
        public Integer vip_extra_switch;

        public Builder() {
        }

        public Builder(Setting setting) {
            super(setting);
            if (setting == null) {
                return;
            }
            this.vip_extra_switch = setting.vip_extra_switch;
            this.vip_extra_percent = setting.vip_extra_percent;
            this.amount_pay_limit = setting.amount_pay_limit;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Setting build(boolean z) {
            return new Setting(this, z);
        }
    }

    public Setting(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.vip_extra_switch;
            if (num == null) {
                this.vip_extra_switch = DEFAULT_VIP_EXTRA_SWITCH;
            } else {
                this.vip_extra_switch = num;
            }
            Integer num2 = builder.vip_extra_percent;
            if (num2 == null) {
                this.vip_extra_percent = DEFAULT_VIP_EXTRA_PERCENT;
            } else {
                this.vip_extra_percent = num2;
            }
            Integer num3 = builder.amount_pay_limit;
            if (num3 == null) {
                this.amount_pay_limit = DEFAULT_AMOUNT_PAY_LIMIT;
                return;
            } else {
                this.amount_pay_limit = num3;
                return;
            }
        }
        this.vip_extra_switch = builder.vip_extra_switch;
        this.vip_extra_percent = builder.vip_extra_percent;
        this.amount_pay_limit = builder.amount_pay_limit;
    }
}
