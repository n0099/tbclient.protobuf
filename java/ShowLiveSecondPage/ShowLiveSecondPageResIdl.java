package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes2.dex */
public final class ShowLiveSecondPageResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private ShowLiveSecondPageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ShowLiveSecondPageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ShowLiveSecondPageResIdl showLiveSecondPageResIdl) {
            super(showLiveSecondPageResIdl);
            if (showLiveSecondPageResIdl != null) {
                this.error = showLiveSecondPageResIdl.error;
                this.data = showLiveSecondPageResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowLiveSecondPageResIdl build(boolean z) {
            return new ShowLiveSecondPageResIdl(this, z);
        }
    }
}
