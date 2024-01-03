package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class VideoImageColor extends Message {
    public static final String DEFAULT_COLOR = "";
    public static final Integer DEFAULT_TIME = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String color;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer time;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoImageColor> {
        public String color;
        public Integer time;

        public Builder() {
        }

        public Builder(VideoImageColor videoImageColor) {
            super(videoImageColor);
            if (videoImageColor == null) {
                return;
            }
            this.time = videoImageColor.time;
            this.color = videoImageColor.color;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoImageColor build(boolean z) {
            return new VideoImageColor(this, z);
        }
    }

    public VideoImageColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            String str = builder.color;
            if (str == null) {
                this.color = "";
                return;
            } else {
                this.color = str;
                return;
            }
        }
        this.time = builder.time;
        this.color = builder.color;
    }
}
