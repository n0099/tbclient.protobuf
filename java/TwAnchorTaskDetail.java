package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class TwAnchorTaskDetail extends Message {
    public static final String DEFAULT_DESCRIBE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String describe;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<TwAnchorTaskDetail> {
        public String describe;

        public Builder() {
        }

        public Builder(TwAnchorTaskDetail twAnchorTaskDetail) {
            super(twAnchorTaskDetail);
            if (twAnchorTaskDetail == null) {
                return;
            }
            this.describe = twAnchorTaskDetail.describe;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTaskDetail build(boolean z) {
            return new TwAnchorTaskDetail(this, z);
        }
    }

    public TwAnchorTaskDetail(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.describe;
            if (str == null) {
                this.describe = "";
                return;
            } else {
                this.describe = str;
                return;
            }
        }
        this.describe = builder.describe;
    }
}
