package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class LiveMedia extends Message {
    @ProtoField(tag = 1)
    public final LiveVideoInfo video;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveMedia> {
        public LiveVideoInfo video;

        public Builder() {
        }

        public Builder(LiveMedia liveMedia) {
            super(liveMedia);
            if (liveMedia == null) {
                return;
            }
            this.video = liveMedia.video;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveMedia build(boolean z) {
            return new LiveMedia(this, z);
        }
    }

    public LiveMedia(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.video = builder.video;
        } else {
            this.video = builder.video;
        }
    }
}
