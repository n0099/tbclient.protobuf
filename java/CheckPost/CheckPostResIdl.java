package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class CheckPostResIdl extends Message {
    @ProtoField(tag = 1)
    public final ResData data;
    @ProtoField(tag = 2)
    public final Error error;

    private CheckPostResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CheckPostResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(CheckPostResIdl checkPostResIdl) {
            super(checkPostResIdl);
            if (checkPostResIdl != null) {
                this.data = checkPostResIdl.data;
                this.error = checkPostResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CheckPostResIdl build(boolean z) {
            return new CheckPostResIdl(this, z);
        }
    }
}
