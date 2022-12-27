package tbclient.AddPollPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class AddPollPostResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AddPollPostResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddPollPostResIdl addPollPostResIdl) {
            super(addPollPostResIdl);
            if (addPollPostResIdl == null) {
                return;
            }
            this.data = addPollPostResIdl.data;
            this.error = addPollPostResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPollPostResIdl build(boolean z) {
            return new AddPollPostResIdl(this, z);
        }
    }

    public AddPollPostResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }
}
