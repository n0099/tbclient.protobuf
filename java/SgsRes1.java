package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SgsRes1 extends Message {
    public static final Integer DEFAULT_AA = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer aa;

    /* synthetic */ SgsRes1(Builder builder, boolean z, SgsRes1 sgsRes1) {
        this(builder, z);
    }

    private SgsRes1(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.aa == null) {
                this.aa = DEFAULT_AA;
                return;
            } else {
                this.aa = builder.aa;
                return;
            }
        }
        this.aa = builder.aa;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SgsRes1> {
        public Integer aa;

        public Builder() {
        }

        public Builder(SgsRes1 sgsRes1) {
            super(sgsRes1);
            if (sgsRes1 != null) {
                this.aa = sgsRes1.aa;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SgsRes1 build(boolean z) {
            return new SgsRes1(this, z, null);
        }
    }
}
