package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class ForumMenuReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ ForumMenuReqIdl(Builder builder, boolean z, ForumMenuReqIdl forumMenuReqIdl) {
        this(builder, z);
    }

    private ForumMenuReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ForumMenuReqIdl> {
        public DataReq data;

        public Builder(ForumMenuReqIdl forumMenuReqIdl) {
            super(forumMenuReqIdl);
            if (forumMenuReqIdl != null) {
                this.data = forumMenuReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumMenuReqIdl build(boolean z) {
            return new ForumMenuReqIdl(this, z, null);
        }
    }
}
