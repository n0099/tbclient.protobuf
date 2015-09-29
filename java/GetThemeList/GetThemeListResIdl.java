package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetThemeListResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ GetThemeListResIdl(Builder builder, boolean z, GetThemeListResIdl getThemeListResIdl) {
        this(builder, z);
    }

    private GetThemeListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GetThemeListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetThemeListResIdl getThemeListResIdl) {
            super(getThemeListResIdl);
            if (getThemeListResIdl != null) {
                this.data = getThemeListResIdl.data;
                this.error = getThemeListResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetThemeListResIdl build(boolean z) {
            return new GetThemeListResIdl(this, z, null);
        }
    }
}
