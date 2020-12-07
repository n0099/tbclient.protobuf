package tbclient.SetCommonForumState;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes22.dex */
public final class SetCommonForumStateResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SetCommonForumStateResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<SetCommonForumStateResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetCommonForumStateResIdl setCommonForumStateResIdl) {
            super(setCommonForumStateResIdl);
            if (setCommonForumStateResIdl != null) {
                this.error = setCommonForumStateResIdl.error;
                this.data = setCommonForumStateResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetCommonForumStateResIdl build(boolean z) {
            return new SetCommonForumStateResIdl(this, z);
        }
    }
}
