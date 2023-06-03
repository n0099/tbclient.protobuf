package tbclient.AddPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class AddPostResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AddPostResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddPostResIdl addPostResIdl) {
            super(addPostResIdl);
            if (addPostResIdl == null) {
                return;
            }
            this.error = addPostResIdl.error;
            this.data = addPostResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddPostResIdl build(boolean z) {
            return new AddPostResIdl(this, z);
        }
    }

    public AddPostResIdl(Builder builder, boolean z) {
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
