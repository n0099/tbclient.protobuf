package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class GetUserFreeChanceResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<GetUserFreeChanceResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserFreeChanceResIdl getUserFreeChanceResIdl) {
            super(getUserFreeChanceResIdl);
            if (getUserFreeChanceResIdl == null) {
                return;
            }
            this.data = getUserFreeChanceResIdl.data;
            this.error = getUserFreeChanceResIdl.error;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetUserFreeChanceResIdl build(boolean z) {
            return new GetUserFreeChanceResIdl(this, z);
        }
    }

    public GetUserFreeChanceResIdl(Builder builder, boolean z) {
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
