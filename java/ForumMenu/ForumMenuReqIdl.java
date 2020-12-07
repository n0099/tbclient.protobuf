package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes26.dex */
public final class ForumMenuReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ForumMenuReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes26.dex */
    public static final class Builder extends Message.Builder<ForumMenuReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ForumMenuReqIdl forumMenuReqIdl) {
            super(forumMenuReqIdl);
            if (forumMenuReqIdl != null) {
                this.data = forumMenuReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMenuReqIdl build(boolean z) {
            return new ForumMenuReqIdl(this, z);
        }
    }
}
