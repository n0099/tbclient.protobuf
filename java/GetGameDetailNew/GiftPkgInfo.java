package tbclient.GetGameDetailNew;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes11.dex */
public final class GiftPkgInfo extends Message {
    public static final Long DEFAULT_ACQUIRE_NUM = 0L;
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_CORNER_MARK = "";
    public static final String DEFAULT_GIFTPKG_NAME = "";
    public static final String DEFAULT_GIFTPKG_URL = "";
    public static final String DEFAULT_THUMBNAILS = "";
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long acquire_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String button_text;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String corner_mark;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String giftpkg_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String giftpkg_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String thumbnails;

    private GiftPkgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.giftpkg_name == null) {
                this.giftpkg_name = "";
            } else {
                this.giftpkg_name = builder.giftpkg_name;
            }
            if (builder.thumbnails == null) {
                this.thumbnails = "";
            } else {
                this.thumbnails = builder.thumbnails;
            }
            if (builder.acquire_num == null) {
                this.acquire_num = DEFAULT_ACQUIRE_NUM;
            } else {
                this.acquire_num = builder.acquire_num;
            }
            if (builder.corner_mark == null) {
                this.corner_mark = "";
            } else {
                this.corner_mark = builder.corner_mark;
            }
            if (builder.button_text == null) {
                this.button_text = "";
            } else {
                this.button_text = builder.button_text;
            }
            if (builder.giftpkg_url == null) {
                this.giftpkg_url = "";
                return;
            } else {
                this.giftpkg_url = builder.giftpkg_url;
                return;
            }
        }
        this.giftpkg_name = builder.giftpkg_name;
        this.thumbnails = builder.thumbnails;
        this.acquire_num = builder.acquire_num;
        this.corner_mark = builder.corner_mark;
        this.button_text = builder.button_text;
        this.giftpkg_url = builder.giftpkg_url;
    }

    /* loaded from: classes11.dex */
    public static final class Builder extends Message.Builder<GiftPkgInfo> {
        public Long acquire_num;
        public String button_text;
        public String corner_mark;
        public String giftpkg_name;
        public String giftpkg_url;
        public String thumbnails;

        public Builder() {
        }

        public Builder(GiftPkgInfo giftPkgInfo) {
            super(giftPkgInfo);
            if (giftPkgInfo != null) {
                this.giftpkg_name = giftPkgInfo.giftpkg_name;
                this.thumbnails = giftPkgInfo.thumbnails;
                this.acquire_num = giftPkgInfo.acquire_num;
                this.corner_mark = giftPkgInfo.corner_mark;
                this.button_text = giftPkgInfo.button_text;
                this.giftpkg_url = giftPkgInfo.giftpkg_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GiftPkgInfo build(boolean z) {
            return new GiftPkgInfo(this, z);
        }
    }
}
