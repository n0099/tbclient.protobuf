package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AlbumElement extends Message {
    public static final String DEFAULT_ALBUM_THUMB_URL = "";
    public static final String DEFAULT_ALBUM_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer album_height;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String album_thumb_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer album_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_url;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer album_width;
    public static final Integer DEFAULT_ALBUM_TYPE = 0;
    public static final Integer DEFAULT_ALBUM_HEIGHT = 0;
    public static final Integer DEFAULT_ALBUM_WIDTH = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlbumElement> {
        public Integer album_height;
        public String album_thumb_url;
        public Integer album_type;
        public String album_url;
        public Integer album_width;

        public Builder() {
        }

        public Builder(AlbumElement albumElement) {
            super(albumElement);
            if (albumElement == null) {
                return;
            }
            this.album_type = albumElement.album_type;
            this.album_url = albumElement.album_url;
            this.album_thumb_url = albumElement.album_thumb_url;
            this.album_height = albumElement.album_height;
            this.album_width = albumElement.album_width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumElement build(boolean z) {
            return new AlbumElement(this, z);
        }
    }

    public AlbumElement(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.album_type;
            if (num == null) {
                this.album_type = DEFAULT_ALBUM_TYPE;
            } else {
                this.album_type = num;
            }
            String str = builder.album_url;
            if (str == null) {
                this.album_url = "";
            } else {
                this.album_url = str;
            }
            String str2 = builder.album_thumb_url;
            if (str2 == null) {
                this.album_thumb_url = "";
            } else {
                this.album_thumb_url = str2;
            }
            Integer num2 = builder.album_height;
            if (num2 == null) {
                this.album_height = DEFAULT_ALBUM_HEIGHT;
            } else {
                this.album_height = num2;
            }
            Integer num3 = builder.album_width;
            if (num3 == null) {
                this.album_width = DEFAULT_ALBUM_WIDTH;
                return;
            } else {
                this.album_width = num3;
                return;
            }
        }
        this.album_type = builder.album_type;
        this.album_url = builder.album_url;
        this.album_thumb_url = builder.album_thumb_url;
        this.album_height = builder.album_height;
        this.album_width = builder.album_width;
    }
}
