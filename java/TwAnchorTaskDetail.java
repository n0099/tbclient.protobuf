package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class TwAnchorTaskDetail extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String describe;

    private TwAnchorTaskDetail(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.describe == null) {
                this.describe = "";
                return;
            } else {
                this.describe = builder.describe;
                return;
            }
        }
        this.describe = builder.describe;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<TwAnchorTaskDetail> {
        public String describe;

        public Builder() {
        }

        public Builder(TwAnchorTaskDetail twAnchorTaskDetail) {
            super(twAnchorTaskDetail);
            if (twAnchorTaskDetail != null) {
                this.describe = twAnchorTaskDetail.describe;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTaskDetail build(boolean z) {
            return new TwAnchorTaskDetail(this, z);
        }
    }
}
