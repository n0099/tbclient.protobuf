package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GetInterviewReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GetInterviewReqIdl(Builder builder, boolean z, GetInterviewReqIdl getInterviewReqIdl) {
        this(builder, z);
    }

    private GetInterviewReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetInterviewReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetInterviewReqIdl getInterviewReqIdl) {
            super(getInterviewReqIdl);
            if (getInterviewReqIdl != null) {
                this.data = getInterviewReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetInterviewReqIdl build(boolean z) {
            return new GetInterviewReqIdl(this, z, null);
        }
    }
}
