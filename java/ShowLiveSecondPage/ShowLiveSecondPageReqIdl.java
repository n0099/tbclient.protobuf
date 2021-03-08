package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ShowLiveSecondPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private ShowLiveSecondPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ShowLiveSecondPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ShowLiveSecondPageReqIdl showLiveSecondPageReqIdl) {
            super(showLiveSecondPageReqIdl);
            if (showLiveSecondPageReqIdl != null) {
                this.data = showLiveSecondPageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowLiveSecondPageReqIdl build(boolean z) {
            return new ShowLiveSecondPageReqIdl(this, z);
        }
    }
}
