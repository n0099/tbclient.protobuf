package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Good extends Message {
    public static final Integer DEFAULT_NUM = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;

    private Good(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = builder.num;
                return;
            }
        }
        this.num = builder.num;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Good> {
        public Integer num;

        public Builder() {
        }

        public Builder(Good good) {
            super(good);
            if (good != null) {
                this.num = good.num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Good build(boolean z) {
            return new Good(this, z);
        }
    }
}
