package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CheckRealNameReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private CheckRealNameReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<CheckRealNameReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(CheckRealNameReqIdl checkRealNameReqIdl) {
            super(checkRealNameReqIdl);
            if (checkRealNameReqIdl != null) {
                this.data = checkRealNameReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CheckRealNameReqIdl build(boolean z) {
            return new CheckRealNameReqIdl(this, z);
        }
    }
}
