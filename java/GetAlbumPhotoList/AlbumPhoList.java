package tbclient.GetAlbumPhotoList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class AlbumPhoList extends Message {
    public static final String DEFAULT_ALBUM_ID = "";
    public static final String DEFAULT_BIG_PIC = "";
    public static final String DEFAULT_PICTURE_ID = "";
    public static final String DEFAULT_SMALL_PIC = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String album_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String big_pic;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String picture_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String small_pic;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AlbumPhoList> {
        public String album_id;
        public String big_pic;
        public String picture_id;
        public String small_pic;

        public Builder() {
        }

        public Builder(AlbumPhoList albumPhoList) {
            super(albumPhoList);
            if (albumPhoList == null) {
                return;
            }
            this.picture_id = albumPhoList.picture_id;
            this.album_id = albumPhoList.album_id;
            this.small_pic = albumPhoList.small_pic;
            this.big_pic = albumPhoList.big_pic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlbumPhoList build(boolean z) {
            return new AlbumPhoList(this, z);
        }
    }

    public AlbumPhoList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.picture_id;
            if (str == null) {
                this.picture_id = "";
            } else {
                this.picture_id = str;
            }
            String str2 = builder.album_id;
            if (str2 == null) {
                this.album_id = "";
            } else {
                this.album_id = str2;
            }
            String str3 = builder.small_pic;
            if (str3 == null) {
                this.small_pic = "";
            } else {
                this.small_pic = str3;
            }
            String str4 = builder.big_pic;
            if (str4 == null) {
                this.big_pic = "";
                return;
            } else {
                this.big_pic = str4;
                return;
            }
        }
        this.picture_id = builder.picture_id;
        this.album_id = builder.album_id;
        this.small_pic = builder.small_pic;
        this.big_pic = builder.big_pic;
    }
}
