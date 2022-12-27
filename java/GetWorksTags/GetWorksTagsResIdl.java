package tbclient.GetWorksTags;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class GetWorksTagsResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GetWorksTagsResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetWorksTagsResIdl getWorksTagsResIdl) {
            super(getWorksTagsResIdl);
            if (getWorksTagsResIdl == null) {
                return;
            }
            this.error = getWorksTagsResIdl.error;
            this.data = getWorksTagsResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetWorksTagsResIdl build(boolean z) {
            return new GetWorksTagsResIdl(this, z);
        }
    }

    public GetWorksTagsResIdl(Builder builder, boolean z) {
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
