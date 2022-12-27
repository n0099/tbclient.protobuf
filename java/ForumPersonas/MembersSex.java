package tbclient.ForumPersonas;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class MembersSex extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
    public final Double rate;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sex;
    public static final Integer DEFAULT_SEX = 0;
    public static final Double DEFAULT_RATE = Double.valueOf(0.0d);

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MembersSex> {
        public Double rate;
        public Integer sex;

        public Builder() {
        }

        public Builder(MembersSex membersSex) {
            super(membersSex);
            if (membersSex == null) {
                return;
            }
            this.sex = membersSex.sex;
            this.rate = membersSex.rate;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MembersSex build(boolean z) {
            return new MembersSex(this, z);
        }
    }

    public MembersSex(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num;
            }
            Double d = builder.rate;
            if (d == null) {
                this.rate = DEFAULT_RATE;
                return;
            } else {
                this.rate = d;
                return;
            }
        }
        this.sex = builder.sex;
        this.rate = builder.rate;
    }
}
