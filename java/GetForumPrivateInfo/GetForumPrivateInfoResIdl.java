package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetForumPrivateInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetForumPrivateInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumPrivateInfoResIdl getForumPrivateInfoResIdl) {
            super(getForumPrivateInfoResIdl);
            if (getForumPrivateInfoResIdl == null) {
                return;
            }
            this.error = getForumPrivateInfoResIdl.error;
            this.data = getForumPrivateInfoResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumPrivateInfoResIdl build(boolean z) {
            return new GetForumPrivateInfoResIdl(this, z);
        }
    }

    public GetForumPrivateInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
