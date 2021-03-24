package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SgsRes1 extends Message {
    public static final Integer DEFAULT_AA = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer aa;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SgsRes1> {
        public Integer aa;

        public Builder() {
        }

        public Builder(SgsRes1 sgsRes1) {
            super(sgsRes1);
            if (sgsRes1 == null) {
                return;
            }
            this.aa = sgsRes1.aa;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SgsRes1 build(boolean z) {
            return new SgsRes1(this, z);
        }
    }

    public SgsRes1(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.aa;
            if (num == null) {
                this.aa = DEFAULT_AA;
                return;
            } else {
                this.aa = num;
                return;
            }
        }
        this.aa = builder.aa;
    }
}
