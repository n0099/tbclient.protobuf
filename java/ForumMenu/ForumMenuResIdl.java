package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class ForumMenuResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ForumMenuResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ForumMenuResIdl forumMenuResIdl) {
            super(forumMenuResIdl);
            if (forumMenuResIdl == null) {
                return;
            }
            this.error = forumMenuResIdl.error;
            this.data = forumMenuResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMenuResIdl build(boolean z) {
            return new ForumMenuResIdl(this, z);
        }
    }

    public ForumMenuResIdl(Builder builder, boolean z) {
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
