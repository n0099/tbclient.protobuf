package tbclient.SetLikeForumSort;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class SetLikeForumSortReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<SetLikeForumSortReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetLikeForumSortReqIdl setLikeForumSortReqIdl) {
            super(setLikeForumSortReqIdl);
            if (setLikeForumSortReqIdl == null) {
                return;
            }
            this.data = setLikeForumSortReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SetLikeForumSortReqIdl build(boolean z) {
            return new SetLikeForumSortReqIdl(this, z);
        }
    }

    public SetLikeForumSortReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
