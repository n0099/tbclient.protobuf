package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ThumbnailInfo extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer height;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThumbnailInfo> {
        public Integer height;
        public String url;
        public Integer width;

        public Builder() {
        }

        public Builder(ThumbnailInfo thumbnailInfo) {
            super(thumbnailInfo);
            if (thumbnailInfo == null) {
                return;
            }
            this.url = thumbnailInfo.url;
            this.width = thumbnailInfo.width;
            this.height = thumbnailInfo.height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThumbnailInfo build(boolean z) {
            return new ThumbnailInfo(this, z);
        }
    }

    public ThumbnailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
                return;
            } else {
                this.height = num2;
                return;
            }
        }
        this.url = builder.url;
        this.width = builder.width;
        this.height = builder.height;
    }
}
