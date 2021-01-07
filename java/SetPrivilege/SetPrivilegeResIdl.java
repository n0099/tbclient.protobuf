package tbclient.SetPrivilege;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class SetPrivilegeResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SetPrivilegeResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SetPrivilegeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetPrivilegeResIdl setPrivilegeResIdl) {
            super(setPrivilegeResIdl);
            if (setPrivilegeResIdl != null) {
                this.error = setPrivilegeResIdl.error;
                this.data = setPrivilegeResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetPrivilegeResIdl build(boolean z) {
            return new SetPrivilegeResIdl(this, z);
        }
    }
}
