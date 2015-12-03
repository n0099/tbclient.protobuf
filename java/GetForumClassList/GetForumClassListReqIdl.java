package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetForumClassListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetForumClassListReqIdl(Builder builder, boolean z, GetForumClassListReqIdl getForumClassListReqIdl) {
        this(builder, z);
    }

    private GetForumClassListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetForumClassListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumClassListReqIdl getForumClassListReqIdl) {
            super(getForumClassListReqIdl);
            if (getForumClassListReqIdl != null) {
                this.data = getForumClassListReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetForumClassListReqIdl build(boolean z) {
            return new GetForumClassListReqIdl(this, z, null);
        }
    }
}
