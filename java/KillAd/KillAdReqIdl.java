package tbclient.KillAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class KillAdReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ KillAdReqIdl(Builder builder, boolean z, KillAdReqIdl killAdReqIdl) {
        this(builder, z);
    }

    private KillAdReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<KillAdReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(KillAdReqIdl killAdReqIdl) {
            super(killAdReqIdl);
            if (killAdReqIdl != null) {
                this.data = killAdReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public KillAdReqIdl build(boolean z) {
            return new KillAdReqIdl(this, z, null);
        }
    }
}
