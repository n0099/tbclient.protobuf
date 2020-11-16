package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class UnreadTipReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private UnreadTipReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<UnreadTipReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UnreadTipReqIdl unreadTipReqIdl) {
            super(unreadTipReqIdl);
            if (unreadTipReqIdl != null) {
                this.data = unreadTipReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UnreadTipReqIdl build(boolean z) {
            return new UnreadTipReqIdl(this, z);
        }
    }
}
