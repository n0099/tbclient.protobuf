package tbclient.DelMyGame;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DelMyGameReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ DelMyGameReqIdl(Builder builder, boolean z, DelMyGameReqIdl delMyGameReqIdl) {
        this(builder, z);
    }

    private DelMyGameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DelMyGameReqIdl> {
        public DataReq data;

        public Builder(DelMyGameReqIdl delMyGameReqIdl) {
            super(delMyGameReqIdl);
            if (delMyGameReqIdl != null) {
                this.data = delMyGameReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DelMyGameReqIdl build(boolean z) {
            return new DelMyGameReqIdl(this, z, null);
        }
    }
}
