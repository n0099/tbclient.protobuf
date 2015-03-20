package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HotForumReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ HotForumReqIdl(Builder builder, boolean z, HotForumReqIdl hotForumReqIdl) {
        this(builder, z);
    }

    private HotForumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<HotForumReqIdl> {
        public DataReq data;

        public Builder(HotForumReqIdl hotForumReqIdl) {
            super(hotForumReqIdl);
            if (hotForumReqIdl != null) {
                this.data = hotForumReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotForumReqIdl build(boolean z) {
            return new HotForumReqIdl(this, z, null);
        }
    }
}