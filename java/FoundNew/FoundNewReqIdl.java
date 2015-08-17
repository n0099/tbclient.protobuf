package tbclient.FoundNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FoundNewReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ FoundNewReqIdl(Builder builder, boolean z, FoundNewReqIdl foundNewReqIdl) {
        this(builder, z);
    }

    private FoundNewReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<FoundNewReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(FoundNewReqIdl foundNewReqIdl) {
            super(foundNewReqIdl);
            if (foundNewReqIdl != null) {
                this.data = foundNewReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FoundNewReqIdl build(boolean z) {
            return new FoundNewReqIdl(this, z, null);
        }
    }
}
