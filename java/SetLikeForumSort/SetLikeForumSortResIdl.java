package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class SetLikeForumSortResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SetLikeForumSortResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetLikeForumSortResIdl setLikeForumSortResIdl) {
            super(setLikeForumSortResIdl);
            if (setLikeForumSortResIdl == null) {
                return;
            }
            this.error = setLikeForumSortResIdl.error;
            this.data = setLikeForumSortResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetLikeForumSortResIdl build(boolean z) {
            return new SetLikeForumSortResIdl(this, z);
        }
    }

    public SetLikeForumSortResIdl(Builder builder, boolean z) {
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
