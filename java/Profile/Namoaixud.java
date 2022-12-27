package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Namoaixud extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer is_end;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total_cash;
    public static final Integer DEFAULT_TOTAL_CASH = 0;
    public static final Integer DEFAULT_IS_END = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Namoaixud> {
        public Integer is_end;
        public Integer total_cash;

        public Builder() {
        }

        public Builder(Namoaixud namoaixud) {
            super(namoaixud);
            if (namoaixud == null) {
                return;
            }
            this.total_cash = namoaixud.total_cash;
            this.is_end = namoaixud.is_end;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Namoaixud build(boolean z) {
            return new Namoaixud(this, z);
        }
    }

    public Namoaixud(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.total_cash;
            if (num == null) {
                this.total_cash = DEFAULT_TOTAL_CASH;
            } else {
                this.total_cash = num;
            }
            Integer num2 = builder.is_end;
            if (num2 == null) {
                this.is_end = DEFAULT_IS_END;
                return;
            } else {
                this.is_end = num2;
                return;
            }
        }
        this.total_cash = builder.total_cash;
        this.is_end = builder.is_end;
    }
}
