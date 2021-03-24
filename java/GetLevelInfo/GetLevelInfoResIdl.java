package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GetLevelInfoResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetLevelInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLevelInfoResIdl getLevelInfoResIdl) {
            super(getLevelInfoResIdl);
            if (getLevelInfoResIdl == null) {
                return;
            }
            this.data = getLevelInfoResIdl.data;
            this.error = getLevelInfoResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetLevelInfoResIdl build(boolean z) {
            return new GetLevelInfoResIdl(this, z);
        }
    }

    public GetLevelInfoResIdl(Builder builder, boolean z) {
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
