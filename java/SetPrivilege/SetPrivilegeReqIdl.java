package tbclient.SetPrivilege;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SetPrivilegeReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private SetPrivilegeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SetPrivilegeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetPrivilegeReqIdl setPrivilegeReqIdl) {
            super(setPrivilegeReqIdl);
            if (setPrivilegeReqIdl != null) {
                this.data = setPrivilegeReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetPrivilegeReqIdl build(boolean z) {
            return new SetPrivilegeReqIdl(this, z);
        }
    }
}
