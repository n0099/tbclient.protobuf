package tbclient.GetInterview;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetInterviewResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetInterviewResIdl(Builder builder, boolean z, GetInterviewResIdl getInterviewResIdl) {
        this(builder, z);
    }

    private GetInterviewResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetInterviewResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetInterviewResIdl getInterviewResIdl) {
            super(getInterviewResIdl);
            if (getInterviewResIdl != null) {
                this.error = getInterviewResIdl.error;
                this.data = getInterviewResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetInterviewResIdl build(boolean z) {
            return new GetInterviewResIdl(this, z, null);
        }
    }
}
