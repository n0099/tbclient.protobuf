package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class MediaInfo extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<MediaInfo> {
        public String pic_url;
        public Integer type;

        public Builder() {
        }

        public Builder(MediaInfo mediaInfo) {
            super(mediaInfo);
            if (mediaInfo == null) {
                return;
            }
            this.type = mediaInfo.type;
            this.pic_url = mediaInfo.pic_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MediaInfo build(boolean z) {
            return new MediaInfo(this, z);
        }
    }

    public MediaInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
                return;
            } else {
                this.pic_url = str;
                return;
            }
        }
        this.type = builder.type;
        this.pic_url = builder.pic_url;
    }
}
