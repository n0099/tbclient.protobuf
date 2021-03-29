package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ShowLiveSecondPageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ShowLiveSecondPageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ShowLiveSecondPageReqIdl showLiveSecondPageReqIdl) {
            super(showLiveSecondPageReqIdl);
            if (showLiveSecondPageReqIdl == null) {
                return;
            }
            this.data = showLiveSecondPageReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShowLiveSecondPageReqIdl build(boolean z) {
            return new ShowLiveSecondPageReqIdl(this, z);
        }
    }

    public ShowLiveSecondPageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}
