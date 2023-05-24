package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class VideoField extends Message {
    public static final String DEFAULT_MD5 = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer duration;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_vertical;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String md5;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer play_count;
    @ProtoField(tag = 6)
    public final ThumbnailInfo thumbnail;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_PLAY_COUNT = 0;
    public static final Integer DEFAULT_IS_VERTICAL = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<VideoField> {
        public Integer duration;
        public Integer height;
        public Integer is_vertical;
        public String md5;
        public Integer play_count;
        public ThumbnailInfo thumbnail;
        public String url;
        public Integer width;

        public Builder() {
        }

        public Builder(VideoField videoField) {
            super(videoField);
            if (videoField == null) {
                return;
            }
            this.url = videoField.url;
            this.duration = videoField.duration;
            this.width = videoField.width;
            this.height = videoField.height;
            this.play_count = videoField.play_count;
            this.thumbnail = videoField.thumbnail;
            this.is_vertical = videoField.is_vertical;
            this.md5 = videoField.md5;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoField build(boolean z) {
            return new VideoField(this, z);
        }
    }

    public VideoField(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Integer num = builder.duration;
            if (num == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num;
            }
            Integer num2 = builder.width;
            if (num2 == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num2;
            }
            Integer num3 = builder.height;
            if (num3 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num3;
            }
            Integer num4 = builder.play_count;
            if (num4 == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = num4;
            }
            this.thumbnail = builder.thumbnail;
            Integer num5 = builder.is_vertical;
            if (num5 == null) {
                this.is_vertical = DEFAULT_IS_VERTICAL;
            } else {
                this.is_vertical = num5;
            }
            String str2 = builder.md5;
            if (str2 == null) {
                this.md5 = "";
                return;
            } else {
                this.md5 = str2;
                return;
            }
        }
        this.url = builder.url;
        this.duration = builder.duration;
        this.width = builder.width;
        this.height = builder.height;
        this.play_count = builder.play_count;
        this.thumbnail = builder.thumbnail;
        this.is_vertical = builder.is_vertical;
        this.md5 = builder.md5;
    }
}
