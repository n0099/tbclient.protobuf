package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class AnimationThread extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_VIDEO_PIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String video_pic;

    private AnimationThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.video_pic == null) {
                this.video_pic = "";
            } else {
                this.video_pic = builder.video_pic;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = builder.jump_url;
                return;
            }
        }
        this.video_pic = builder.video_pic;
        this.jump_url = builder.jump_url;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AnimationThread> {
        public String jump_url;
        public String video_pic;

        public Builder() {
        }

        public Builder(AnimationThread animationThread) {
            super(animationThread);
            if (animationThread != null) {
                this.video_pic = animationThread.video_pic;
                this.jump_url = animationThread.jump_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AnimationThread build(boolean z) {
            return new AnimationThread(this, z);
        }
    }
}
