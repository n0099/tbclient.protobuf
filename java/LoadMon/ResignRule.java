package tbclient.LoadMon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ResignRule extends Message {
    public static final Integer DEFAULT_CARD_NUM = 0;
    public static final String DEFAULT_RANGE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer card_num;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String range;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ResignRule> {
        public Integer card_num;
        public String range;

        public Builder() {
        }

        public Builder(ResignRule resignRule) {
            super(resignRule);
            if (resignRule == null) {
                return;
            }
            this.range = resignRule.range;
            this.card_num = resignRule.card_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResignRule build(boolean z) {
            return new ResignRule(this, z);
        }
    }

    public ResignRule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.range;
            if (str == null) {
                this.range = "";
            } else {
                this.range = str;
            }
            Integer num = builder.card_num;
            if (num == null) {
                this.card_num = DEFAULT_CARD_NUM;
                return;
            } else {
                this.card_num = num;
                return;
            }
        }
        this.range = builder.range;
        this.card_num = builder.card_num;
    }
}
