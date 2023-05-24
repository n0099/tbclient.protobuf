package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class MemberBlockInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_auto_pay;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_ban;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_permanent_ban;
    public static final Integer DEFAULT_IS_PERMANENT_BAN = 0;
    public static final Integer DEFAULT_IS_AUTO_PAY = 0;
    public static final Integer DEFAULT_IS_BAN = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MemberBlockInfo> {
        public Integer is_auto_pay;
        public Integer is_ban;
        public Integer is_permanent_ban;

        public Builder() {
        }

        public Builder(MemberBlockInfo memberBlockInfo) {
            super(memberBlockInfo);
            if (memberBlockInfo == null) {
                return;
            }
            this.is_permanent_ban = memberBlockInfo.is_permanent_ban;
            this.is_auto_pay = memberBlockInfo.is_auto_pay;
            this.is_ban = memberBlockInfo.is_ban;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberBlockInfo build(boolean z) {
            return new MemberBlockInfo(this, z);
        }
    }

    public MemberBlockInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_permanent_ban;
            if (num == null) {
                this.is_permanent_ban = DEFAULT_IS_PERMANENT_BAN;
            } else {
                this.is_permanent_ban = num;
            }
            Integer num2 = builder.is_auto_pay;
            if (num2 == null) {
                this.is_auto_pay = DEFAULT_IS_AUTO_PAY;
            } else {
                this.is_auto_pay = num2;
            }
            Integer num3 = builder.is_ban;
            if (num3 == null) {
                this.is_ban = DEFAULT_IS_BAN;
                return;
            } else {
                this.is_ban = num3;
                return;
            }
        }
        this.is_permanent_ban = builder.is_permanent_ban;
        this.is_auto_pay = builder.is_auto_pay;
        this.is_ban = builder.is_ban;
    }
}
