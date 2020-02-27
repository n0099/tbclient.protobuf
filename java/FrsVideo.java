package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FrsVideo extends Message {
    @ProtoField(tag = 1)
    public final ActBtn video_act;

    private FrsVideo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.video_act = builder.video_act;
        } else {
            this.video_act = builder.video_act;
        }
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FrsVideo> {
        public ActBtn video_act;

        public Builder() {
        }

        public Builder(FrsVideo frsVideo) {
            super(frsVideo);
            if (frsVideo != null) {
                this.video_act = frsVideo.video_act;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsVideo build(boolean z) {
            return new FrsVideo(this, z);
        }
    }
}
