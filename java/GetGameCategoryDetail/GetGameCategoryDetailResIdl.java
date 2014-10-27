package tbclient.GetGameCategoryDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameCategoryDetailResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetGameCategoryDetailResIdl(Builder builder, boolean z, GetGameCategoryDetailResIdl getGameCategoryDetailResIdl) {
        this(builder, z);
    }

    private GetGameCategoryDetailResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetGameCategoryDetailResIdl> {
        public ResData data;
        public Error error;

        public Builder(GetGameCategoryDetailResIdl getGameCategoryDetailResIdl) {
            super(getGameCategoryDetailResIdl);
            if (getGameCategoryDetailResIdl != null) {
                this.error = getGameCategoryDetailResIdl.error;
                this.data = getGameCategoryDetailResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCategoryDetailResIdl build(boolean z) {
            return new GetGameCategoryDetailResIdl(this, z, null);
        }
    }
}
