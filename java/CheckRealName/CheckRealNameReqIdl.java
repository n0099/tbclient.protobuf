package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class CheckRealNameReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CheckRealNameReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CheckRealNameReqIdl checkRealNameReqIdl) {
            super(checkRealNameReqIdl);
            if (checkRealNameReqIdl == null) {
                return;
            }
            this.data = checkRealNameReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CheckRealNameReqIdl build(boolean z) {
            return new CheckRealNameReqIdl(this, z);
        }
    }

    public CheckRealNameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
