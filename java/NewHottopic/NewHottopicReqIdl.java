package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class NewHottopicReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<NewHottopicReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(NewHottopicReqIdl newHottopicReqIdl) {
            super(newHottopicReqIdl);
            if (newHottopicReqIdl == null) {
                return;
            }
            this.data = newHottopicReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewHottopicReqIdl build(boolean z) {
            return new NewHottopicReqIdl(this, z);
        }
    }

    public NewHottopicReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
