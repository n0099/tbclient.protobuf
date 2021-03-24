package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HeadImgs extends Message {
    public static final String DEFAULT_BTN_TEXT = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_PC_URL = "";
    public static final String DEFAULT_SCHEMA = "";
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
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String subtitle;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tag_name_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag_name_wh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HeadImgs> {
        public String btn_text;
        public String img_url;
        public String pc_url;
        public String schema;
        public String subtitle;
        public String tag_name_url;
        public String tag_name_wh;
        public String title;

        public Builder() {
        }

        public Builder(HeadImgs headImgs) {
            super(headImgs);
            if (headImgs == null) {
                return;
            }
            this.img_url = headImgs.img_url;
            this.pc_url = headImgs.pc_url;
            this.title = headImgs.title;
            this.subtitle = headImgs.subtitle;
            this.btn_text = headImgs.btn_text;
            this.tag_name_url = headImgs.tag_name_url;
            this.tag_name_wh = headImgs.tag_name_wh;
            this.schema = headImgs.schema;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HeadImgs build(boolean z) {
            return new HeadImgs(this, z);
        }
    }

    public HeadImgs(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            String str2 = builder.pc_url;
            if (str2 == null) {
                this.pc_url = "";
            } else {
                this.pc_url = str2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            String str4 = builder.subtitle;
            if (str4 == null) {
                this.subtitle = "";
            } else {
                this.subtitle = str4;
            }
            String str5 = builder.btn_text;
            if (str5 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str5;
            }
            String str6 = builder.tag_name_url;
            if (str6 == null) {
                this.tag_name_url = "";
            } else {
                this.tag_name_url = str6;
            }
            String str7 = builder.tag_name_wh;
            if (str7 == null) {
                this.tag_name_wh = "";
            } else {
                this.tag_name_wh = str7;
            }
            String str8 = builder.schema;
            if (str8 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str8;
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
        this.schema = builder.schema;
    }
}
