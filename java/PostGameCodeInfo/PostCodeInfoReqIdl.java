package tbclient.PostGameCodeInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PostCodeInfoReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ PostCodeInfoReqIdl(Builder builder, boolean z, PostCodeInfoReqIdl postCodeInfoReqIdl) {
        this(builder, z);
    }

    private PostCodeInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PostCodeInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PostCodeInfoReqIdl postCodeInfoReqIdl) {
            super(postCodeInfoReqIdl);
            if (postCodeInfoReqIdl != null) {
                this.data = postCodeInfoReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostCodeInfoReqIdl build(boolean z) {
            return new PostCodeInfoReqIdl(this, z, null);
        }
    }
}
