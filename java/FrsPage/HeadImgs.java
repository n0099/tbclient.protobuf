package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class HeadImgs extends Message {
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_PC_URL = "";
    public static final String DEFAULT_SUBTITLE = "";
    public static final String DEFAULT_TAG_NAME_URL = "";
    public static final String DEFAULT_TAG_NAME_WH = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pc_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    private HeadImgs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.pc_url == null) {
                this.pc_url = "";
            } else {
                this.pc_url = builder.pc_url;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.subtitle == null) {
                this.subtitle = "";
            } else {
                this.subtitle = builder.subtitle;
            }
            if (builder.btn_text == null) {
                this.btn_text = "";
            } else {
                this.btn_text = builder.btn_text;
            }
            if (builder.tag_name_url == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = builder.tag_name_url;
            }
            if (builder.tag_name_wh == null) {
                this.tag_name_wh = "";
                return;
            } else {
                this.tag_name_wh = builder.tag_name_wh;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.pc_url = builder.pc_url;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.btn_text = builder.btn_text;
        this.tag_name_url = builder.tag_name_url;
        this.tag_name_wh = builder.tag_name_wh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HeadImgs> {
        public String btn_text;
        public String img_url;
        public String pc_url;
        public String subtitle;
        public String tag_name_url;
        public String tag_name_wh;
        public String title;

        public Builder() {
        }

        public Builder(HeadImgs headImgs) {
            super(headImgs);
            if (headImgs != null) {
                this.img_url = headImgs.img_url;
                this.pc_url = headImgs.pc_url;
                this.title = headImgs.title;
                this.subtitle = headImgs.subtitle;
                this.btn_text = headImgs.btn_text;
                this.tag_name_url = headImgs.tag_name_url;
                this.tag_name_wh = headImgs.tag_name_wh;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadImgs build(boolean z) {
            return new HeadImgs(this, z);
        }
    }
}
