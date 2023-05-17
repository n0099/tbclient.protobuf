package tbclient.DelAllUserData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes10.dex */
public final class DelAllUserDataResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DelAllUserDataResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DelAllUserDataResIdl delAllUserDataResIdl) {
            super(delAllUserDataResIdl);
            if (delAllUserDataResIdl == null) {
                return;
            }
            this.error = delAllUserDataResIdl.error;
            this.data = delAllUserDataResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DelAllUserDataResIdl build(boolean z) {
            return new DelAllUserDataResIdl(this, z);
        }
    }

    public DelAllUserDataResIdl(Builder builder, boolean z) {
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
