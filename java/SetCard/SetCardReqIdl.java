package tbclient.SetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SetCardReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SetCardReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetCardReqIdl setCardReqIdl) {
            super(setCardReqIdl);
            if (setCardReqIdl == null) {
                return;
            }
            this.data = setCardReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetCardReqIdl build(boolean z) {
            return new SetCardReqIdl(this, z);
        }
    }

    public SetCardReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
