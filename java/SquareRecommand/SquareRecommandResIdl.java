package tbclient.SquareRecommand;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes3.dex */
public final class SquareRecommandResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private SquareRecommandResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<SquareRecommandResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SquareRecommandResIdl squareRecommandResIdl) {
            super(squareRecommandResIdl);
            if (squareRecommandResIdl != null) {
                this.error = squareRecommandResIdl.error;
                this.data = squareRecommandResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SquareRecommandResIdl build(boolean z) {
            return new SquareRecommandResIdl(this, z);
        }
    }
}
