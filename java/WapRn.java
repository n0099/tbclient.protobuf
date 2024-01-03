package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class WapRn extends Message {
    public static final Integer DEFAULT_FRSRN = 0;
    public static final Integer DEFAULT_PBRN = 0;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer frsrn;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pbrn;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WapRn> {
        public Integer frsrn;
        public Integer pbrn;

        public Builder() {
        }

        public Builder(WapRn wapRn) {
            super(wapRn);
            if (wapRn == null) {
                return;
            }
            this.frsrn = wapRn.frsrn;
            this.pbrn = wapRn.pbrn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WapRn build(boolean z) {
            return new WapRn(this, z);
        }
    }

    public WapRn(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.frsrn;
            if (num == null) {
                this.frsrn = DEFAULT_FRSRN;
            } else {
                this.frsrn = num;
            }
            Integer num2 = builder.pbrn;
            if (num2 == null) {
                this.pbrn = DEFAULT_PBRN;
                return;
            } else {
                this.pbrn = num2;
                return;
            }
        }
        this.frsrn = builder.frsrn;
        this.pbrn = builder.pbrn;
    }
}
