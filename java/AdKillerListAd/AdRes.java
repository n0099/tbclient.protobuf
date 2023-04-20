package tbclient.AdKillerListAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.App;
/* loaded from: classes9.dex */
public final class AdRes extends Message {
    public static final Integer DEFAULT_LIVE_IN_SECONDS = 0;
    @ProtoField(tag = 2)
    public final App app;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer live_in_seconds;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdRes> {
        public App app;
        public Integer live_in_seconds;

        public Builder() {
        }

        public Builder(AdRes adRes) {
            super(adRes);
            if (adRes == null) {
                return;
            }
            this.live_in_seconds = adRes.live_in_seconds;
            this.app = adRes.app;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdRes build(boolean z) {
            return new AdRes(this, z);
        }
    }

    public AdRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.live_in_seconds;
            if (num == null) {
                this.live_in_seconds = DEFAULT_LIVE_IN_SECONDS;
            } else {
                this.live_in_seconds = num;
            }
            this.app = builder.app;
            return;
        }
        this.live_in_seconds = builder.live_in_seconds;
        this.app = builder.app;
    }
}
