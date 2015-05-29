package tbclient.PostGameCodeInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class PostCodeInfoResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ PostCodeInfoResIdl(Builder builder, boolean z, PostCodeInfoResIdl postCodeInfoResIdl) {
        this(builder, z);
    }

    private PostCodeInfoResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<PostCodeInfoResIdl> {
        public ResData data;
        public Error error;

        public Builder(PostCodeInfoResIdl postCodeInfoResIdl) {
            super(postCodeInfoResIdl);
            if (postCodeInfoResIdl != null) {
                this.error = postCodeInfoResIdl.error;
                this.data = postCodeInfoResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostCodeInfoResIdl build(boolean z) {
            return new PostCodeInfoResIdl(this, z, null);
        }
    }
}
