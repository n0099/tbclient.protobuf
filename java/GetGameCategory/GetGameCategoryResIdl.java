package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetGameCategoryResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GetGameCategoryResIdl(Builder builder, boolean z, GetGameCategoryResIdl getGameCategoryResIdl) {
        this(builder, z);
    }

    private GetGameCategoryResIdl(Builder builder, boolean z) {
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
    public final class Builder extends Message.Builder<GetGameCategoryResIdl> {
        public ResData data;
        public Error error;

        public Builder(GetGameCategoryResIdl getGameCategoryResIdl) {
            super(getGameCategoryResIdl);
            if (getGameCategoryResIdl != null) {
                this.error = getGameCategoryResIdl.error;
                this.data = getGameCategoryResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetGameCategoryResIdl build(boolean z) {
            return new GetGameCategoryResIdl(this, z, null);
        }
    }
}
