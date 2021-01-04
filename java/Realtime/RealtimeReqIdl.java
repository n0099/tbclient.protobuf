package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RealtimeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private RealtimeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RealtimeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RealtimeReqIdl realtimeReqIdl) {
            super(realtimeReqIdl);
            if (realtimeReqIdl != null) {
                this.data = realtimeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RealtimeReqIdl build(boolean z) {
            return new RealtimeReqIdl(this, z);
        }
    }
}
