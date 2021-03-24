package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetMemberTaskListReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetMemberTaskListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetMemberTaskListReqIdl getMemberTaskListReqIdl) {
            super(getMemberTaskListReqIdl);
            if (getMemberTaskListReqIdl == null) {
                return;
            }
            this.data = getMemberTaskListReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetMemberTaskListReqIdl build(boolean z) {
            return new GetMemberTaskListReqIdl(this, z);
        }
    }

    public GetMemberTaskListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
