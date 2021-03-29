package tbclient.GetFocus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes7.dex */
public final class GetFocusResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GetFocusResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetFocusResIdl getFocusResIdl) {
            super(getFocusResIdl);
            if (getFocusResIdl == null) {
                return;
            }
            this.error = getFocusResIdl.error;
            this.data = getFocusResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GetFocusResIdl build(boolean z) {
            return new GetFocusResIdl(this, z);
        }
    }

    public GetFocusResIdl(Builder builder, boolean z) {
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
